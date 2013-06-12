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
	
	public String getHNText(int id);
	public void setHNText(int id, Text text, String error);
	
	// TODO: Ezek a visitorhoz mennek:
	public String getVNText(int id);
	public void setVNText(int id, Text text, String error);
	
	public String getIdHText(int id);
	public void setIdHText(int id, Text text, String error);

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
	
	
	/***************************************************************************
	 * XXX: Beállítjuk a pólókat:
	 */
	public String getShirtHStartText(int id);
	public void setShirtHStartText(int id, Text text, String error);
	public String getShirtHSubText(int id);
	public void setShirtHSubText(int id, Text text, String error);
	
	public String getShirtVStartText(int id);
	public void setShirtVStartText(int id, Text text, String error);
	public String getShirtVSubText(int id);
	public void setShirtVSubText(int id, Text text, String error);
	/**
	 **************************************************************************/
	
	
	
	//-----------------------------------------
	

	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public String getIdVText(int id);
	
	/**
	 * 
	 * @param id
	 * @param text
	 * @param error
	 */
	public void setIdVText(int id, Text text, String error);

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
	
	public void setVIdText(int i, Text text, String error);
	public String getVIdText(int i);
}
