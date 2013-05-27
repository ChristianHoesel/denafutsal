package hu.bme.mit.inf.mdsd.one.app.management;

import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.Futsal_report_generatorStatemachine;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.Futsal_report_generatorStatemachine.State;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Event;
import model.Match;
import model.Type;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.incquery.databinding.runtime.api.IncQueryObservables;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import com.google.common.collect.Lists;

import databinding.getgoalcount.GetGoalCountMatch;
import databinding.getgoalcount.GetGoalCountMatcher;
import databinding.redwithbans.RedWithBansMatch;

public class ManageStateChartHelper {

	private static final String PENALTIES = "Penalties?";
	private Futsal_report_generatorStatemachine sm;
	private ManageStateChart msc;

	public ManageStateChartHelper(Futsal_report_generatorStatemachine sm,
			ManageStateChart msc) {
		this.sm = sm;
		this.msc = msc;
	}

	public String calculateManageTimeBtnText() throws Exception {
		if (inMatch() && msc.isUpdateTimeTaskScheduled())
			return "Pause Match";
		if (inMatch() && !msc.isUpdateTimeTaskScheduled())
			return "Resume Match";
		if (inBreakTime() && msc.isUpdateTimeTaskScheduled())
			return "Pause break";
		if (inBreakTime() && !msc.isUpdateTimeTaskScheduled())
			return "Resume break";
		if (inTimeOut() && msc.isUpdateTimeTaskScheduled())
			return "Pause timeout";
		if (inTimeOut() && !msc.isUpdateTimeTaskScheduled())
			return "Resume timeout";

		return getWaitingStatesString();
	}

	public State getCurrentMatchState() {
		if (sm.isStateActive(State.main_region_Breaktime))
			return State.main_region_Breaktime;
		if (sm.isStateActive(State.main_region__1st_Extratime))
			return State.main_region__1st_Extratime;
		if (sm.isStateActive(State.main_region__1st_Halftime))
			return State.main_region__1st_Halftime;
		if (sm.isStateActive(State.main_region__1st_Home_Timeout))
			return State.main_region__1st_Home_Timeout;
		if (sm.isStateActive(State.main_region__1st_Visitor_Timeout))
			return State.main_region__1st_Visitor_Timeout;
		if (sm.isStateActive(State.main_region__2nd_Extratime))
			return State.main_region__2nd_Extratime;
		if (sm.isStateActive(State.main_region__2nd_Halftime))
			return State.main_region__2nd_Halftime;
		if (sm.isStateActive(State.main_region__2nd_Home_Timeout))
			return State.main_region__2nd_Home_Timeout;
		if (sm.isStateActive(State.main_region__2nd_Visitor_Timeout))
			return State.main_region__2nd_Visitor_Timeout;
		if (sm.isStateActive(State.main_region_End_2nd_Extratime))
			return State.main_region_End_2nd_Extratime;
		if (sm.isStateActive(State.main_region_End_Match))
			return State.main_region_End_Match;
		if (sm.isStateActive(State.main_region_Init))
			return State.main_region_Init;
		if (sm.isStateActive(State.main_region_Waiting_For_the_Start_of_1st_Halftime))
			return State.main_region_Waiting_For_the_Start_of_1st_Halftime;
		if (sm.isStateActive(State.main_region_Waiting_For_the_Start_of_2nd_Extratime))
			return State.main_region_Waiting_For_the_Start_of_2nd_Extratime;
		if (sm.isStateActive(State.main_region_Waiting_for_the_Start_of_Breaktime))
			return State.main_region_Waiting_for_the_Start_of_Breaktime;
		if (sm.isStateActive(State.main_region_Waitng_For_the_Start_of_2nd_Halftime))
			return State.main_region_Waitng_For_the_Start_of_2nd_Halftime;

		return null;
	}

