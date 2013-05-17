package hu.bme.mit.inf.mdsd.init.model;

import model.Match;
import model.ModelFactory;
import model.Person;
import model.Team;
import model.TeamMember;
import model.impl.ModelPackageImpl;

public class InitMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ModelPackageImpl.init();
		ModelFactory factory = ModelFactory.eINSTANCE;
					
		Match match = factory.createMatch();
						
		Person person_01 = factory.createPerson();
		person_01.setName("CSIRKE RUDOLF");
		
		
		Person person_02 = factory.createPerson();
			
		
		
		
		Team home = factory.createTeam();
		home.setName("1. FC VESZPRÉM");
		
		TeamMember teamMember = factory.createTeamMember();
		teamMember.setId(322932);
		teamMember.setName("RAJKI TAMÁS");

		
		Team visitor = factory.createTeam();
		
		
		
	}

}
