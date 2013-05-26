package hu.bme.mit.inf.mdsd.one.app.management;

import model.Match;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.incquery.databinding.runtime.api.IncQueryObservables;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import databinding.getgoalcount.GetGoalCountMatch;
import databinding.getgoalcount.GetGoalCountMatcher;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.Futsal_report_generatorStatemachine;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.Futsal_report_generatorStatemachine.State;

public class ManageStateChartHelper {

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
		if (sm.isStateActive(State.main_region_End_Match))
			return "Extra Time?"; // TODO: Check it
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
		if(count >= 5 )
			ret = "!" + ret;
		return ret;
	}
	
	public void registerGoalCounts(Match match) {
		try {
			
			IncQueryEngine engine = EngineManager.getInstance().createUnmanagedIncQueryEngine(match.eResource().getResourceSet());
			GetGoalCountMatcher matcher = GetGoalCountMatcher.factory().getMatcher(match);
			GetGoalCountMatch filter = matcher.newMatch(match, null, null);
			IObservableList observeMatchesList = IncQueryObservables.observeMatchesAsList(GetGoalCountMatcher.factory(), engine, filter);
			
			GetGoalCountMatch m = (GetGoalCountMatch) observeMatchesList.get(0);
			msc.getView().setScore(m.getHome(), m.getVisitor());
			
			observeMatchesList.addChangeListener(new IChangeListener() {
				
				@Override
				public void handleChange(ChangeEvent event) {
					/*try {
						GetGoalCountMatcher matcher = GetGoalCountMatcher.factory().getMatcher(match);
						GetGoalCountMatch filter = matcher.newMatch(match, null, null);
						for(GetGoalCountMatch m : matcher.getAllMatches(filter)) {
							Integer home = m.getHome();
							Integer visitor = m.getVisitor();
							view.setScore(home, visitor);
						}*/
						Object a = (GetGoalCountMatch) event.getObservable();
					/*} catch (IncQueryException e) {
						e.printStackTrace();
					}*/
					
				}
			});
		} catch (IncQueryException e) {
			e.printStackTrace();
		}
	}
}
