package hu.bme.mit.inf.szolgint.neo4j;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.graphdb.Direction;
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

	public void addNewWord(String word) {
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

		if (row_number.next() == 0) {
			Node newNode;
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
				//.format("START n=node(*) WHERE has(n.word) AND n.word =~ '.*%s.*' RETURN n",
				.format("START n=node(*) WHERE has(n.word) AND n.word = '%s' RETURN n",
						word);

		ExecutionEngine engine = new ExecutionEngine(graphDb);
		ExecutionResult result = engine.execute(query);

		Iterator<Node> nodes = result.columnAs("n");

		for (Node node : IteratorUtil.asIterable(nodes)) {
			System.out.println(node + ": " + node.getProperty("word"));
			node_list.add(node);
		}
		closeDB();
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"End of method findWord"));
		return node_list;
	}

	public void addSynonymToWord(String synonym, String word) {
		List<Node> word_node = findWord(word);
		List<Node> synonym_node = findWord(synonym);

		if (word_node.isEmpty()) {
			addNewWord(word);
			word_node = findWord(word);
		}

		if (synonym_node.isEmpty()) {
			addNewWord(synonym);
			synonym_node = findWord(synonym);
		}

		graphDb = openDB();

		Transaction tx = graphDb.beginTx();
		try {

			relationship = word_node.get(0).createRelationshipTo(
					synonym_node.get(0), RelTypes.SYNONYM);
			relationship = synonym_node.get(0).createRelationshipTo(
					word_node.get(0), RelTypes.SYNONYM);
			tx.success();
		} finally {
			tx.finish();
		}
		closeDB();
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
			node_list.add(node);
		}
		closeDB();
		System.out.println(String.format(
				"----  ----  ----  ----  %s ----  ----  ----  ----",
				"End of method listAllWord"));
		return node_list;
	}

	String greeting;
	// START SNIPPET: vars
	GraphDatabaseService graphDb;
	Node firstNode;
	Node secondNode;
	Relationship relationship;

	// END SNIPPET: vars

	// START SNIPPET: createReltype

	// END SNIPPET: createReltype

	void createDb() {

		graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(DB_PATH);
		registerShutdownHook(graphDb);

		// START SNIPPET: transaction
		Transaction tx = graphDb.beginTx();
		try {
			// Updating operations go here
			// END SNIPPET: transaction
			// START SNIPPET: addData
			firstNode = graphDb.createNode();
			firstNode.setProperty("message", "Hello, ");
			secondNode = graphDb.createNode();
			secondNode.setProperty("message", "World!");

			relationship = firstNode.createRelationshipTo(secondNode,
					RelTypes.SYNONYM);
			relationship.setProperty("message", "brave Neo4j ");
			// END SNIPPET: addData

			// START SNIPPET: readData
			System.out.print(firstNode.getProperty("message"));
			System.out.print(relationship.getProperty("message"));
			System.out.print(secondNode.getProperty("message"));
			// END SNIPPET: readData

			greeting = ((String) firstNode.getProperty("message"))
					+ ((String) relationship.getProperty("message"))
					+ ((String) secondNode.getProperty("message"));

			// START SNIPPET: transaction
			tx.success();
		} finally {
			tx.finish();
		}
		// END SNIPPET: transaction
	}

	void removeData() {
		Transaction tx = graphDb.beginTx();
		try {
			// START SNIPPET: removingData
			// let's remove the data
			firstNode.getSingleRelationship(RelTypes.SYNONYM,
					Direction.OUTGOING).delete();
			firstNode.delete();
			secondNode.delete();
			// END SNIPPET: removingData

			tx.success();
		} finally {
			tx.finish();
		}
	}

}