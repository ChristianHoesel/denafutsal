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
        
        
        // �j sz� felv�tele:
        /*
        jobs.addNewWord("Software engineer");
        jobs.addNewWord("Software developer");
        jobs.addNewWord("Software");
        jobs.addNewWord("T�szta");
        // M�r l�tez� sz� felv�tele:
        jobs.addNewWord("Software");
        
        // Sz� t�rl�se:
        jobs.deleteWord("T�szta");
        */
        // Szinon�m�k meghat�roz�sa:
        // Adott sz�hoz �j sz� felv�tele:
        jobs.addSynonymToWord("T1", "Ty1");
        
        //jobs.listAllWord();
        
        jobs.getAWordSynonyms("T1"); 
        
    }

}
