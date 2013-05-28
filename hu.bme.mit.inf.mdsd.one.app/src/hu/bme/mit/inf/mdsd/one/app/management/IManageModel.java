package hu.bme.mit.inf.mdsd.one.app.management;

import java.util.List;

import model.Event;
import model.Match;
import model.Role;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Text;

public interface IManageModel {
	
	// Combosdobozok feltöltése:	
	public String[] getAgeGroupItems();
	public String[] getMatchTypeItems();
	public String[] getStaffRoleItems();
	
	public int getAgeGroupSelection();
	public int getMatchTypeSelection();
	
	
	
	public String getRefereeText();
	public void setRefereeText(Text text, String error);
	
	public String getAssistantText();
	public void setAssistantText(Text text, String error);
	
	public String getThirdRefereeRefereeText();
	public void setThirdRefereeRefereeText(Text text, String error);
	
	public String getSupervisorText();
	public void setSupervisorText(Text text, String error);
	
	public String getMatchIDText();
	public void setMatchIDText(Text text, String error);
	
	public String getAgeGroupCombo();
	public void setAgeGroupCombo(Combo combo, String error);
	
	public String getMatchTypeCombo();
	public void setMatchTypeCombo(Combo combo, String error);
	
	public String getAddressText();
	public void setAddressText(Text text, String error);
	
	public int getYearOfDate();
	public int getMonthOfDate();
	public int getDayOfDate();
	
	public String getDateDateTime();
	public void setDateDateTime(DateTime datetime, String error);
	
	public String getTeamHomeText();
	public void setTeamHomeText(Text text, String error);
	
	public String getTeamVisitorText();
	public void setTeamVisitorText(Text text, String error);
	
	
	// A Home csapat kezdõ összeállítása:
	
	public String getStartH1NText();
	public void setStartH1NText(Text text, String error);
	
	public String getIdH1StartText();
	public void setIdH1StartText(Text text, String error);
	
	public String getShirtH1StartText();
	public void setShirtH1StartText(Text text, String error);
	
	//-----------------------------------------
	
	public String getStartH2NText();
	public void setStartH2NText(Text text);
	
	public String getIdH2StartText();
	public void setIdH2StartText(Text text);
	
	public String getShirtH2StartText();
	public void setShirtH2StartText(Text text);
	
	//-----------------------------------------
	
	public String getStartH3NText();
	public void setStartH3NText(Text text);
	
	public String getIdH3StartText();
	public void setIdH3StartText(Text text);
	
	public String getShirtH3StartText();
	public void setShirtH3StartText(Text text);
	
	//-----------------------------------------
	
	public String getStartH4NText();
	public void setStartH4NText(Text text);
	
	public String getIdH4StartText();
	public void setIdH4StartText(Text text);
	
	public String getShirtH4StartText();
	public void setShirtH4StartText(Text text);
	
	//-----------------------------------------
	
	public String getStartH5NText();
	public void setStartH5NText(Text text);
	
	public String getIdH5StartText();
	public void setIdH5StartText(Text text);
	
	public String getShirtH5StartText();
	public void setShirtH5StartText(Text text);
	
	//-----------------------------------------

	public String getCaptainHome();
	
	public Boolean getCpH1Start();
	public void setCpH1Start();
	
	public Boolean getCpH2Start();
	public void setCpH2Start();
	
	public Boolean getCpH3Start();
	public void setCpH3Start();
	
	public Boolean getCpH4Start();
	public void setCpH4Start();
	
	public Boolean getCpH5Start();
	public void setCpH5Start();
	
	/*
	
	///
	
	teamHome

startH1N    cpH1Start.selection   idH1Start   shirtH1Start ez lesz a goalkeeper
startH2N    cpH2Start   idH2Start   shirtH2Start
startH3N    cpH3Start   idH3Start   shirtH3Start
startH4N    cpH4Start   idH4Start   shirtH4Start
startH5N    cpH5Start   idH5Start   shirtH5Start
	
	////
	
	*/
	
	
	// A Visitor csapat kezdõje:
	
	public String getStartV1NText();
	public void setStartV1NText(Text text, String error);
	
	public String getIdV1StartText();
	public void setIdV1StartText(Text text, String error);
	
	public String getShirtV1StartText();
	public void setShirtV1StartText(Text text, String error);
	
	//-----------------------------------------
	
	public String getStartV2NText();
	public void setStartV2NText(Text text);
	
	public String getIdV2StartText();
	public void setIdV2StartText(Text text);
	
	public String getShirtV2StartText();
	public void setShirtV2StartText(Text text);
	
	//-----------------------------------------
	
	public String getStartV3NText();
	public void setStartV3NText(Text text);
	
	public String getIdV3StartText();
	public void setIdV3StartText(Text text);
	
	public String getShirtV3StartText();
	public void setShirtV3StartText(Text text);
	
	//-----------------------------------------
	
	public String getStartV4NText();
	public void setStartV4NText(Text text);
	
	public String getIdV4StartText();
	public void setIdV4StartText(Text text);
	
	public String getShirtV4StartText();
	public void setShirtV4StartText(Text text);
	
	//-----------------------------------------
	
	public String getStartV5NText();
	public void setStartV5NText(Text text);
	
	public String getIdV5StartText();
	public void setIdV5StartText(Text text);
	
	public String getShirtV5StartText();
	public void setShirtV5StartText(Text text);
	
	//-----------------------------------------

	public String getCaptainVisitor();
	
	public Boolean getCpV1Start();
	public void setCpV1Start();
	
	public Boolean getCpV2Start();
	public void setCpV2Start();
	
	public Boolean getCpV3Start();
	public void setCpV3Start();
	
	public Boolean getCpV4Start();
	public void setCpV4Start();
	
	public Boolean getCpV5Start();
	public void setCpV5Start();
	
	Match getMatch();
	/* Eventek */
	void homeGoal(Role role, int time);
	void visitorGoal(Role role, int time);
	void homeYellowCard(Role role, int time);
	void visitorYellowCard(Role role, int time);
	void homeRedCard(Role role, int time);
	void visitorRedCard(Role role, int time);
	void homeRedCardWithBan(Role role, int time);
	void visitorRedCardWithBan(Role role, int time);
	
	public String[] getEvent(Event event);
	
	public List<String[]> getEventList();
	
	public void getEventsToLogging();
	
	public void setStaffT8VCombo(Combo combo, String error);
	public String getStaffT8VCombo();
	public int getStaffT8VSelection();
}
