package hu.bme.mit.inf.szolgint.neo4j;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.helpers.collection.IteratorUtil;
import org.neo4j.kernel.impl.util.FileUtils;

public class Neo4j {
	private String DB_PATH;

	GraphDatabaseService graphDb;

	public String getDB_PATH() {
		return DB_PATH;
	}

	public void setDB_PATH(String dB_PATH) {
		DB_PATH = dB_PATH;
	}

	/**
	 * @param dB_PATH
	 */
	public Neo4j(String dB_PATH) {
		super();
		DB_PATH = dB_PATH;
	}

	private static enum RelTypes implements RelationshipType {
		SYNONYM
	}

	public GraphDatabaseService openDB() {
		System.out.println("Opening database ...");

		graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(DB_PATH);
		registerShutdownHook(graphDb);

		return graphDb;
	}

	public void closeDB() {
		System.out.println("Closing database ...");
		graphDb.shutdown();
	}

	public void deleteDB() {
		try {
			FileUtils.deleteRecursively(new File(DB_PATH));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static void registerShutdownHook(final GraphDatabaseService graphDb) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				graphDb.shutdown();
			}
		});
	}

	public Node addNewWord(String word) {
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"Start of method addNewWord"));
		System.out.println(String.format("Trying to add new word (%s) to DB",
				word));

		graphDb = openDB();

		ExecutionEngine engine = new ExecutionEngine(graphDb);
		ExecutionResult result = engine
				.execute(String
						.format("START n=node(*) WHERE has(n.word) AND n.word = '%s' RETURN count(*)",
								word));

		Iterator<Long> row_number = result.columnAs("count(*)");
		
		Node newNode = null; 
		
		if (row_number.next() == 0) {
			Transaction tx = graphDb.beginTx();
			try {
				newNode = graphDb.createNode();
				newNode.setProperty("word", word);

				tx.success();
			} finally {
				tx.finish();
			}

		} else {
			System.out.println(String.format(
					"The word '%s' is already in the DB", word));
		}

		closeDB();
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"End of method addNewWord"));
		return newNode;
	}

	public void deleteWord(String word) {
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"Start of method deleteWord"));
		System.out.println(String.format(
				"Trying to delete node with property word (%s) from DB", word));
		graphDb = openDB();

		ExecutionEngine engine = new ExecutionEngine(graphDb);
		ExecutionResult result = engine.execute(String.format(
				"START n=node(*) WHERE has(n.word) AND n.word = '%s' RETURN n",
				word));

		Iterator<Node> n_column = result.columnAs("n");
		for (Node node : IteratorUtil.asIterable(n_column)) {
			System.out.println(String.format(
					"Deleting node with word property: %s",
					node.getProperty("word")));
			Transaction tx = graphDb.beginTx();

			try {
				node.delete();

				tx.success();
			} finally {
				tx.finish();
			}

		}

		closeDB();
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"End of method deleteWord"));
	}

	public List<Node> findWord(String word) {
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"Start of method findWord"));
		System.out.println(String.format(
				"Trying to find node with property word (%s) in DB", word));

		List<Node> node_list = new ArrayList<Node>();

		graphDb = openDB();

		String query = String
				// .format("START n=node(*) WHERE has(n.word) AND n.word =~ '.*%s.*' RETURN n",
				.format("START n=node(*) WHERE has(n.word) AND n.word = '%s' RETURN n",
						word);

		ExecutionEngine engine = new ExecutionEngine(graphDb);
		ExecutionResult result = engine.execute(query);

		Iterator<Node> nodes = result.columnAs("n");

		for (Node node : IteratorUtil.asIterable(nodes)) {
			System.out.println(String.format(
					"Adding word '%s' to the result list...",
					node.getProperty("word")));
			node_list.add(node);
		}

		closeDB();
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"End of method findWord"));
		return node_list;
	}

	public void addSynonymToWord(String synonym, String word) {
		Relationship relationship;

		// Ellenõrizzük, hogy léteznek-e már a szavak a DB-ben:
		List<Node> word_node = findWord(word);
		List<Node> synonym_node = findWord(synonym);
		
		// Ha a 'word' nem létezik, akkor létrehozzuk:
		if (word_node.isEmpty()) {
			addNewWord(word);
			word_node = findWord(word);
		}
		
		// Ha a 'synonym' nem létezik akkor létrehozzuk:
		if (synonym_node.isEmpty()) {
			addNewWord(synonym);
			synonym_node = findWord(synonym);
		}

		graphDb = openDB();

		/*
		 * Braintrees: ez így nem mûködik:
		 * Node node1 = word_node.get(0);
		 * Node node2 = synonym_node.get(0);
		 */

		Node node1 = graphDb.getNodeById(word_node.get(0).getId());
		Node node2 = graphDb.getNodeById(synonym_node.get(0).getId());

		Transaction tx = graphDb.beginTx();

		try {
			relationship = node1.createRelationshipTo(node2, RelTypes.SYNONYM);
			relationship = node2.createRelationshipTo(node1, RelTypes.SYNONYM);
			tx.success();
		} finally {
			tx.finish();
		}
		closeDB();
	}

	public List<Node> getAWordSynonyms(String word) {
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"Start of method getAWordSynonyms"));
		List<Node> synonym_list = new ArrayList<Node>();

		Node the_word = findWord(word).get(0);
		System.out.println(the_word.getId());

		graphDb = openDB();

		Node node = graphDb.getNodeById(the_word.getId());

		Iterable<Relationship> relationship_list = node
				.getRelationships(Neo4j.RelTypes.SYNONYM);

		for (Relationship relationship : relationship_list) {
			
			for (int i = 0; i < relationship.getNodes().length; i++) {
				Node i_node = relationship.getNodes()[i];
				if (i_node.getId()!=node.getId()) {
					System.out.println(i_node);
					synonym_list.add(i_node);
				}
			}

		}

		closeDB();
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"End of method getAWordSynonyms"));
		return synonym_list;
	}

	public List<Node> listAllWord() {
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"Start of method listAllWord"));

		List<Node> node_list = new ArrayList<Node>();

		graphDb = openDB();

		ExecutionEngine engine = new ExecutionEngine(graphDb);
		ExecutionResult result = engine.execute("START n=node(*) RETURN n");

		Iterator<Node> nodes = result.columnAs("n");

		for (Node node : IteratorUtil.asIterable(nodes)) {

			try {
				System.out.println(String.format("%s - %s", node,
						node.getProperty("word")));
			} catch (Exception e) {
				System.out.println(String.format("%s - %s", node, "None"));
				// e.printStackTrace();
			}
			node_list.add(node);
		}
		closeDB();
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"End of method listAllWord"));
		return node_list;
	}

	/*
	 * void removeData() { Transaction tx = graphDb.beginTx(); try {
	 * firstNode.getSingleRelationship(RelTypes.SYNONYM,
	 * Direction.OUTGOING).delete(); firstNode.delete(); secondNode.delete(); //
	 * END SNIPPET: removingData
	 * 
	 * tx.success(); } finally { tx.finish(); } }
	 */

}