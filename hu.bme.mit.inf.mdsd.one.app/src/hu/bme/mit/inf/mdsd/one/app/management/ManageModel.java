package hu.bme.mit.inf.mdsd.one.app.management;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.AgeGroup;
import model.Match;
import model.ModelFactory;
import model.Person;
import model.Player;
import model.Position;
import model.Role;
import model.StaffRole;
import model.Team;
import model.TeamMember;
import model.Type;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.incquery.databinding.runtime.api.IncQueryObservables;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Text;

import databinding.getgoalcount.GetGoalCountMatch;
import databinding.getgoalcount.GetGoalCountMatcher;

public class ManageModel implements IManageModel {

	private ModelFactory factory;
	private MainView view;
	private Match match;

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

	@Override
	public String[] getStaffRoleItems() {
		List<String> staffRoleItems = new ArrayList<String>();

		List<StaffRole> sr = java.util.Arrays.asList(StaffRole.values());

		for (int i = 0; i < sr.size(); i++) {
			staffRoleItems.add(sr.get(i).toString());
		}

		return convert2StringArray(staffRoleItems);
	}

	/**
	 * A konstruktorunk:
	 */
	public ManageModel(MainView view) {
		this.view = view;

		factory = ModelFactory.eINSTANCE;

		/* Teszteléshez, majd ezt innen kiszedheted nyugodtan */
		// ManageModelHelper helper = new ManageModelHelper(this);
		// helper.readModelFromFile(ManageModelHelper.TESTMODEL);
		/**/

		match = factory.createMatch();

		// Bírók létrehozása:

		Person referee = factory.createPerson();
		referee.setName("*Done*");
		match.setReferee(referee);

		Person assistant = factory.createPerson();
		assistant.setName("*Done*");
		match.setAssistant(assistant);

		Person thirdReferee = factory.createPerson();
		thirdReferee.setName("*Done*");
		match.setThirdReferee(thirdReferee);

		Person supervisor = factory.createPerson();
		supervisor.setName("*Done*");
		match.setSupervisor(supervisor);

		match.setId(-1);
		match.setAgeGroup(AgeGroup.U17);
		match.setLocation("*Done*");
		match.setType(Type.LEAGUE);

		Date date = new Date();
		match.setDate(date);

		Team homeTeam = factory.createTeam();
		homeTeam.setName("*Done*");
		match.setHome(homeTeam);

		Team visitorTeam = factory.createTeam();
		visitorTeam.setName("*Done*");
		match.setVisitor(visitorTeam);

		for (int i = 0; i < 5; i++) {
			Player player = factory.createPlayer();
			player.setShirtNo(i);
			if (i == 0) {
				player.setPosition(Position.GOALKEEPER);
				match.getHome().setCaptain(player);
			} else {
				player.setPosition(Position.FIELD_PLAYER);
			}
			TeamMember teamMember = factory.createTeamMember();

			teamMember.setId(i);
			teamMember.setName(String.format("Player %d", i));

			teamMember.setPlayerRole(player);
			
			match.getHome().getMembers().add(teamMember);

			match.getHome().getStartingLine().add(player);
		}
		
		for (int i = 0; i < 5; i++) {
			Player player = factory.createPlayer();
			player.setShirtNo(i);
			if (i == 0) {
				player.setPosition(Position.GOALKEEPER);
				match.getVisitor().setCaptain(player);
			} else {
				player.setPosition(Position.FIELD_PLAYER);
			}
			TeamMember teamMember = factory.createTeamMember();

			teamMember.setId(i);
			teamMember.setName(String.format("Player %d", i));

			teamMember.setPlayerRole(player);

			match.getVisitor().getStartingLine().add(player);
		}

	}

