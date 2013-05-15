package hu.bme.mit.inf.szolgint.neo4j;

import java.net.URI;
import java.net.URISyntaxException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Neo4jREST neo4jREST = new Neo4jREST("http://localhost:7474");
		
		System.out.println(neo4jREST.getSERVER_ROOT_URI());
		
		if (neo4jREST.databaseIsRunning()) {
			System.out.println("The Neo4j server is running...");
			/*
			URI node_01 = neo4jREST.createNode();
			neo4jREST.addProperty(node_01, "word", "software engineer");
			neo4jREST.addProperty(node_01, "testproperty", "Test property");
			neo4jREST.deleteProperty(node_01, "testproperty");
			
			URI node_02 = neo4jREST.createNode();
			neo4jREST.addProperty(node_02, "word", "software developer");
			try {
				neo4jREST.addRelationship(node_01, node_02, "synonym", "{}");
				neo4jREST.addRelationship(node_02, node_01, "synonym", "{}");
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			
			URI node_03 = neo4jREST.createNode();
			neo4jREST.addProperty(node_03, "word", "software engineer");
						
			URI node_04 = neo4jREST.createNode();
			neo4jREST.addProperty(node_04, "word", "software developer");
					
			try {
				neo4jREST.addRelationship(node_03, node_04, "synonym", "{}");
				neo4jREST.addRelationship(node_04, node_03, "synonym", "{}");
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			
			try {
				neo4jREST.deleteRelationship(node_03);
				neo4jREST.deleteRelationship(node_04);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			neo4jREST.deleteNode(node_03);
			neo4jREST.deleteNode(node_04);
			
			URI node_05 = neo4jREST.createNode();
			neo4jREST.addProperty(node_05, "word", "KOl software developer");
			*/
			try {
				//System.out.println(neo4jREST.cypherQuery("START n=node(*) RETURN n"));
				System.out.println(neo4jREST.findNodeWithProperty("word", "software"));
				System.out.println(neo4jREST.findNodeWithProperty("word", "hardware"));
				System.out.println(neo4jREST.findNodeWithProperty("not_a_word", "hardware"));
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("The Neo4j server isn't running...");
		}
	}

}
