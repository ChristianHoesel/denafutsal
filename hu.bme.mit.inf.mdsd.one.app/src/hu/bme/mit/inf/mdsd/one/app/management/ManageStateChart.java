package hu.bme.mit.inf.mdsd.one.app.management;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.one.app.composites.Preferences;
import hu.bme.mit.inf.mdsd.one.app.composites.PreferencesPage;
import hu.bme.mit.inf.mdsd.one.app.composites.SearchDialog;
import hu.bme.mit.inf.mdsd.one.app.statechart.TimerService;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.Futsal_report_generatorStatemachine;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.Futsal_report_generatorStatemachine.State;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.IFutsal_report_generatorStatemachine.SCITimerOperationCallback;

import java.util.Timer;
import java.util.TimerTask;

import model.Role;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class ManageStateChart implements IManageStateChart {

	private Futsal_report_generatorStatemachine sm = new Futsal_report_generatorStatemachine();
	private MainView view;

	private boolean updateTimeTaskScheduled = false;

	private Timer t;
	private Timer tH = null;
	private Timer tV = null;
	private ManageStateChartHelper helper;
	private ISearchHelper search;
	private static int stateDelay = 1500;

	protected class UpdateTimeTask extends TimerTask {

		private State s;

		public UpdateTimeTask(State starterState) {
			this.s = starterState;
		}

		@Override
		public void run() {
			view.modifyHomeTOs(sm.getSCITimer().getHome_timeout_enabled());
			view.modifyVisitorTOs(sm.getSCITimer().getVisitor_timeout_enabled());
			view.updateHomeFaultBtnText(helper.calculateFaultBtnText(sm
					.getSCIFouls().getHome_counter()));
			view.updateVisitorFaultBtnText(helper.calculateFaultBtnText(sm
					.getSCIFouls().getVisitors_counter()));

			if (!sm.isStateActive(s)) {
				updateTimeTaskScheduled = false;
				view.setManageTimeButtonText("Changing state...");
				try {
					Thread.sleep(stateDelay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				setTimeLabelText();
				setManageTimerBtnText(view);
				t.cancel();
			}
			updateTime();
		}

	}

	protected class FlashingButtonImageTask extends TimerTask {

		private String type;
		public static final String HOME = "home";
		public static final String VISITOR = "visitor";

		public FlashingButtonImageTask(String type) {
			this.type = type;
		}

		@Override
		public void run() {
			if (type.equals(HOME))
				view.changeHomeToBtnImage();
			if (type.equals(VISITOR))
				view.changeVisitorToBtnImage();
		}

	}

	protected class PlaySound implements SCITimerOperationCallback {

		@Override
		public void playSound() {
			new Thread() {

				@Override
				public void run() {
					helper.playSound();
				}
			}.start();
		}

	}

	public ManageStateChart(MainView view) {

		this.view = view;
		this.helper = new ManageStateChartHelper(sm, this);
		this.search = new SearchHelper(view.getModel());

		//helper.registerGoalCounts(view.getModel());

		sm.getSCITimer().setSCITimerOperationCallback(new PlaySound());
		sm.setTimerService(new TimerService());
		sm.enter();
		// Init state
		sm.runCycle();
		
		IPreferenceStore preferenceStore = PlatformUI.getPreferenceStore();
		{
			sm.getSCITimer().setBt_long(preferenceStore.getInt(PreferencesPage.BT_LONG));
			sm.getSCITimer().setEt_long(preferenceStore.getInt(PreferencesPage.ET_LONG));
			sm.getSCITimer().setHt_long(preferenceStore.getInt(PreferencesPage.HT_LONG));
			sm.getSCITimer().setTo_long(preferenceStore.getInt(PreferencesPage.TO_LONG));
		}

		// Waiting for state
		sm.getSCITimer().raiseContinue();
		sm.runCycle();
		setManageTimerBtnText(view);

		// Halftime state
		sm.getSCITimer().raiseContinue();
		sm.runCycle();

		setTimeLabelText();
	}

	private void setManageTimerBtnText(MainView view) {
		try {
			view.setManageTimeButtonText(helper.calculateManageTimeBtnText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setTimeLabelText() {
		int tick;
		try {
			tick = helper.getTick();
			int sec = tick / 60;
			int ms = tick - sec * 60;

			view.setTime(sec, ms);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateTime() {

		setTimeLabelText();
		setManageTimerBtnText(view);

		if (!helper.needToRunTimer()) {

			setManageTimerBtnText(view);

			sm.getSCITimer().raiseContinue();
			sm.runCycle();

			t.cancel();
			updateTimeTaskScheduled = false;

			setTimeLabelText();
		}

		sm.runCycle();
	}

	@Override
	public void manageTime() {
		if (!helper.needToRunTimer()) {
			sm.getSCITimer().raiseContinue();
			sm.runCycle();
		}

		if (!updateTimeTaskScheduled) {
			t = new Timer();
			t.scheduleAtFixedRate(
					new UpdateTimeTask(helper.getCurrentMatchState()), 0, 100);
			updateTimeTaskScheduled = true;
		} else {
			t.cancel();
			updateTimeTaskScheduled = false;
		}
		setManageTimerBtnText(view);
		setTimeLabelText();
	}

	@Override
	public void manageHomeFaults() {
		int home_counter = sm.getSCIFouls().getHome_counter() + 1;
		sm.getSCIFouls().setHome_counter(home_counter);
		view.updateHomeFaultBtnText(helper.calculateFaultBtnText(home_counter));
		sm.runCycle();
		if (home_counter == 5) {
			sm.getSCIFouls().raiseContinue();
			sm.runCycle();
		}
	}

	@Override
	public void manageVisitorFaults() {
		int visitor_counter = sm.getSCIFouls().getVisitors_counter() + 1;
		sm.getSCIFouls().setVisitors_counter(visitor_counter);
		view.updateVisitorFaultBtnText(helper
				.calculateFaultBtnText(visitor_counter));
		sm.runCycle();
		if (visitor_counter == 5) {
			sm.getSCIFouls().raiseContinue();
			sm.runCycle();
		}
	}

	@Override
	public void giveHomeYellowCard() {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();
				SearchDialog dialog = new SearchDialog(activeShell, SWT.CLOSE
						| SWT.APPLICATION_MODAL);
				dialog.setText("Search Home Player For Yellow Card");
				dialog.setLabelProvider(search.getRoleLabelProvider());
				dialog.setContentProvider(search
						.getHomeYellowsContentProvider());
				dialog.setInput(view.getModel());
				Role role = (Role) dialog.open();
				view.getManageModel().homeYellowCard(role, helper.getCurrentMatchTime());
			}
		});
	}

	@Override
	public void giveVisitorYellowCard() {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();
				SearchDialog dialog = new SearchDialog(activeShell, SWT.CLOSE
						| SWT.APPLICATION_MODAL);
				dialog.setText("Search Visitor Player For Yellow Card");
				dialog.setLabelProvider(search.getRoleLabelProvider());
				dialog.setContentProvider(search
						.getVisitorYellowsContentProvider());
				dialog.setInput(view.getModel());
				Role role = (Role) dialog.open();
				view.getManageModel().visitorYellowCard(role, helper.getCurrentMatchTime());
			}
		});
	}

	@Override
	public void giveHomeRedCard() {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();
				SearchDialog dialog = new SearchDialog(activeShell, SWT.CLOSE
						| SWT.APPLICATION_MODAL);
				dialog.setText("Search Home Player For Red Card");
				dialog.setLabelProvider(search.getRoleLabelProvider());
				dialog.setContentProvider(search.getHomeRedsContentProvider());
				dialog.setInput(view.getModel());
				Role role = (Role) dialog.open();
				view.getManageModel().homeRedCard(role, helper.getCurrentMatchTime());
			}
		});

	}

	@Override
	public void giveVisitorRedCard() {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();
				SearchDialog dialog = new SearchDialog(activeShell, SWT.CLOSE
						| SWT.APPLICATION_MODAL);
				dialog.setText("Search Visitor Player For Red Card");
				dialog.setLabelProvider(search.getRoleLabelProvider());
				dialog.setContentProvider(search
						.getVisitorRedsContentProvider());
				dialog.setInput(view.getModel());
				Role role = (Role) dialog.open();
				view.getManageModel().visitorRedCard(role, helper.getCurrentMatchTime());
			}
		});
	}

	@Override
	public void giveHomeGoal() {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();
				SearchDialog dialog = new SearchDialog(activeShell, SWT.CLOSE
						| SWT.APPLICATION_MODAL);
				dialog.setText("Search Home Scorer");
				dialog.setLabelProvider(search.getRoleLabelProvider());
				dialog.setContentProvider(search
						.getHomeScorersContentProvider());
				dialog.setInput(view.getModel());
				Role role = (Role) dialog.open();
				view.getManageModel().homeGoal(role, helper.getCurrentMatchTime());
			}
		});
	}

	@Override
	public void giveVisitorGoal() {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();
				SearchDialog dialog = new SearchDialog(activeShell, SWT.CLOSE
						| SWT.APPLICATION_MODAL);
				dialog.setText("Search Visitor Scorer");
				dialog.setLabelProvider(search.getRoleLabelProvider());
				dialog.setContentProvider(search
						.getVisitorScorersContentProvider());
				dialog.setInput(view.getModel());
				Role role = (Role) dialog.open();
				view.getManageModel().visitorGoal(role, helper.getCurrentMatchTime());
			}
		});
	}

	@Override
	public void useHomeTimeOut() {
		if (tH == null) {
			tH = new Timer();
			tH.scheduleAtFixedRate(new FlashingButtonImageTask(
					FlashingButtonImageTask.HOME), 0, 300);
		} else {
			tH.cancel();
			tH = null;
			view.setManageTimeButtonText("Start Timeout");
			view.defaultHomeToBtnImage();
			sm.getSCITimer().raiseHome_timeout();
			sm.runCycle();
			setTimeLabelText();
			view.modifyHomeTOs(false);
		}
	}

	@Override
	public void useVisitorTimeOut() {
		if (tV == null) {
			tV = new Timer();
			tV.scheduleAtFixedRate(new FlashingButtonImageTask(
					FlashingButtonImageTask.VISITOR), 0, 300);
		} else {
			tV.cancel();
			tV = null;
			view.setManageTimeButtonText("Start Timeout");
			view.defaultVisitorToBtnImage();
			sm.getSCITimer().raiseVisitor_timeout();
			sm.runCycle();
			setTimeLabelText();
			view.modifyVisitorTOs(false);
		}
	}

	public boolean isUpdateTimeTaskScheduled() {
		return updateTimeTaskScheduled;
	}

	public MainView getView() {
		return view;
	}
}