	/**
	 * @param args
	 */
	/*
	 * public static void main(String[] args) {
	 * 
	 * ManageModel manageModel = new ManageModel();
	 * 
	 * Team homeTeam = manageModel.factory.createTeam();
	 * homeTeam.setName("1. FC VESZPRÉM");
	 * 
	 * Player player_01 = manageModel.factory.createPlayer();
	 * player_01.setShirtNo(1); player_01.setPosition(Position.FIELD_PLAYER);
	 * 
	 * TeamMember teamMember_01 = manageModel.factory.createTeamMember();
	 * teamMember_01.setId(122398); teamMember_01.setName("KASZA VIKTOR");
	 * 
	 * teamMember_01.setPlayerRole(player_01);
	 * 
	 * Team visitorTeam = manageModel.factory.createTeam();
	 * visitorTeam.setName("MAFC");
	 * 
	 * 
	 * 
	 * Person assistant = manageModel.factory.createPerson();
	 * assistant.setName("CZINDER IMRE");
	 * 
	 * Person thirdReferee = manageModel.factory.createPerson();
	 * thirdReferee.setName("HORVÁTH ZOLTÁN (A)");
	 * 
	 * Person supervisor = manageModel.factory.createPerson();
	 * supervisor.setName("NAGY LAJOS");
	 * 
	 * Match match = manageModel.factory.createMatch(); match.setHome(homeTeam);
	 * match.setVisitor(visitorTeam);
	 * 
	 * match.setReferee(manageModel.referee); match.setAssistant(assistant);
	 * match.setThirdReferee(thirdReferee); match.setSupervisor(supervisor);
	 * 
	 * match.setAgeGroup(AgeGroup.U13); match.setId(0); match.setType(Type.CUP);
	 * 
	 * System.out.println(match.getReferee());
	 * 
	 * System.out.println();
	 * 
	 * }
	 */

	@Override
	public String getRefereeText() {
		return match.getReferee().getName();
	}

