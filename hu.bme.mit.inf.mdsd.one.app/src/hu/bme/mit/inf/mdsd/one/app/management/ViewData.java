package hu.bme.mit.inf.mdsd.one.app.management;

import model.Match;

public class ViewData {

	private static ViewData data = new ViewData();
	private Match model = null;
	
	public static ViewData instance() {
		return data;
	}
	
	public boolean useModel() {
		return model == null ? false : true;
	}
	
	public Match getModel() {
		return model;
	}
	
	public void setModel(Match model) {
		this.model = model;
	}
	
}