	public boolean inMatch() {
		if (sm.isStateActive(State.main_region__1st_Extratime)
				|| sm.isStateActive(State.main_region__1st_Halftime)
				|| sm.isStateActive(State.main_region__2nd_Extratime)
				|| sm.isStateActive(State.main_region__2nd_Halftime))
			return true;
		return false;
	}

	public boolean inBreakTime() {
		if (sm.isStateActive(State.main_region_Breaktime))
			return true;
		return false;
	}

	public boolean inTimeOut() {
		if (sm.isStateActive(State.main_region__1st_Home_Timeout)
				|| sm.isStateActive(State.main_region__1st_Visitor_Timeout)
				|| sm.isStateActive(State.main_region__2nd_Home_Timeout)
				|| sm.isStateActive(State.main_region__2nd_Visitor_Timeout))
			return true;
		return false;
	}

	public boolean needToRunTimer() {
		if (sm.isStateActive(State.main_region__1st_Extratime)
				|| sm.isStateActive(State.main_region__1st_Halftime)
				|| sm.isStateActive(State.main_region__1st_Home_Timeout)
				|| sm.isStateActive(State.main_region__1st_Visitor_Timeout)
				|| sm.isStateActive(State.main_region__2nd_Extratime)
				|| sm.isStateActive(State.main_region__2nd_Halftime)
				|| sm.isStateActive(State.main_region__2nd_Home_Timeout)
				|| sm.isStateActive(State.main_region__2nd_Visitor_Timeout)
				|| sm.isStateActive(State.main_region_Breaktime))
			return true;
		return false;
	}

	private String getWaitingStatesString() throws Exception {

		if (sm.isStateActive(State.main_region_Waiting_For_the_Start_of_1st_Halftime))
			return "Start first half";
		if (sm.isStateActive(State.main_region_Waiting_for_the_Start_of_Breaktime))
			return "Start Breaktime";
		if (sm.isStateActive(State.main_region_Waitng_For_the_Start_of_2nd_Halftime))
			return "Start second Half";
		if (sm.isStateActive(State.main_region_End_Match)) {
			Match match = msc.getView().getModel();
			if(match.getType().equals(Type.LEAGUE)) {
				msc.getView().disableManageBtn();
				return "Match finished";
			} else {				
				return "Extratime?";
			}
		}
		if (sm.isStateActive(State.main_region_End_2nd_Extratime))
			return PENALTIES;
		if (sm.isStateActive(State.main_region_Waiting_For_the_Start_of_2nd_Extratime))
			return "Start second Extratime";

		throw new Exception("Not a valid waiting state");
	}

	public void playSound() {
		new MakeSound().playSound();
	}

	public int getCurrentMatchTime() {
		return sm.getSCITimer().getTick();
	}

	public int getTick() throws Exception {
		if (sm.isStateActive(State.main_region__1st_Halftime)) {
			int ht_long = sm.getSCITimer().getHt_long();
			int tick = sm.getSCITimer().getTick();
			return ht_long - tick;
		}

		if (sm.isStateActive(State.main_region__2nd_Halftime)) {
			int ht_long = sm.getSCITimer().getHt_long();
			int tick = sm.getSCITimer().getTick();
			return 2 * ht_long - tick;
		}

		if (sm.isStateActive(State.main_region__1st_Extratime)) {
			int ht_long = sm.getSCITimer().getHt_long();
			int et_long = sm.getSCITimer().getEt_long();
			int tick = sm.getSCITimer().getTick();
			return 2 * ht_long + et_long - tick;
		}

		if (sm.isStateActive(State.main_region__2nd_Extratime)) {
			int ht_long = sm.getSCITimer().getHt_long();
			int et_long = sm.getSCITimer().getEt_long();
			int tick = sm.getSCITimer().getTick();
			return 2 * ht_long + 2 * et_long - tick;
		}

		if (sm.isStateActive(State.main_region_Breaktime)) {
			int bt_long = sm.getSCITimer().getBt_long();
			int tick = sm.getSCITimer().getBreaktime_tick();
			return bt_long - tick;
		}
		if (sm.isStateActive(State.main_region__1st_Home_Timeout)
				|| sm.isStateActive(State.main_region__2nd_Home_Timeout)
				|| sm.isStateActive(State.main_region__1st_Visitor_Timeout)
				|| sm.isStateActive(State.main_region__2nd_Visitor_Timeout)) {
			int to_long = sm.getSCITimer().getTo_long();
			int tick = sm.getSCITimer().getTimeout_tick();
			return to_long - tick;
		}

		throw new Exception("Not a valid running state");
	}

