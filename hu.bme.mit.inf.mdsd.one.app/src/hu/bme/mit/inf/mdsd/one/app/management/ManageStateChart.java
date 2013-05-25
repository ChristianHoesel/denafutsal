package hu.bme.mit.inf.mdsd.one.app.management;

import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.swt.widgets.Display;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.one.app.statechart.TimerService;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.Futsal_report_generatorStatemachine;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.IFutsal_report_generatorStatemachine;

public class ManageStateChart implements IManageStateChart {

	private IFutsal_report_generatorStatemachine sm = new Futsal_report_generatorStatemachine();
	private MainView view;
	private Timer t = new Timer();

	private int counter = 0;
	
	public ManageStateChart(MainView view) {

		this.view = view;

		sm.setTimerService(new TimerService());
		// enter the sm and active the Idle state
		sm.enter();
		sm.runCycle();

		sm.getSCITimer().raiseContinue();

		sm.runCycle();
		
		sm.getSCITimer().raiseContinue();

		t.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				updateTime();				
			}
		}, 0, 100);		
	}

	@Override
	public void updateTime() {
		
		counter++;
		if(counter % 10 == 0) {
			sm.runCycle();
		}
		
		int tick = sm.getSCITimer().getTick();
		int sec = tick / 60;
		int ms = tick - sec * 60;
		
		view.setTime(tick, tick);	
	}

	@Override
	public void updateScore() {
		System.out.println("update-score");
	}

	@Override
	public void manageTime() {
		System.out.println("manage-time");
	}

	@Override
	public void manageHomeFaults() {
		System.out.println("home-faults");
	}

	@Override
	public void manageVisitorFaults() {
		System.out.println("visitor-faults");
	}

	@Override
	public void giveHomeYellowCard() {
		System.out.println("home-yellow");
	}

	@Override
	public void giveVisitorYellowCard() {
		System.out.println("visitor-yellow");
	}

	@Override
	public void giveHomeRedCard() {
		System.out.println("home-red");
	}

	@Override
	public void giveVisitorRedCard() {
		System.out.println("visitor-red");
	}

	@Override
	public void giveHomeGoal() {
		System.out.println("home-goal");
	}

	@Override
	public void giveVisitoryGoal() {
		System.out.println("visitor-goal");
	}

	@Override
	public void useHomeTimeOut() {
		System.out.println("home-timeout");
	}

	@Override
	public void useVisitorTimeOut() {
		System.out.println("visitor-timeout");
	}

}
