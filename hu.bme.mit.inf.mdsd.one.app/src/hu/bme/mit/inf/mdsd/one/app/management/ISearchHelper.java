package hu.bme.mit.inf.mdsd.one.app.management;

import java.util.Collection;

import model.Player;
import model.Role;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

public interface ISearchHelper {
	
	Collection<Player> possibleHomeScorers();
	Collection<Player> possibleVisitorScorers();
	Collection<Player> possibleHomeYellows();
	Collection<Player> possibleVisitorYellows();
	Collection<Role> possibleHomeReds();
	Collection<Role> possibleVisitorReds();
	
	IStructuredContentProvider getHomeScorersContentProvider();
	IStructuredContentProvider getVisitorScorersContentProvider();
	IStructuredContentProvider getHomeYellowsContentProvider();
	IStructuredContentProvider getVisitorYellowsContentProvider();
	IStructuredContentProvider getHomeRedsContentProvider();
	IStructuredContentProvider getVisitorRedsContentProvider();
	
	LabelProvider getRoleLabelProvider();
}
