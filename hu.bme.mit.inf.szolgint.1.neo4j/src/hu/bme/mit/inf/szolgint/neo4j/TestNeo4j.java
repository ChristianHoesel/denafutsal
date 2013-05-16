package hu.bme.mit.inf.szolgint.neo4j;

import java.util.Iterator;
import java.util.List;

import org.neo4j.graphdb.Node;

public class TestNeo4j {

	/**
	 * @param args
	 */
    public static void main( final String[] args )
    {
        Neo4j jobs = new Neo4j("neo4j-jobs-db");
        
        
        // Új szó felvétele:
        /*
        jobs.addNewWord("Software engineer");
        jobs.addNewWord("Software developer");
        jobs.addNewWord("Software");
        jobs.addNewWord("Tészta");
        // Már létezõ szó felvétele:
        jobs.addNewWord("Software");
        
        // Szó törlése:
        jobs.deleteWord("Tészta");
        */
        // Szinonímák meghatározása:
        // Adott szóhoz új szó felvétele:
        jobs.addSynonymToWord("T1", "Ty1");
        
        //jobs.listAllWord();
        
        jobs.getAWordSynonyms("T1"); 
        
    }

}
