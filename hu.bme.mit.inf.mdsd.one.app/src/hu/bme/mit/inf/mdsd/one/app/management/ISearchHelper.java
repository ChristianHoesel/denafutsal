package hu.bme.mit.inf.mdsd.one.app.management;

import java.util.Collection;

import model.Role;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

public interface ISearchHelper {
	
	Collection<Role> possibleHomeScorers();
	Collection<Role> possibleVisitorScorers();
	Collection<Role> possibleHomeYellows();
	Collection<Role> possibleVisitorYellows();
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
