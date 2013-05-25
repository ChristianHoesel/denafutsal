package hu.bme.mit.inf.mdsd.one.app.management;

import org.eclipse.swt.widgets.Text;

public interface IManageModel {
	
	// Combosdobozok feltöltése:	
	public String[] getAgeGroupItems();
	public String[] getMatchTypeItems();
	
	public String getReferee();
	public void setReferee(Text text);

}
