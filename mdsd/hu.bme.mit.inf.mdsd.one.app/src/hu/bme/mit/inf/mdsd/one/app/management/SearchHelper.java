package hu.bme.mit.inf.mdsd.one.app.management;

import java.util.Collection;
import java.util.Collections;

import model.Match;
import model.Player;
import model.Role;
import model.StaffMember;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.graphics.Image;

import databinding.possiblehomereds.PossibleHomeRedsMatcher;
import databinding.possiblehomescorers.PossibleHomeScorersMatcher;
import databinding.possiblehomeyellows.PossibleHomeYellowsMatcher;
import databinding.possiblevisitorreds.PossibleVisitorRedsMatcher;
import databinding.possiblevisitorscorers.PossibleVisitorScorersMatcher;
import databinding.possiblevisitoryellows.PossibleVisitorYellowsMatcher;

public class SearchHelper implements ISearchHelper {

	private Match match;

	public SearchHelper(Match match) {
		this.match = match;
	}

	@Override
	public Collection<Player> possibleHomeScorers() {
		try {
			PossibleHomeScorersMatcher matcher = PossibleHomeScorersMatcher
					.factory().getMatcher(match);
			return matcher.getAllValuesOfrole(match);

		} catch (IncQueryException e) {
			e.printStackTrace();
		}

		return Collections.emptyList();
	}

	@Override
	public Collection<Player> possibleVisitorScorers() {
		try {
			PossibleVisitorScorersMatcher matcher = PossibleVisitorScorersMatcher
					.factory().getMatcher(match);
			return matcher.getAllValuesOfrole(match);

		} catch (IncQueryException e) {
			e.printStackTrace();
		}

		return Collections.emptyList();
	}

	@Override
	public Collection<Player> possibleHomeYellows() {
		try {
			PossibleHomeYellowsMatcher matcher = PossibleHomeYellowsMatcher
					.factory().getMatcher(match);
			return matcher.getAllValuesOfrole(match);

		} catch (IncQueryException e) {
			e.printStackTrace();
		}

		return Collections.emptyList();
	}

	@Override
	public Collection<Player> possibleVisitorYellows() {
		try {
			PossibleVisitorYellowsMatcher matcher = PossibleVisitorYellowsMatcher
					.factory().getMatcher(match);
			return matcher.getAllValuesOfrole(match);

		} catch (IncQueryException e) {
			e.printStackTrace();
		}

		return Collections.emptyList();
	}

	@Override
	public Collection<Role> possibleHomeReds() {
		try {
			PossibleHomeRedsMatcher matcher = PossibleHomeRedsMatcher.factory()
					.getMatcher(match);
			return matcher.getAllValuesOfrole(match);

		} catch (IncQueryException e) {
			e.printStackTrace();
		}

		return Collections.emptyList();
	}

	@Override
	public Collection<Role> possibleVisitorReds() {
		try {
			PossibleVisitorRedsMatcher matcher = PossibleVisitorRedsMatcher
					.factory().getMatcher(match);
			return matcher.getAllValuesOfrole(match);

		} catch (IncQueryException e) {
			e.printStackTrace();
		}

		return Collections.emptyList();
	}

	@Override
	public IStructuredContentProvider getHomeScorersContentProvider() {
		return new RoleContentProvider(RoleContentProvider.HOME_SCORERS);
	}

	@Override
	public IStructuredContentProvider getVisitorScorersContentProvider() {
		return new RoleContentProvider(RoleContentProvider.VISITOR_SCORERS);
	}

	@Override
	public IStructuredContentProvider getHomeYellowsContentProvider() {
		return new RoleContentProvider(RoleContentProvider.HOME_YELLOWS);
	}

	@Override
	public IStructuredContentProvider getVisitorYellowsContentProvider() {
		return new RoleContentProvider(RoleContentProvider.VISITOR_YELLOWS);
	}

	@Override
	public IStructuredContentProvider getHomeRedsContentProvider() {
		return new RoleContentProvider(RoleContentProvider.HOME_REDS);
	}

	@Override
	public IStructuredContentProvider getVisitorRedsContentProvider() {
		return new RoleContentProvider(RoleContentProvider.VISITOR_REDS);
	}

	@Override
	public LabelProvider getRoleLabelProvider() {
		return new RoleLabelProvider();
	}

	private class RoleLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			if (element instanceof StaffMember) {
				StaffMember s = (StaffMember) element;

				if (columnIndex == 2)
					return s.getTeamMember().getName();
				if (columnIndex == 3)
					return s.getRole().toString();
				if (columnIndex == 4)
					return s.getTeamMember().getTeam().getName();

			} else if (element instanceof Player) {
				Player p = (Player) element;

				if (columnIndex == 2)
					return p.getTeamMember().getName();
				if (columnIndex == 1)
					return Integer.toString(p.getShirtNo());
				if (columnIndex == 4)
					return p.getTeamMember().getTeam().getName();
			}

			return null;
		}
	}

	private class RoleContentProvider implements IStructuredContentProvider {

		public static final String HOME_SCORERS = "homescorers";
		public static final String HOME_YELLOWS = "homeyellows";
		public static final String HOME_REDS = "homereds";
		public static final String VISITOR_SCORERS = "visitorscorers";
		public static final String VISITOR_YELLOWS = "visitoryellows";
		public static final String VISITOR_REDS = "visitorreds";
		private String type;

		public RoleContentProvider(String type) {
			super();
			this.type = type;
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			if (type.equals(HOME_REDS))
				return possibleHomeReds().toArray();
			if (type.equals(HOME_SCORERS))
				return possibleHomeScorers().toArray();
			if (type.equals(HOME_YELLOWS))
				return possibleHomeYellows().toArray();
			if (type.equals(VISITOR_REDS))
				return possibleVisitorReds().toArray();
			if (type.equals(VISITOR_SCORERS))
				return possibleVisitorScorers().toArray();
			if (type.equals(VISITOR_YELLOWS))
				return possibleVisitorYellows().toArray();
			return new Object[0];
		}

	}

	public static class SearchViewerFilter extends ViewerFilter {

		private String text = "";

		public void setText(String text) {
			this.text = text;
		}

		@Override
		public boolean select(Viewer viewer, Object parentElement,
				Object element) {

			if (element instanceof StaffMember) {
				StaffMember s = (StaffMember) element;
				if (s.getRole().toString().toLowerCase().contains(text.toLowerCase())
						|| s.getTeamMember().getName().toLowerCase().contains(text.toLowerCase()))
					return true;

			} else if (element instanceof Player) {
				Player p = (Player) element;
				if (Integer.toString(p.getShirtNo()).toLowerCase().contains(text.toLowerCase())
						|| p.getTeamMember().getName().toLowerCase().contains(text.toLowerCase()))
					return true;
			}

			return false;
		}

	}
}
