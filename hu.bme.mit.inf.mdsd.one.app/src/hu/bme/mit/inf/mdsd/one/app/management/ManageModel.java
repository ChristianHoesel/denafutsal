package hu.bme.mit.inf.mdsd.one.app.management;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Text;

import model.Match;
import model.ModelFactory;
import model.Person;
import model.Player;
import model.Team;
import model.TeamMember;
import model.impl.ModelPackageImpl;

import model.Position;
import model.AgeGroup;
import model.Type;

public class ManageModel implements IManageModel {

	private ModelFactory factory;
	
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
	public ManageModel() {
		ModelPackageImpl.init();
		factory = ModelFactory.eINSTANCE;
		
		referee = factory.createPerson();
		referee.setName("CSIRKE RUDOLF");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ManageModel manageModel = new ManageModel();

		Team homeTeam = manageModel.factory.createTeam();
		homeTeam.setName("1. FC VESZPRÉM");

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
		thirdReferee.setName("HORVÁTH ZOLTÁN (A)");

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

	}

	@Override
	public String getReferee() {
		return referee.getName();
	}

	@Override
	public void setReferee(Text text) {
		referee.setName(text.getText());		
	}

}
