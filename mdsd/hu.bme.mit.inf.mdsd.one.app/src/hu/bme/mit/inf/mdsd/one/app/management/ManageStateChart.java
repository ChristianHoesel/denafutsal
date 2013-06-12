package hu.bme.mit.inf.mdsd.one.app.management;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.one.app.composites.Penalties;
import hu.bme.mit.inf.mdsd.one.app.composites.PreferencesPage;
import hu.bme.mit.inf.mdsd.one.app.composites.SearchDialog;
import hu.bme.mit.inf.mdsd.one.app.statechart.TimerService;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.Futsal_report_generatorStatemachine;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.Futsal_report_generatorStatemachine.State;
import hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl.IFutsal_report_generatorStatemachine.SCITimerOperationCallback;

import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

import model.Event;
import model.Match;
import model.Player;
import model.Role;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import databinding.redwithbans.RedWithBansMatch;
import databinding.redwithbans.RedWithBansMatcher;

public class ManageStateChart implements IManageStateChart {

	private Futsal_report_generatorStatemachine sm = new Futsal_report_generatorStatemachine();
	private MainView view;

	private boolean updateTimeTaskScheduled = false;

	private Timer t;
	private Timer tH = null;
	private Timer tV = null;
	private int pt_long = 0;
	private ManageStateChartHelper helper;
	private ISearchHelper search;
	private static int stateDelay = 1500;

	public int getBanTime() {
		return pt_long;
	}

	protected class UpdateTimeTask extends TimerTask {

		private State s;

		public UpdateTimeTask(State starterState) {
			this.s = starterState;
			int a = 2;
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

		setGoalsLabel();

		// helper.registerGoalCounts(view.getModel());

		sm.getSCITimer().setSCITimerOperationCallback(new PlaySound());
		sm.setTimerService(new TimerService());
		sm.enter();
		// Init state
		sm.runCycle();

		IPreferenceStore preferenceStore = PlatformUI.getPreferenceStore();
		{
			sm.getSCITimer().setBt_long(
					preferenceStore.getInt(PreferencesPage.BT_LONG));
			sm.getSCITimer().setEt_long(
					preferenceStore.getInt(PreferencesPage.ET_LONG));
			sm.getSCITimer().setHt_long(
					preferenceStore.getInt(PreferencesPage.HT_LONG));
			sm.getSCITimer().setTo_long(
					preferenceStore.getInt(PreferencesPage.TO_LONG));

			pt_long = preferenceStore.getInt(PreferencesPage.PT_LONG);
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
			t.cancel();
			updateTimeTaskScheduled = false;
		}
	}

	private void setBansTime() throws Exception {
		Match model = view.getModel();
		EList<Event> homeGoals = model.getHome().getGoals();
		Event homeLastGoal = null;
		if (!homeGoals.isEmpty())
			homeLastGoal = homeGoals.get(homeGoals.size() - 1);
		EList<Event> visitorGoals = model.getVisitor().getGoals();
		Event visitorLastGoal = null;
		if (!visitorGoals.isEmpty())
			visitorLastGoal = visitorGoals.get(visitorGoals.size() - 1);

		RedWithBansMatcher matcherHome = RedWithBansMatcher.factory()
				.getMatcher(view.getModel());
		Collection<RedWithBansMatch> homeBans = matcherHome.getAllMatches(view
				.getModel().getHome(), null);

		RedWithBansMatcher matcherVisitor = RedWithBansMatcher.factory()
				.getMatcher(view.getModel());
		Collection<RedWithBansMatch> visitorBans = matcherVisitor
				.getAllMatches(view.getModel().getVisitor(), null);

		String h = helper.calculateBanStr(homeBans, visitorLastGoal);
		String v = helper.calculateBanStr(visitorBans, homeLastGoal);

		view.setBanTimes("  " + h, v + "  ");
	}

	private void setGoalsLabel() {
		view.setScore(view.getModel().getHome().getGoalCount(), view.getModel()
				.getVisitor().getGoalCount());
	}

	@Override
	public void updateTime() {

		setTimeLabelText();
		setManageTimerBtnText(view);
		try {
			setBansTime();
			setGoalsLabel();
		} catch (Exception e) {
			e.printStackTrace();
		}

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
		
		//new Penalties(Display.getCurrent().getActiveShell()).open();
		
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
				view.getManageModel().homeYellowCard(role,
						helper.getCurrentMatchTime());
				view.updateTable();
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
				view.getManageModel().visitorYellowCard(role,
						helper.getCurrentMatchTime());
				view.updateTable();
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

				if (role == null)
					return;
				if (role instanceof Player) {
					int style = SWT.ICON_QUESTION | SWT.YES | SWT.NO
							| SWT.CANCEL;

					MessageBox messageBox = new MessageBox(activeShell, style);
					messageBox.setMessage("Would you like to give a ban too?");

					int ban = messageBox.open();
					if (ban == SWT.CANCEL)
						return;
					if (ban == SWT.YES) {
						view.getManageModel().homeRedCardWithBan(role,
								helper.getCurrentMatchTime());
						try {
							setBansTime();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return;
					}

				}

				view.getManageModel().homeRedCard(role,
						helper.getCurrentMatchTime());
				view.updateTable();
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

				if (role == null)
					return;
				if (role instanceof Player) {
					int style = SWT.ICON_QUESTION | SWT.YES | SWT.NO
							| SWT.CANCEL;

					MessageBox messageBox = new MessageBox(activeShell, style);
					messageBox.setMessage("Would you like to give a ban too?");

					int ban = messageBox.open();
					if (ban == SWT.CANCEL)
						return;
					if (ban == SWT.YES) {
						view.getManageModel().visitorRedCardWithBan(role,
								helper.getCurrentMatchTime());
						try {
							setBansTime();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return;
					}
				}

				view.getManageModel().visitorRedCard(role,
						helper.getCurrentMatchTime());
				view.updateTable();
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
				view.getManageModel().homeGoal(role,
						helper.getCurrentMatchTime());

				try {
					setBansTime();
					setGoalsLabel();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				view.updateTable();
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
				view.getManageModel().visitorGoal(role,
						helper.getCurrentMatchTime());

				try {
					setBansTime();
					setGoalsLabel();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				view.updateTable();
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