	public String calculateFaultBtnText(int count) {
		String ret = Integer.toString(count);
		if (count >= 5)
			ret = "!" + ret;
		return ret;
	}

	public void registerGoalCounts(final Match match) {
		try {

			IncQueryEngine engine = EngineManager.getInstance()
					.createUnmanagedIncQueryEngine(
							match.eResource().getResourceSet());
			GetGoalCountMatcher matcher = GetGoalCountMatcher.factory()
					.getMatcher(match);
			GetGoalCountMatch filter = matcher.newMatch(match, null, null);
			IObservableList observeMatchesList = IncQueryObservables
					.observeMatchesAsList(GetGoalCountMatcher.factory(),
							engine, filter);

			GetGoalCountMatch m = (GetGoalCountMatch) observeMatchesList.get(0);
			msc.getView().setScore(m.getHome(), m.getVisitor());

			observeMatchesList.addChangeListener(new IChangeListener() {

				@Override
				public void handleChange(ChangeEvent event) {
					try {
						GetGoalCountMatcher matcher = GetGoalCountMatcher
								.factory().getMatcher(match);
						GetGoalCountMatch filter = matcher.newMatch(match,
								null, null);
						for (GetGoalCountMatch m : matcher
								.getAllMatches(filter)) {
							Integer home = m.getHome();
							Integer visitor = m.getVisitor();
							msc.getView().setScore(home, visitor);
						}
					} catch (IncQueryException e) {
						e.printStackTrace();
					}

				}
			});
		} catch (IncQueryException e) {
			e.printStackTrace();
		}
	}

	public String calculateBanStr(Collection<RedWithBansMatch> bans,
			Event goal) throws Exception {
		List<RedWithBansMatch> list = Lists.newArrayList(bans.toArray(new RedWithBansMatch[0]));
		Collections.sort(list, new RedWithBansMatchComparator());
		
		if(list.isEmpty())
			return "";
		
		int ctime = getCurrentMatchTime();
		int pt_long = msc.getBanTime();
		
		String ret = "";
		
		if(list.size() > 0) {
			int etime = (int) list.get(0).getEvent().getTime();
			
			if( goal != null && goal.getTime() > etime )
				return ret;
			
			int remains = pt_long - (ctime-etime);
			if(remains < -5)
				return ret;
			
			int remains_m = remains / 60;
			int remains_s = remains - remains_m * 60;
			
			if(remains < 0)
				ret = "0:00";
			else			
				ret = remains_m +  ":" + (remains_s < 10 ? "0" : "") + remains_s;
		}
		
		if(list.size() > 1) {
			int etime = (int) list.get(1).getEvent().getTime();
			
			int remains = pt_long - (ctime-etime);
			int remains_m = remains / 60;
			int remains_s = remains - remains_m * 60;
			
			if(remains < -5)
				return ret;
			
			if(remains < 0)
				return ret + " 0:00";
			ret = ret + " " + remains_m +  ":" + (remains_s < 10 ? "0" : "") + remains_s;
		}
		
		return ret;
	}
	
	private class RedWithBansMatchComparator implements Comparator<RedWithBansMatch> {

		@Override
		public int compare(RedWithBansMatch o1, RedWithBansMatch o2) {
			return (int) (o2.getEvent().getTime() - o1.getEvent().getTime());
		}
		
	}
}
