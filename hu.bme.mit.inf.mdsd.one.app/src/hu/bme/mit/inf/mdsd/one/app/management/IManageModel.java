package hu.bme.mit.inf.mdsd.one.app.management;

import model.Match;
import model.Role;

import org.eclipse.swt.widgets.Text;

public interface IManageModel {
	
	// Combosdobozok feltöltése:	
	public String[] getAgeGroupItems();
	public String[] getMatchTypeItems();
	
	public String getReferee();
	public void setReferee(Text text);
	
	Match getMatch();
	/* Eventek */
	void homeGoal(Role role, int time);
	void visitorGoal(Role role, int time);
	void homeYellowCard(Role role, int time);
	void visitorYellowCard(Role role, int time);
	void homeRedCard(Role role, int time);
	void visitorRedCard(Role role, int time);
}
