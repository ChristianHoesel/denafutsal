package hu.bme.mit.inf.mdsd.one.app.management;

import java.util.Collection;

import model.Match;
import model.Player;
import model.Role;
import model.StaffMember;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;

public class SearchHelper implements ISearchHelper {

	private Match match;
	
	public SearchHelper(Match match) {
		this.match = match;
	}
	
	@Override
	public Collection<Role> possibleHomeScorers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Role> possibleVisitorScorers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Role> possibleHomeYellows() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Role> possibleVisitorYellows() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Role> possibleHomeReds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Role> possibleVisitorReds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IStructuredContentProvider getHomeScorersContentProvider() {
		return new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public Object[] getElements(Object inputElement) {
				return possibleHomeScorers().toArray();
			}
		};
	}

	@Override
	public IStructuredContentProvider getVisitorScorersContentProvider() {
		return new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public Object[] getElements(Object inputElement) {
				return possibleVisitorScorers().toArray();
			}
		};
	}

	@Override
	public IStructuredContentProvider getHomeYellowsContentProvider() {
		return new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public Object[] getElements(Object inputElement) {
				return possibleHomeYellows().toArray();
			}
		};
	}

	@Override
	public IStructuredContentProvider getVisitorYellowsContentProvider() {
		return new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public Object[] getElements(Object inputElement) {
				return possibleVisitorYellows().toArray();
			}
		};
	}

	@Override
	public IStructuredContentProvider getHomeRedsContentProvider() {
		return new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public Object[] getElements(Object inputElement) {
				return possibleHomeReds().toArray();
			}
		};
	}

	@Override
	public IStructuredContentProvider getVisitorRedsContentProvider() {
		return new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public Object[] getElements(Object inputElement) {
				return possibleVisitorReds().toArray();
			}
		};
	}

	@Override
	public LabelProvider getRoleLabelProvider() {
		return new RoleLabelProvider();
	}

	private class RoleLabelProvider extends LabelProvider {
		public Image getImage(Object element) {
			return null;
		}

		public String getText(Object element) {
			if (element instanceof StaffMember) {
				StaffMember s = (StaffMember) element;

				String ret = s.getTeamMember().getName() + " "
						+ s.getTeamMember().getTeam().getName() + " "
						+ s.getRole().toString();
				return ret;

			} else if (element instanceof Player) {
				Player p = (Player) element;

				String ret = p.getShirtNo() + " " + p.getTeamMember().getName()
						+ " " + p.getTeamMember().getTeam().getName();
				return ret;
			}

			return null;
		}
	}

}
