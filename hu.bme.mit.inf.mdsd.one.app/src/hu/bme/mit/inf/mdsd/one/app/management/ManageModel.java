package hu.bme.mit.inf.mdsd.one.app.management;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;

import java.util.ArrayList;
import java.util.List;

import model.AgeGroup;
import model.Match;
import model.ModelFactory;
import model.Person;
import model.Role;
import model.Type;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.incquery.databinding.runtime.api.IncQueryObservables;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.swt.widgets.Text;

import databinding.getgoalcount.GetGoalCountMatch;
import databinding.getgoalcount.GetGoalCountMatcher;

public class ManageModel implements IManageModel {

	private ModelFactory factory;	
	private MainView view;
	private Match match;
	private Person referee;

	public void setReferee(Person referee) {
		this.referee = referee;
	}

	private String[] convert2StringArray(List<String> list) {
		String[] simpleArray = new String[list.size()];
		list.toArray(simpleArray);

		return simpleArray;
	}

	@Override
	public String[] getAgeGroupItems() {
		List<String> ageGroupItems = new ArrayList<String>();

		List<AgeGroup> ag = java.util.Arrays.asList(AgeGroup.values());

		for (int i = 0; i < ag.size(); i++) {
			ageGroupItems.add(ag.get(i).toString());
		}

		return convert2StringArray(ageGroupItems);
	}

	@Override
	public String[] getMatchTypeItems() {
		List<String> matchTypeItems = new ArrayList<String>();

		List<Type> ag = java.util.Arrays.asList(Type.values());

		for (int i = 0; i < ag.size(); i++) {
			matchTypeItems.add(ag.get(i).toString());
		}

		return convert2StringArray(matchTypeItems);
	}

	/**
	 * A konstruktorunk:
	 */
	public ManageModel(MainView view) {
		this.view = view;
		
		factory = ModelFactory.eINSTANCE;
		
		/* Tesztel�shez, majd ezt innen kiszedheted nyugodtan */
		ManageModelHelper helper = new ManageModelHelper(this);
		helper.readModelFromFile(ManageModelHelper.TESTMODEL);
		/**/
		
		referee = factory.createPerson();
		referee.setName("CSIRKE RUDOLF");		
	}

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {

		ManageModel manageModel = new ManageModel();

		Team homeTeam = manageModel.factory.createTeam();
		homeTeam.setName("1. FC VESZPR�M");

		Player player_01 = manageModel.factory.createPlayer();
		player_01.setShirtNo(1);
		player_01.setPosition(Position.FIELD_PLAYER);

		TeamMember teamMember_01 = manageModel.factory.createTeamMember();
		teamMember_01.setId(122398);
		teamMember_01.setName("KASZA VIKTOR");

		teamMember_01.setPlayerRole(player_01);

		Team visitorTeam = manageModel.factory.createTeam();
		visitorTeam.setName("MAFC");

		

		Person assistant = manageModel.factory.createPerson();
		assistant.setName("CZINDER IMRE");

		Person thirdReferee = manageModel.factory.createPerson();
		thirdReferee.setName("HORV�TH ZOLT�N (A)");

		Person supervisor = manageModel.factory.createPerson();
		supervisor.setName("NAGY LAJOS");

		Match match = manageModel.factory.createMatch();
		match.setHome(homeTeam);
		match.setVisitor(visitorTeam);

		match.setReferee(manageModel.referee);
		match.setAssistant(assistant);
		match.setThirdReferee(thirdReferee);
		match.setSupervisor(supervisor);

		match.setAgeGroup(AgeGroup.U13);
		match.setId(0);
		match.setType(Type.CUP);

		System.out.println(match.getReferee());

		System.out.println();

	}*/

	@Override
	public String getReferee() {
		return referee.getName();
	}

	@Override
	public void setReferee(Text text) {
		referee.setName(text.getText());		
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	@Override
	public void homeGoal(Role role, int time) {
		// TODO Auto-generated method stub
		System.out.println("homegoal");
	}

	@Override
	public void visitorGoal(Role role, int time) {
		// TODO Auto-generated method stub
		System.out.println("visitorgoal");
	}

	@Override
	public void homeYellowCard(Role role, int time) {
		// TODO Auto-generated method stub
		System.out.println("homeyellow");
	}

	@Override
	public void visitorYellowCard(Role role, int time) {
		// TODO Auto-generated method stub
		System.out.println("visitoryellow");
	}

	@Override
	public void homeRedCard(Role role, int time) {
		// TODO Auto-generated method stub
		System.out.println("homered");
	}

	@Override
	public void visitorRedCard(Role role, int time) {
		// TODO Auto-generated method stub
		System.out.println("visitorred");
	}	
}