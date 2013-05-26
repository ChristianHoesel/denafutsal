package hu.bme.mit.inf.mdsd.one.app.management;

import model.Match;
import model.Role;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Text;

public interface IManageModel {
	
	// Combosdobozok feltöltése:	
	public String[] getAgeGroupItems();
	public String[] getMatchTypeItems();
	public String[] getStaffRoleItems();
	
	public int getAgeGroupSelection();
	public int getMatchTyeSelection();
	
	
	
	public String getRefereeText();
	public void setRefereeText(Text text);
	
	public String getAssistantText();
	public void setAssistantText(Text text);
	
	public String getThirdRefereeRefereeText();
	public void setThirdRefereeRefereeText(Text text);
	
	public String getSupervisorText();
	public void setSupervisorText(Text text);
	
	public String getMatchIDText();
	public void setMatchIDText(Text text);
	
	public String getAgeGroupCombo();
	public void setAgeGroupCombo(Combo combo);
	
	public String getMatchTypeCombo();
	public void setMatchTypeCombo(Combo combo);
	
	public String getAddressText();
	public void setAddressText(Text text);
	
	public int getYearOfDate();
	public int getMonthOfDate();
	public int getDayOfDate();
	
	public String getDateDateTime();
	public void setDateDateTime(DateTime datetime);
	
	public String getTeamHomeText();
	public void setTeamHomeText(Text text);
	
	public String getTeamVisitorText();
	public void setTeamVisitorText(Text text);
	
	
	// A Home csapat kezdõ összeállítása:
	
	public String getStartH1NText();
	public void setStartH1NText(Text text);
	
	public String getIdH1StartText();
	public void setIdH1StartText(Text text);
	
	public String getShirtH1StartText();
	public void setShirtH1StartText(Text text);
	
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
	
	Match getMatch();
	/* Eventek */
	void homeGoal(Role role, int time);
	void visitorGoal(Role role, int time);
	void homeYellowCard(Role role, int time);
	void visitorYellowCard(Role role, int time);
	void homeRedCard(Role role, int time);
	void visitorRedCard(Role role, int time);
}