	@Override
	public void setRefereeText(Text text) {
		match.getReferee().setName(text.getText());
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

	@Override
	public String getAssistantText() {
		return match.getAssistant().getName();
	}

	@Override
	public void setAssistantText(Text text) {
		match.getAssistant().setName(text.getText());
	}

	@Override
	public String getThirdRefereeRefereeText() {
		return match.getThirdReferee().getName();
	}

	@Override
	public void setThirdRefereeRefereeText(Text text) {
		match.getThirdReferee().setName(text.getText());
	}

	@Override
	public String getSupervisorText() {
		return match.getSupervisor().getName();
	}

	@Override
	public void setSupervisorText(Text text) {
		match.getSupervisor().setName(text.getText());
	}

	@Override
	public String getMatchIDText() {
		return Integer.toString(match.getId());
	}

	@Override
	public void setMatchIDText(Text text) {
		match.setId(Integer.parseInt(text.getText()));
	}

	@Override
	public String getAgeGroupCombo() {
		return match.getAgeGroup().getName();
	}

	@Override
	public void setAgeGroupCombo(Combo combo) {
		int cs = combo.getSelectionIndex();
		match.setAgeGroup(AgeGroup.get(cs));
	}

	@Override
	public String getAddressText() {
		return match.getLocation();
	}

	@Override
	public void setAddressText(Text text) {
		match.setLocation(text.getText());
	}

	@Override
	public String getTeamHomeText() {
		return match.getHome().getName();
	}

	@Override
	public void setTeamHomeText(Text text) {
		match.getHome().setName(text.getText());
	}

	@Override
	public String getTeamVisitorText() {
		return match.getVisitor().getName();
	}

	@Override
	public void setTeamVisitorText(Text text) {
		match.getVisitor().setName(text.getText());
	}

	@Override
	public String getStartH1NText() {
		return match.getHome().getStartingLine().get(0).getName();
	}

	@Override
	public void setStartH1NText(Text text) {
		match.getHome().getMembers().get(0).setName(text.getText());
	}

	@Override
	public String getIdH1StartText() {
		return String.valueOf(match.getHome().getMembers().get(0).getId());
	}

	@Override
	public void setIdH1StartText(Text text) {
		match.getHome().getMembers().get(0).setId(Integer.parseInt((text.getText())));
	}

	@Override
	public String getShirtH1StartText() {
		return String.valueOf(match.getHome().getStartingLine().get(0).getShirtNo());
	}

	@Override
	public void setShirtH1StartText(Text text) {
		match.getHome().getStartingLine().get(0)
				.setShirtNo(Integer.parseInt(text.getText()));

	}

	@Override
	public String getStartH2NText() {
		return match.getHome().getStartingLine().get(1).getName();
	}

	@Override
	public void setStartH2NText(Text text) {
		match.getHome().getMembers().get(1).setName(text.getText());
	}

	@Override
	public String getIdH2StartText() {
		return String.valueOf(match.getHome().getMembers().get(1).getId());
	}

	@Override
	public void setIdH2StartText(Text text) {
		match.getHome().getMembers().get(1).setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtH2StartText() {
		return String.valueOf(match.getHome().getStartingLine().get(1).getShirtNo());
	}

	@Override
	public void setShirtH2StartText(Text text) {
		match.getHome().getStartingLine().get(1).setShirtNo(Integer.parseInt(text.getText()));

	}

	@Override
	public String getStartH3NText() {
		return match.getHome().getStartingLine().get(2).getName();
	}

	@Override
	public void setStartH3NText(Text text) {
		match.getHome().getMembers().get(2).setName(text.getText());

	}

	@Override
	public String getIdH3StartText() {
		return String.valueOf(match.getHome().getMembers().get(2).getId());
	}

	@Override
	public void setIdH3StartText(Text text) {
		match.getHome().getMembers().get(2).setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtH3StartText() {
		return String.valueOf(match.getHome().getStartingLine().get(2).getShirtNo());
	}

	@Override
	public void setShirtH3StartText(Text text) {
		match.getHome().getStartingLine().get(2).setShirtNo(Integer.parseInt(text.getText()));

	}

	@Override
	public String getStartH4NText() {
		return match.getHome().getStartingLine().get(3).getName();
	}

	@Override
	public void setStartH4NText(Text text) {
		match.getHome().getMembers().get(3).setName(text.getText());
	}

	@Override
	public String getIdH4StartText() {
		return String.valueOf(match.getHome().getMembers().get(3).getId());
	}

	@Override
	public void setIdH4StartText(Text text) {
		match.getHome().getMembers().get(3).setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtH4StartText() {
		return String.valueOf(match.getHome().getStartingLine().get(3).getShirtNo());
	}

	@Override
	public void setShirtH4StartText(Text text) {
		match.getHome().getStartingLine().get(3).setShirtNo(Integer.parseInt(text.getText()));

	}

	@Override
	public String getStartH5NText() {
		return match.getHome().getStartingLine().get(4).getName();
	}

	@Override
	public void setStartH5NText(Text text) {
		match.getHome().getMembers().get(4).setName(text.getText());

	}

	@Override
	public String getIdH5StartText() {
		return String.valueOf(match.getHome().getMembers().get(4).getId());
	}

	@Override
	public void setIdH5StartText(Text text) {
		match.getHome().getMembers().get(4).setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtH5StartText() {
		return String.valueOf(match.getHome().getStartingLine().get(4).getShirtNo());
	}

	@Override
	public void setShirtH5StartText(Text text) {
		match.getHome().getStartingLine().get(4).setShirtNo(Integer.parseInt(text.getText()));

	}

	@Override
	public int getAgeGroupSelection() {
		return match.getAgeGroup().getValue();
	}

	@Override
	public String getMatchTypeCombo() {
		return match.getType().getName();
	}

	@Override
	public void setMatchTypeCombo(Combo combo) {
		int cs = combo.getSelectionIndex();
		match.setType(Type.get(cs));

	}

	@Override
	public int getMatchTyeSelection() {
		return match.getType().getValue();
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getYearOfDate() {
		return match.getDate().getYear();
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getMonthOfDate() {
		return match.getDate().getMonth();
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getDayOfDate() {
		return match.getDate().getDay();
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setDateDateTime(DateTime datetime) {
		match.setDate(new Date(datetime.getYear() - 1900, datetime.getMonth(),
				datetime.getDay()));

	}

	@Override
	public String getDateDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.");
		return dateFormat.format(match.getDate());
	}
	
	@Override
	public String getCaptainHome() {
		return match.getHome().getCaptain().getName();
	}
	
	@Override
	public Boolean getCpH1Start() {		
		return match.getHome().getStartingLine().get(0).equals(match.getHome().getCaptain());
	}

	@Override
	public void setCpH1Start() {
		match.getHome().setCaptain(match.getHome().getStartingLine().get(0));
	}

	@Override
	public Boolean getCpH2Start() {
		return match.getHome().getStartingLine().get(1).equals(match.getHome().getCaptain());
	}

	@Override
	public void setCpH2Start() {
		match.getHome().setCaptain(match.getHome().getStartingLine().get(1));
	}

	@Override
	public Boolean getCpH3Start() {
		return match.getHome().getStartingLine().get(2).equals(match.getHome().getCaptain());
	}

	@Override
	public void setCpH3Start() {
		match.getHome().setCaptain(match.getHome().getStartingLine().get(2));
	}

	@Override
	public Boolean getCpH4Start() {
		return match.getHome().getStartingLine().get(3).equals(match.getHome().getCaptain());
	}

	@Override
	public void setCpH4Start() {
		match.getHome().setCaptain(match.getHome().getStartingLine().get(3));
	}

	@Override
	public Boolean getCpH5Start() {
		return match.getHome().getStartingLine().get(4).equals(match.getHome().getCaptain());
	}

	@Override
	public void setCpH5Start() {
		match.getHome().setCaptain(match.getHome().getStartingLine().get(4));
	}

	



}
