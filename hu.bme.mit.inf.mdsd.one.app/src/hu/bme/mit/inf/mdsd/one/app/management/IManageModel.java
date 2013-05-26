package hu.bme.mit.inf.mdsd.one.app.management;

import model.Match;

import org.eclipse.swt.widgets.Text;

public interface IManageModel {
	
	// Combosdobozok felt�lt�se:	
	public String[] getAgeGroupItems();
	public String[] getMatchTypeItems();
	
	public String getReferee();
	public void setReferee(Text text);
	Match getMatch();

}
