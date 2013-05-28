package hu.bme.mit.inf.mdsd.one.app.management;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.reportgenerator.templates.MatchGenerator;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.AgeGroup;
import model.Event;
import model.EventType;
import model.Match;
import model.ModelFactory;
import model.Person;
import model.Player;
import model.Position;
import model.Role;
import model.StaffMember;
import model.StaffRole;
import model.Team;
import model.TeamMember;
import model.Type;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

public class ManageModel implements IManageModel {

	final static Device device = Display.getCurrent();
	final static Color green = new Color(device, 0, 255, 0);
	final static Color red = new Color(device, 255, 0, 0);

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
	public ManageModel(MainView view, Match model) {
		this.view = view;
		this.match = model;
	
		factory = ModelFactory.eINSTANCE;
	}

	public ManageModel(MainView view) {
		this.view = view;

		factory = ModelFactory.eINSTANCE;

		/* Teszteléshez, majd ezt innen kiszedheted nyugodtan */
		 //match =
		 //ManageModelHelper.readModelFromFile(ManageModelHelper.TESTMODEL);
		/**/

		ResourceSet rSet = new ResourceSetImpl();
		Resource resource = rSet.createResource(URI.createURI("models.model"));
		
		match = factory.createMatch();

		resource.getContents().add(match);

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
		
		for (int i = 5; i < 12; i++) {
			Player player = factory.createPlayer();
			player.setShirtNo(i);
			player.setPosition(Position.FIELD_PLAYER);
			
			TeamMember teamMember = factory.createTeamMember();

			teamMember.setId(i);
			teamMember.setName(String.format("Player %d", i));

			teamMember.setPlayerRole(player);

			match.getHome().getMembers().add(teamMember);

		}
		
		for (int i = 12; i < 20; i++) {
			StaffMember staffmember = factory.createStaffMember();
			staffmember.setRole(StaffRole.OTHER);
			
			TeamMember teamMember = factory.createTeamMember();
			
			teamMember.setId(i);
			teamMember.setName(String.format("Staffmember %d", i));
			
			teamMember.setStaffRole(staffmember);
			
			match.getHome().getMembers().add(teamMember);
		}

		for (int i = 0; i < 5; i++) {
			Player player = factory.createPlayer();
			player.setShirtNo(i+100);
			if (i == 0) {
				player.setPosition(Position.GOALKEEPER);
				match.getVisitor().setCaptain(player);				
			} else {
				player.setPosition(Position.FIELD_PLAYER);
			}
			TeamMember teamMember = factory.createTeamMember();

			teamMember.setId(i+100);
			teamMember.setName(String.format("Player %d", i+100));

			teamMember.setPlayerRole(player);

			match.getVisitor().getMembers().add(teamMember);

			match.getVisitor().getStartingLine().add(player);
		}
		
		for (int i = 5; i < 12; i++) {
			Player player = factory.createPlayer();
			player.setShirtNo(i+100);
			player.setPosition(Position.FIELD_PLAYER);
			
			TeamMember teamMember = factory.createTeamMember();

			teamMember.setId(i+100);
			teamMember.setName(String.format("Player %d", i+100));

			teamMember.setPlayerRole(player);

			match.getVisitor().getMembers().add(teamMember);
			
		}
		
		for (int i = 12; i < 20; i++) {
			StaffMember staffmember = factory.createStaffMember();
			staffmember.setRole(StaffRole.OTHER);
			
			TeamMember teamMember = factory.createTeamMember();
			
			teamMember.setId(i+100);
			teamMember.setName(String.format("Staffmember %d", i+100));
			
			teamMember.setStaffRole(staffmember);
			
			match.getVisitor().getMembers().add(teamMember);
		}
		
		/*
		homeGoal(match.getHome().getMembers().get(0).getPlayerRole(), 123);
		homeRedCard(match.getHome().getMembers().get(0).getPlayerRole(), 124);
		homeRedCardWithBan(match.getHome().getMembers().get(0).getPlayerRole(), 125);
		homeYellowCard(match.getHome().getMembers().get(0).getPlayerRole(), 126);
		*/
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
	public void setRefereeText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.getReferee().setName(text.getText());
			text.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	@Override
	public String getAssistantText() {
		return match.getAssistant().getName();
	}

	@Override
	public void setAssistantText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.getAssistant().setName(text.getText());
			text.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}
	}

	@Override
	public String getThirdRefereeRefereeText() {
		return match.getThirdReferee().getName();
	}

	@Override
	public void setThirdRefereeRefereeText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.getThirdReferee().setName(text.getText());
			text.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getSupervisorText() {
		return match.getSupervisor().getName();
	}

	@Override
	public void setSupervisorText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.getSupervisor().setName(text.getText());
			text.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getMatchIDText() {
		return Integer.toString(match.getId());
	}

	@Override
	public void setMatchIDText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor

		if (valid) {
			try {
				match.setId(Integer.parseInt(text.getText()));
				text.setBackground(green);
			} catch (Exception e) {
				text.setBackground(red);
				view.appendTextToLogging(error);
				view.appendTextToLogging(e.toString());
			}
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getAgeGroupCombo() {
		return match.getAgeGroup().getName();
	}

	@Override
	public void setAgeGroupCombo(Combo combo, String error) {

		int cs = combo.getSelectionIndex();

		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.setAgeGroup(AgeGroup.get(cs));
			combo.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			combo.setBackground(red);
		}

	}

	@Override
	public String getAddressText() {
		return match.getLocation();
	}

	@Override
	public void setAddressText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.setLocation(text.getText());
			text.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getTeamHomeText() {
		return match.getHome().getName();
	}

	@Override
	public void setTeamHomeText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.getHome().setName(text.getText());
			text.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getTeamVisitorText() {
		return match.getVisitor().getName();
	}

	@Override
	public void setTeamVisitorText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.getVisitor().setName(text.getText());
			text.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getStartH1NText() {
		return match.getHome().getStartingLine().get(0).getName();
	}

	@Override
	public void setStartH1NText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.getHome().getMembers().get(0).setName(text.getText());
			text.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}
	
	@Override
	public String getHNText(int id) {
		return match.getHome().getStartingLine().get(id).getName();
	}

	@Override
	public void setHNText(int id, Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.getHome().getMembers().get(id).setName(text.getText());
			text.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getIdH1StartText() {
		return String.valueOf(match.getHome().getMembers().get(0).getId());
	}

	@Override
	public void setIdH1StartText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			try {
				match.getHome().getMembers().get(0)
						.setId(Integer.parseInt((text.getText())));
				text.setBackground(green);
			} catch (Exception e) {
				text.setBackground(red);
				view.appendTextToLogging(e.toString());
				view.appendTextToLogging(error);
			}

		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getShirtH1StartText() {
		return String.valueOf(match.getHome().getStartingLine().get(0)
				.getShirtNo());
	}

	@Override
	public void setShirtH1StartText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			try {
				match.getHome().getStartingLine().get(0)
						.setShirtNo(Integer.parseInt(text.getText()));
				text.setBackground(green);
			} catch (Exception e) {
				text.setBackground(red);
				view.appendTextToLogging(e.toString());
				view.appendTextToLogging(error);
			}

		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

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
		match.getHome().getMembers().get(1)
				.setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtH2StartText() {
		return String.valueOf(match.getHome().getStartingLine().get(1)
				.getShirtNo());
	}

	@Override
	public void setShirtH2StartText(Text text) {
		match.getHome().getStartingLine().get(1)
				.setShirtNo(Integer.parseInt(text.getText()));

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
		match.getHome().getMembers().get(2)
				.setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtH3StartText() {
		return String.valueOf(match.getHome().getStartingLine().get(2)
				.getShirtNo());
	}

	@Override
	public void setShirtH3StartText(Text text) {
		match.getHome().getStartingLine().get(2)
				.setShirtNo(Integer.parseInt(text.getText()));

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
		match.getHome().getMembers().get(3)
				.setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtH4StartText() {
		return String.valueOf(match.getHome().getStartingLine().get(3)
				.getShirtNo());
	}

	@Override
	public void setShirtH4StartText(Text text) {
		match.getHome().getStartingLine().get(3)
				.setShirtNo(Integer.parseInt(text.getText()));

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
		match.getHome().getMembers().get(4)
				.setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtH5StartText() {
		return String.valueOf(match.getHome().getStartingLine().get(4)
				.getShirtNo());
	}

	@Override
	public void setShirtH5StartText(Text text) {
		match.getHome().getStartingLine().get(4)
				.setShirtNo(Integer.parseInt(text.getText()));

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
	public void setMatchTypeCombo(Combo combo, String error) {

		int cs = combo.getSelectionIndex();

		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.setType(Type.get(cs));
			combo.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			combo.setBackground(red);
		}

	}

	@Override
	public int getMatchTypeSelection() {
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
	public void setDateDateTime(DateTime datetime, String error) {

		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.setDate(new Date(datetime.getYear() - 1900, datetime
					.getMonth(), datetime.getDay()));
			datetime.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			datetime.setBackground(red);
		}

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
		return match.getHome().getStartingLine().get(0)
				.equals(match.getHome().getCaptain());
	}

	@Override
	public void setCpH1Start() {
		match.getHome().setCaptain(match.getHome().getStartingLine().get(0));
	}

	@Override
	public Boolean getCpH2Start() {
		return match.getHome().getStartingLine().get(1)
				.equals(match.getHome().getCaptain());
	}

	@Override
	public void setCpH2Start() {
		match.getHome().setCaptain(match.getHome().getStartingLine().get(1));
	}

	@Override
	public Boolean getCpH3Start() {
		return match.getHome().getStartingLine().get(2)
				.equals(match.getHome().getCaptain());
	}

	@Override
	public void setCpH3Start() {
		match.getHome().setCaptain(match.getHome().getStartingLine().get(2));
	}

	@Override
	public Boolean getCpH4Start() {
		return match.getHome().getStartingLine().get(3)
				.equals(match.getHome().getCaptain());
	}

	@Override
	public void setCpH4Start() {
		match.getHome().setCaptain(match.getHome().getStartingLine().get(3));
	}

	@Override
	public Boolean getCpH5Start() {
		return match.getHome().getStartingLine().get(4)
				.equals(match.getHome().getCaptain());
	}

	@Override
	public void setCpH5Start() {
		match.getHome().setCaptain(match.getHome().getStartingLine().get(4));
	}
	
	public void addNewEvent(Role role, int time, EventType et) {
		Event event = factory.createEvent();
		event.setCommitter(role.getTeamMember());
		event.setTime(time);
		event.setType(et);
		match.getEvents().add(event);

	}
	
	@Override
	public void homeGoal(Role role, int time) {
		addNewEvent(role, time, EventType.GOAL);		
	}

	@Override
	public void visitorGoal(Role role, int time) {
		addNewEvent(role, time, EventType.GOAL);		
	}

	@Override
	public void homeYellowCard(Role role, int time) {
		addNewEvent(role, time, EventType.YELLOW_CARD);		
	}

	@Override
	public void visitorYellowCard(Role role, int time) {
		addNewEvent(role, time, EventType.YELLOW_CARD);	
	}

	@Override
	public void homeRedCard(Role role, int time) {
		addNewEvent(role, time, EventType.RED_CARD);	
	}

	@Override
	public void visitorRedCard(Role role, int time) {
		addNewEvent(role, time, EventType.RED_CARD);
	}

	@Override
	public void homeRedCardWithBan(Role role, int time) {
		addNewEvent(role, time, EventType.RED_CARD_WITH_BAN);

	}

	@Override
	public void visitorRedCardWithBan(Role role, int time) {
		addNewEvent(role, time, EventType.RED_CARD_WITH_BAN);

	}
	
	public void getEventsToLogging() {
		
		List<Event> event_list = match.getEvents();
		for (int i = 0; i < event_list.size(); i++) {
			view.appendTextToLogging(event_list.get(i).toString());
		}
	}

	@Override
	public String[] getEvent(Event event) {
		int event_id = match.getEvents().indexOf(event);
		
		Event e = match.getEvents().get(event_id);
		String e_time = Long.toString(e.getTime()/60);
		String e_type = e.getType().toString();
		String e_team = e.getCommitter().getTeam().getName();
		String e_commiter = e.getCommitter().getName();
		
		String[] result = {e_time, e_type, e_team, e_commiter};
		
		return result;
		
	}

	@Override
	public List<String[]> getEventList() {
		
		List<String[]> result = new ArrayList<>();
		
		List<Event> event_list = match.getEvents();
		for (int i = 0; i < event_list.size(); i++) {
			result.add(getEvent(event_list.get(i)));
		}
		
		return result;
	}

	@Override
	public int getStaffT8VSelection() {
		return match.getVisitor().getStaff().get(7).getRole().getValue();
	}
	
	@Override
	public String getStaffT8VCombo() {
		return match.getVisitor().getStaff().get(7).getRole().toString();
	}

	@Override
	public void setStaffT8VCombo(Combo combo, String error) {

		int cs = combo.getSelectionIndex();

		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.getVisitor().getStaff().get(7).setRole(StaffRole.get(cs));
			combo.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			combo.setBackground(red);
		}

	}


	public String getStartV1NText() {
		return match.getVisitor().getStartingLine().get(0).getName();
	}

	@Override
	public void setStartV1NText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			match.getVisitor().getMembers().get(0).setName(text.getText());
			text.setBackground(green);
		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getIdV1StartText() {
		return String.valueOf(match.getVisitor().getMembers().get(0).getId());
	}

	@Override
	public void setIdV1StartText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			try {
				match.getVisitor().getMembers().get(0)
						.setId(Integer.parseInt((text.getText())));
				text.setBackground(green);
			} catch (Exception e) {
				text.setBackground(red);
				view.appendTextToLogging(e.toString());
				view.appendTextToLogging(error);
			}

		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getShirtV1StartText() {
		return String.valueOf(match.getVisitor().getStartingLine().get(0)
				.getShirtNo());
	}

	@Override
	public void setShirtV1StartText(Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			try {
				match.getVisitor().getStartingLine().get(0)
						.setShirtNo(Integer.parseInt(text.getText()));
				text.setBackground(green);
			} catch (Exception e) {
				text.setBackground(red);
				view.appendTextToLogging(e.toString());
				view.appendTextToLogging(error);
			}

		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}

	}

	@Override
	public String getStartV2NText() {
		return match.getVisitor().getStartingLine().get(1).getName();
	}

	@Override
	public void setStartV2NText(Text text) {
		match.getVisitor().getMembers().get(1).setName(text.getText());
	}

	@Override
	public String getIdV2StartText() {
		return String.valueOf(match.getVisitor().getMembers().get(1).getId());
	}

	@Override
	public void setIdV2StartText(Text text) {
		match.getVisitor().getMembers().get(1)
				.setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtV2StartText() {
		return String.valueOf(match.getVisitor().getStartingLine().get(1)
				.getShirtNo());
	}

	@Override
	public void setShirtV2StartText(Text text) {
		match.getVisitor().getStartingLine().get(1)
				.setShirtNo(Integer.parseInt(text.getText()));

	}

	@Override
	public String getStartV3NText() {
		return match.getVisitor().getStartingLine().get(2).getName();
	}

	@Override
	public void setStartV3NText(Text text) {
		match.getVisitor().getMembers().get(2).setName(text.getText());

	}

	@Override
	public String getIdV3StartText() {
		return String.valueOf(match.getVisitor().getMembers().get(2).getId());
	}

	@Override
	public void setIdV3StartText(Text text) {
		match.getVisitor().getMembers().get(2)
				.setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtV3StartText() {
		return String.valueOf(match.getVisitor().getStartingLine().get(2)
				.getShirtNo());
	}

	@Override
	public void setShirtV3StartText(Text text) {
		match.getVisitor().getStartingLine().get(2)
				.setShirtNo(Integer.parseInt(text.getText()));

	}

	@Override
	public String getStartV4NText() {
		return match.getVisitor().getStartingLine().get(3).getName();
	}

	@Override
	public void setStartV4NText(Text text) {
		match.getVisitor().getMembers().get(3).setName(text.getText());
	}

	@Override
	public String getIdV4StartText() {
		return String.valueOf(match.getVisitor().getMembers().get(3).getId());
	}

	@Override
	public void setIdV4StartText(Text text) {
		match.getVisitor().getMembers().get(3)
				.setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtV4StartText() {
		return String.valueOf(match.getVisitor().getStartingLine().get(3)
				.getShirtNo());
	}

	@Override
	public void setShirtV4StartText(Text text) {
		match.getVisitor().getStartingLine().get(3)
				.setShirtNo(Integer.parseInt(text.getText()));

	}

	@Override
	public String getStartV5NText() {
		return match.getVisitor().getStartingLine().get(4).getName();
	}

	@Override
	public void setStartV5NText(Text text) {
		match.getVisitor().getMembers().get(4).setName(text.getText());

	}

	@Override
	public String getIdV5StartText() {
		return String.valueOf(match.getVisitor().getMembers().get(4).getId());
	}

	@Override
	public void setIdV5StartText(Text text) {
		match.getVisitor().getMembers().get(4)
				.setId(Integer.parseInt((text.getText())));

	}

	@Override
	public String getShirtV5StartText() {
		return String.valueOf(match.getVisitor().getStartingLine().get(4)
				.getShirtNo());
	}

	@Override
	public void setShirtV5StartText(Text text) {
		match.getVisitor().getStartingLine().get(4)
				.setShirtNo(Integer.parseInt(text.getText()));

	}

    public String getCaptainVisitor() {
		return match.getVisitor().getCaptain().getName();
	}

	@Override
	public Boolean getCpV1Start() {
		return match.getVisitor().getStartingLine().get(0)
				.equals(match.getVisitor().getCaptain());
	}

	@Override
	public void setCpV1Start() {
		match.getVisitor().setCaptain(match.getVisitor().getStartingLine().get(0));
	}

	@Override
	public Boolean getCpV2Start() {
		return match.getVisitor().getStartingLine().get(1)
				.equals(match.getVisitor().getCaptain());
	}

	@Override
	public void setCpV2Start() {
		match.getVisitor().setCaptain(match.getVisitor().getStartingLine().get(1));
	}

	@Override
	public Boolean getCpV3Start() {
		return match.getVisitor().getStartingLine().get(2)
				.equals(match.getVisitor().getCaptain());
	}

	@Override
	public void setCpV3Start() {
		match.getVisitor().setCaptain(match.getVisitor().getStartingLine().get(2));
	}

	@Override
	public Boolean getCpV4Start() {
		return match.getVisitor().getStartingLine().get(3)
				.equals(match.getVisitor().getCaptain());
	}

	@Override
	public void setCpV4Start() {
		match.getVisitor().setCaptain(match.getVisitor().getStartingLine().get(3));
	}

	@Override
	public Boolean getCpV5Start() {
		return match.getVisitor().getStartingLine().get(4)
				.equals(match.getVisitor().getCaptain());
	}

	@Override
	public void setCpV5Start() {
		match.getVisitor().setCaptain(match.getVisitor().getStartingLine().get(4));
	}

	// TODO: Ez elvileg így jó lesz:
	@Override
	public void setVIdText(int i, Text text, String error) {
		Boolean valid = true; // Ide kerül majd a validátor
		if (valid) {
			try {
				match.getVisitor().getMembers().get(i).setId(Integer.parseInt(text.getText()));
				text.setBackground(green);
			} catch (Exception e) {
				text.setBackground(red);
				view.appendTextToLogging(e.toString());
				view.appendTextToLogging(error);
			}

		} else {
			view.appendTextToLogging(error);
			text.setBackground(red);
		}
		
	}
	
	// TODO: Ez elvileg így jó lesz:
	@Override
	public String getVIdText(int i) {
		return String.valueOf(match.getVisitor().getMembers().get(i).getId());
	}


}
