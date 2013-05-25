package hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl;
import hu.bme.mit.inf.mdsd.one.app.statechart.TimeEvent;
import hu.bme.mit.inf.mdsd.one.app.statechart.ITimerService;

public class Futsal_report_generatorStatemachine
		implements
			IFutsal_report_generatorStatemachine {

	private final TimeEvent futsal_report_generator_main_region__1st_Halftime_time_event_0 = new TimeEvent(
			true, 0);
	private final TimeEvent futsal_report_generator_main_region__2nd_Halftime_time_event_0 = new TimeEvent(
			true, 1);
	private final TimeEvent futsal_report_generator_main_region_Breaktime_time_event_0 = new TimeEvent(
			true, 2);
	private final TimeEvent futsal_report_generator_main_region__1st_Visitor_Timeout_time_event_0 = new TimeEvent(
			true, 3);
	private final TimeEvent futsal_report_generator_main_region__1st_Home_Timeout_time_event_0 = new TimeEvent(
			true, 4);
	private final TimeEvent futsal_report_generator_main_region__2nd_Visitor_Timeout_time_event_0 = new TimeEvent(
			true, 5);
	private final TimeEvent futsal_report_generator_main_region__2nd_Home_Timeout_time_event_0 = new TimeEvent(
			true, 6);

	private final boolean[] timeEvents = new boolean[7];

	private final class SCITimerImpl implements SCITimer {

		private SCITimerOperationCallback operationCallback;

		public void setSCITimerOperationCallback(
				SCITimerOperationCallback operationCallback) {
			this.operationCallback = operationCallback;
		}

		private boolean pause;

		public void raisePause() {
			pause = true;
		}

		private boolean continue_ID;

		public void raiseContinue() {
			continue_ID = true;
		}

		private boolean stop;

		public void raiseStop() {
			stop = true;
		}

		private boolean extratime;

		public void raiseExtratime() {
			extratime = true;
		}

		private boolean end_breaktime;

		public void raiseEnd_breaktime() {
			end_breaktime = true;
		}

		private boolean home_timeout;

		public void raiseHome_timeout() {
			home_timeout = true;
		}

		private boolean visitor_timeout;

		public void raiseVisitor_timeout() {
			visitor_timeout = true;
		}

		private boolean pause_v;

		public boolean getPause_v() {
			return pause_v;
		}

		public void setPause_v(boolean value) {
			this.pause_v = value;
		}

		private boolean stop_v;

		public boolean getStop_v() {
			return stop_v;
		}

		public void setStop_v(boolean value) {
			this.stop_v = value;
		}

		private int tick;

		public int getTick() {
			return tick;
		}

		public void setTick(int value) {
			this.tick = value;
		}

		private int breaktime_tick;

		public int getBreaktime_tick() {
			return breaktime_tick;
		}

		public void setBreaktime_tick(int value) {
			this.breaktime_tick = value;
		}

		private int extratime_tick;

		public int getExtratime_tick() {
			return extratime_tick;
		}

		public void setExtratime_tick(int value) {
			this.extratime_tick = value;
		}

		private int timeout_tick;

		public int getTimeout_tick() {
			return timeout_tick;
		}

		public void setTimeout_tick(int value) {
			this.timeout_tick = value;
		}

		private boolean home_timeout_enabled;

		public boolean getHome_timeout_enabled() {
			return home_timeout_enabled;
		}

		public void setHome_timeout_enabled(boolean value) {
			this.home_timeout_enabled = value;
		}

		private boolean visitor_timeout_enabled;

		public boolean getVisitor_timeout_enabled() {
			return visitor_timeout_enabled;
		}

		public void setVisitor_timeout_enabled(boolean value) {
			this.visitor_timeout_enabled = value;
		}

		public void clearEvents() {
			pause = false;
			continue_ID = false;
			stop = false;
			extratime = false;
			end_breaktime = false;
			home_timeout = false;
			visitor_timeout = false;
		}

	}

	private SCITimerImpl sCITimer;
	private final class SCIFoulsImpl implements SCIFouls {

		private int home_counter;

		public int getHome_counter() {
			return home_counter;
		}

		public void setHome_counter(int value) {
			this.home_counter = value;
		}

		private int visitors_counter;

		public int getVisitors_counter() {
			return visitors_counter;
		}

		public void setVisitors_counter(int value) {
			this.visitors_counter = value;
		}

		private boolean home_done;

		public boolean getHome_done() {
			return home_done;
		}

		public void setHome_done(boolean value) {
			this.home_done = value;
		}

		private boolean visitor_done;

		public boolean getVisitor_done() {
			return visitor_done;
		}

		public void setVisitor_done(boolean value) {
			this.visitor_done = value;
		}

	}

	private SCIFoulsImpl sCIFouls;

	public enum State {
		main_region__1st_Halftime, main_region__2nd_Halftime, main_region__final_, main_region__1st_Extratime, main_region__2nd_Extratime, main_region_Breaktime, main_region_End_Match, main_region_End_2nd_Extratime, main_region__1st_Visitor_Timeout, main_region__1st_Home_Timeout, main_region_Init, main_region__2nd_Visitor_Timeout, main_region__2nd_Home_Timeout, main_region_Waiting_For_the_Start_of_1st_Halftime, main_region_Waiting_for_the_Start_of_Breaktime, fouls_Counting_Fouls, fouls_Doing_some_noise_to_Home, fouls_Doing_some_noise_to_Visitor, $NullState$
	};

	private final State[] stateVector = new State[2];

	private int nextStateIndex;

	private ITimerService timerService;

	private long cycleStartTime;

	public Futsal_report_generatorStatemachine() {

		sCITimer = new SCITimerImpl();
		sCIFouls = new SCIFoulsImpl();

		futsal_report_generator_main_region__1st_Halftime_time_event_0
				.setStatemachine(this);
		futsal_report_generator_main_region__2nd_Halftime_time_event_0
				.setStatemachine(this);
		futsal_report_generator_main_region_Breaktime_time_event_0
				.setStatemachine(this);
		futsal_report_generator_main_region__1st_Visitor_Timeout_time_event_0
				.setStatemachine(this);
		futsal_report_generator_main_region__1st_Home_Timeout_time_event_0
				.setStatemachine(this);
		futsal_report_generator_main_region__2nd_Visitor_Timeout_time_event_0
				.setStatemachine(this);
		futsal_report_generator_main_region__2nd_Home_Timeout_time_event_0
				.setStatemachine(this);
	}

	public void init() {
		if (timerService == null) {
			throw new IllegalStateException("TimerService not set.");
		}
		for (int i = 0; i < 2; i++) {
			stateVector[i] = State.$NullState$;
		}

		clearEvents();
		clearOutEvents();

		sCITimer.pause_v = false;

		sCITimer.stop_v = false;

		sCITimer.tick = 0;

		sCITimer.breaktime_tick = 0;

		sCITimer.extratime_tick = 0;

		sCITimer.timeout_tick = 0;

		sCITimer.home_timeout_enabled = false;

		sCITimer.visitor_timeout_enabled = false;

		sCIFouls.home_counter = 0;

		sCIFouls.visitors_counter = 0;

		sCIFouls.home_done = false;

		sCIFouls.visitor_done = false;
	}

	public void enter() {
		if (timerService == null) {
			throw new IllegalStateException("TimerService not set.");
		}
		cycleStartTime = timerService.getSystemTimeMillis();
		entryAction();

		sCITimer.home_timeout_enabled = true;

		sCITimer.visitor_timeout_enabled = true;

		sCITimer.raisePause();

		sCITimer.pause_v = true;

		sCITimer.stop_v = false;

		sCIFouls.home_counter = 0;

		sCIFouls.visitors_counter = 0;

		sCIFouls.home_done = false;

		sCIFouls.visitor_done = false;

		nextStateIndex = 0;
		stateVector[0] = State.main_region_Init;

		nextStateIndex = 1;
		stateVector[1] = State.fouls_Counting_Fouls;
	}

	public void exit() {
		switch (stateVector[0]) {
			case main_region__1st_Halftime :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				getTimerService()
						.resetTimer(
								futsal_report_generator_main_region__1st_Halftime_time_event_0);

				sCITimer.raisePause();

				sCITimer.pause_v = true;
				break;

			case main_region__2nd_Halftime :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				getTimerService()
						.resetTimer(
								futsal_report_generator_main_region__2nd_Halftime_time_event_0);

				sCITimer.pause_v = true;
				break;

			case main_region__final_ :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;
				break;

			case main_region__1st_Extratime :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				sCITimer.pause_v = true;

				sCITimer.operationCallback.playSound();
				break;

			case main_region__2nd_Extratime :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				sCITimer.operationCallback.playSound();
				break;

			case main_region_Breaktime :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				getTimerService()
						.resetTimer(
								futsal_report_generator_main_region_Breaktime_time_event_0);

				sCIFouls.home_counter = 0;

				sCIFouls.visitors_counter = 0;

				sCITimer.operationCallback.playSound();

				sCIFouls.home_done = false;

				sCIFouls.visitor_done = false;
				break;

			case main_region_End_Match :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;
				break;

			case main_region_End_2nd_Extratime :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				sCITimer.tick = 2 * 20 + 1 * 10;

				sCITimer.raiseStop();

				sCITimer.stop_v = true;
				break;

			case main_region__1st_Visitor_Timeout :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				getTimerService()
						.resetTimer(
								futsal_report_generator_main_region__1st_Visitor_Timeout_time_event_0);

				sCITimer.operationCallback.playSound();
				break;

			case main_region__1st_Home_Timeout :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				getTimerService()
						.resetTimer(
								futsal_report_generator_main_region__1st_Home_Timeout_time_event_0);
				break;

			case main_region_Init :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;
				break;

			case main_region__2nd_Visitor_Timeout :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				getTimerService()
						.resetTimer(
								futsal_report_generator_main_region__2nd_Visitor_Timeout_time_event_0);

				sCITimer.operationCallback.playSound();
				break;

			case main_region__2nd_Home_Timeout :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				getTimerService()
						.resetTimer(
								futsal_report_generator_main_region__2nd_Home_Timeout_time_event_0);

				sCITimer.operationCallback.playSound();
				break;

			case main_region_Waiting_For_the_Start_of_1st_Halftime :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				sCITimer.tick = 0;
				break;

			case main_region_Waiting_for_the_Start_of_Breaktime :
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;
				break;

			default :
				break;
		}

		switch (stateVector[1]) {
			case fouls_Counting_Fouls :
				nextStateIndex = 1;
				stateVector[1] = State.$NullState$;
				break;

			case fouls_Doing_some_noise_to_Home :
				nextStateIndex = 1;
				stateVector[1] = State.$NullState$;

				sCIFouls.home_done = true;
				break;

			case fouls_Doing_some_noise_to_Visitor :
				nextStateIndex = 1;
				stateVector[1] = State.$NullState$;

				sCIFouls.visitor_done = true;
				break;

			default :
				break;
		}

		exitAction();
	}

	protected void clearEvents() {
		sCITimer.clearEvents();

		for (int i = 0; i < timeEvents.length; i++) {
			timeEvents[i] = false;
		}
	}

	protected void clearOutEvents() {
	}

	public boolean isStateActive(State state) {
		switch (state) {
			case main_region__1st_Halftime :
				return stateVector[0] == State.main_region__1st_Halftime;
			case main_region__2nd_Halftime :
				return stateVector[0] == State.main_region__2nd_Halftime;
			case main_region__final_ :
				return stateVector[0] == State.main_region__final_;
			case main_region__1st_Extratime :
				return stateVector[0] == State.main_region__1st_Extratime;
			case main_region__2nd_Extratime :
				return stateVector[0] == State.main_region__2nd_Extratime;
			case main_region_Breaktime :
				return stateVector[0] == State.main_region_Breaktime;
			case main_region_End_Match :
				return stateVector[0] == State.main_region_End_Match;
			case main_region_End_2nd_Extratime :
				return stateVector[0] == State.main_region_End_2nd_Extratime;
			case main_region__1st_Visitor_Timeout :
				return stateVector[0] == State.main_region__1st_Visitor_Timeout;
			case main_region__1st_Home_Timeout :
				return stateVector[0] == State.main_region__1st_Home_Timeout;
			case main_region_Init :
				return stateVector[0] == State.main_region_Init;
			case main_region__2nd_Visitor_Timeout :
				return stateVector[0] == State.main_region__2nd_Visitor_Timeout;
			case main_region__2nd_Home_Timeout :
				return stateVector[0] == State.main_region__2nd_Home_Timeout;
			case main_region_Waiting_For_the_Start_of_1st_Halftime :
				return stateVector[0] == State.main_region_Waiting_For_the_Start_of_1st_Halftime;
			case main_region_Waiting_for_the_Start_of_Breaktime :
				return stateVector[0] == State.main_region_Waiting_for_the_Start_of_Breaktime;
			case fouls_Counting_Fouls :
				return stateVector[1] == State.fouls_Counting_Fouls;
			case fouls_Doing_some_noise_to_Home :
				return stateVector[1] == State.fouls_Doing_some_noise_to_Home;
			case fouls_Doing_some_noise_to_Visitor :
				return stateVector[1] == State.fouls_Doing_some_noise_to_Visitor;
			default :
				return false;
		}
	}

	public void setTimerService(ITimerService timerService) {
		this.timerService = timerService;
	}

	public ITimerService getTimerService() {
		return timerService;
	}

	public void onTimeEventRaised(TimeEvent timeEvent) {
		timeEvents[timeEvent.getIndex()] = true;
	}

	public SCITimer getSCITimer() {
		return sCITimer;
	}
	public SCIFouls getSCIFouls() {
		return sCIFouls;
	}

	/* Entry action for statechart 'futsal_report_generator'. */
	private void entryAction() {
	}

	/* Exit action for state 'futsal_report_generator'. */
	private void exitAction() {
	}

	/* The reactions of state 1st Halftime. */
	private void reactMain_region_1st_Halftime() {
		if (sCITimer.tick >= 1 * 20) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			getTimerService()
					.resetTimer(
							futsal_report_generator_main_region__1st_Halftime_time_event_0);

			sCITimer.raisePause();

			sCITimer.pause_v = true;

			sCITimer.operationCallback.playSound();

			sCITimer.tick = 1 * 20;

			nextStateIndex = 0;
			stateVector[0] = State.main_region_Waiting_for_the_Start_of_Breaktime;
		} else {
			if (sCITimer.visitor_timeout && sCITimer.visitor_timeout_enabled) {
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				getTimerService()
						.resetTimer(
								futsal_report_generator_main_region__1st_Halftime_time_event_0);

				sCITimer.raisePause();

				sCITimer.pause_v = true;

				getTimerService()
						.setTimer(
								futsal_report_generator_main_region__1st_Visitor_Timeout_time_event_0,
								1, cycleStartTime);

				sCITimer.visitor_timeout_enabled = false;

				nextStateIndex = 0;
				stateVector[0] = State.main_region__1st_Visitor_Timeout;
			} else {
				if (sCITimer.home_timeout && sCITimer.home_timeout_enabled) {
					nextStateIndex = 0;
					stateVector[0] = State.$NullState$;

					getTimerService()
							.resetTimer(
									futsal_report_generator_main_region__1st_Halftime_time_event_0);

					sCITimer.raisePause();

					sCITimer.pause_v = true;

					getTimerService()
							.setTimer(
									futsal_report_generator_main_region__1st_Home_Timeout_time_event_0,
									1, cycleStartTime);

					sCITimer.home_timeout_enabled = false;

					sCITimer.operationCallback.playSound();

					nextStateIndex = 0;
					stateVector[0] = State.main_region__1st_Home_Timeout;
				} else {
					if (timeEvents[futsal_report_generator_main_region__1st_Halftime_time_event_0
							.getIndex()]) {
						sCITimer.tick += 1;
					}
				}
			}
		}
	}

	/* The reactions of state 2nd Halftime. */
	private void reactMain_region_2nd_Halftime() {
		if (sCITimer.tick >= 2 * 20) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			getTimerService()
					.resetTimer(
							futsal_report_generator_main_region__2nd_Halftime_time_event_0);

			sCITimer.pause_v = true;

			sCITimer.tick = 2 * 200;

			sCITimer.operationCallback.playSound();

			nextStateIndex = 0;
			stateVector[0] = State.main_region_End_Match;
		} else {
			if (sCITimer.home_timeout && sCITimer.home_timeout_enabled) {
				nextStateIndex = 0;
				stateVector[0] = State.$NullState$;

				getTimerService()
						.resetTimer(
								futsal_report_generator_main_region__2nd_Halftime_time_event_0);

				sCITimer.pause_v = true;

				getTimerService()
						.setTimer(
								futsal_report_generator_main_region__2nd_Home_Timeout_time_event_0,
								1, cycleStartTime);

				sCITimer.home_timeout_enabled = false;

				nextStateIndex = 0;
				stateVector[0] = State.main_region__2nd_Home_Timeout;
			} else {
				if (sCITimer.visitor_timeout
						&& sCITimer.visitor_timeout_enabled) {
					nextStateIndex = 0;
					stateVector[0] = State.$NullState$;

					getTimerService()
							.resetTimer(
									futsal_report_generator_main_region__2nd_Halftime_time_event_0);

					sCITimer.pause_v = true;

					getTimerService()
							.setTimer(
									futsal_report_generator_main_region__2nd_Visitor_Timeout_time_event_0,
									1, cycleStartTime);

					sCITimer.visitor_timeout_enabled = false;

					nextStateIndex = 0;
					stateVector[0] = State.main_region__2nd_Visitor_Timeout;
				} else {
					if (timeEvents[futsal_report_generator_main_region__2nd_Halftime_time_event_0
							.getIndex()]) {
						sCITimer.tick += 1;
					}
				}
			}
		}
	}

	/* The reactions of state null. */
	private void reactMain_region__final_0() {
	}

	/* The reactions of state 1st Extratime. */
	private void reactMain_region_1st_Extratime() {
		if (sCITimer.tick >= 2 * 20 + 1 * 10) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			sCITimer.pause_v = true;

			sCITimer.operationCallback.playSound();

			sCITimer.tick = 2 * 20 + 1 * 10;

			nextStateIndex = 0;
			stateVector[0] = State.main_region__2nd_Extratime;
		}
	}

	/* The reactions of state 2nd Extratime. */
	private void reactMain_region_2nd_Extratime() {
		if (sCITimer.tick >= 2 * 20 + 2 * 10) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			sCITimer.operationCallback.playSound();

			nextStateIndex = 0;
			stateVector[0] = State.main_region_End_2nd_Extratime;
		}
	}

	/* The reactions of state Breaktime. */
	private void reactMain_region_Breaktime() {
		if (sCITimer.breaktime_tick >= 15 || sCITimer.end_breaktime) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			getTimerService().resetTimer(
					futsal_report_generator_main_region_Breaktime_time_event_0);

			sCIFouls.home_counter = 0;

			sCIFouls.visitors_counter = 0;

			sCITimer.operationCallback.playSound();

			sCIFouls.home_done = false;

			sCIFouls.visitor_done = false;

			getTimerService()
					.setTimer(
							futsal_report_generator_main_region__2nd_Halftime_time_event_0,
							1, cycleStartTime);

			nextStateIndex = 0;
			stateVector[0] = State.main_region__2nd_Halftime;
		} else {
			if (timeEvents[futsal_report_generator_main_region_Breaktime_time_event_0
					.getIndex()]) {
				sCITimer.breaktime_tick += 1;
			}
		}
	}

	/* The reactions of state End Match. */
	private void reactMain_region_End_Match() {
		if (sCITimer.extratime) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			nextStateIndex = 0;
			stateVector[0] = State.main_region__1st_Extratime;
		}
	}

	/* The reactions of state End 2nd Extratime. */
	private void reactMain_region_End_2nd_Extratime() {
	}

	/* The reactions of state 1st Visitor Timeout. */
	private void reactMain_region_1st_Visitor_Timeout() {
		if (sCITimer.timeout_tick >= 60) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			getTimerService()
					.resetTimer(
							futsal_report_generator_main_region__1st_Visitor_Timeout_time_event_0);

			sCITimer.operationCallback.playSound();

			getTimerService()
					.setTimer(
							futsal_report_generator_main_region__1st_Halftime_time_event_0,
							1, cycleStartTime);

			nextStateIndex = 0;
			stateVector[0] = State.main_region__1st_Halftime;
		} else {
			if (timeEvents[futsal_report_generator_main_region__1st_Visitor_Timeout_time_event_0
					.getIndex()]) {
				sCITimer.timeout_tick += 1;
			}
		}
	}

	/* The reactions of state 1st Home Timeout. */
	private void reactMain_region_1st_Home_Timeout() {
		if (sCITimer.timeout_tick >= 60) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			getTimerService()
					.resetTimer(
							futsal_report_generator_main_region__1st_Home_Timeout_time_event_0);

			getTimerService()
					.setTimer(
							futsal_report_generator_main_region__1st_Halftime_time_event_0,
							1, cycleStartTime);

			nextStateIndex = 0;
			stateVector[0] = State.main_region__1st_Halftime;
		} else {
			if (timeEvents[futsal_report_generator_main_region__1st_Home_Timeout_time_event_0
					.getIndex()]) {
				sCITimer.timeout_tick += 1;
			}
		}
	}

	/* The reactions of state Init. */
	private void reactMain_region_Init() {
		if (sCITimer.continue_ID) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			nextStateIndex = 0;
			stateVector[0] = State.main_region_Waiting_For_the_Start_of_1st_Halftime;
		}
	}

	/* The reactions of state 2nd Visitor Timeout. */
	private void reactMain_region_2nd_Visitor_Timeout() {
		if (sCITimer.timeout_tick >= 60) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			getTimerService()
					.resetTimer(
							futsal_report_generator_main_region__2nd_Visitor_Timeout_time_event_0);

			sCITimer.operationCallback.playSound();

			getTimerService()
					.setTimer(
							futsal_report_generator_main_region__2nd_Halftime_time_event_0,
							1, cycleStartTime);

			nextStateIndex = 0;
			stateVector[0] = State.main_region__2nd_Halftime;
		} else {
			if (timeEvents[futsal_report_generator_main_region__2nd_Visitor_Timeout_time_event_0
					.getIndex()]) {
				sCITimer.timeout_tick += 1;
			}
		}
	}

	/* The reactions of state 2nd Home Timeout. */
	private void reactMain_region_2nd_Home_Timeout() {
		if (sCITimer.timeout_tick >= 60) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			getTimerService()
					.resetTimer(
							futsal_report_generator_main_region__2nd_Home_Timeout_time_event_0);

			sCITimer.operationCallback.playSound();

			getTimerService()
					.setTimer(
							futsal_report_generator_main_region__2nd_Halftime_time_event_0,
							1, cycleStartTime);

			nextStateIndex = 0;
			stateVector[0] = State.main_region__2nd_Halftime;
		} else {
			if (timeEvents[futsal_report_generator_main_region__2nd_Home_Timeout_time_event_0
					.getIndex()]) {
				sCITimer.timeout_tick += 1;
			}
		}
	}

	/* The reactions of state Waiting For the Start of 1st Halftime. */
	private void reactMain_region_Waiting_For_the_Start_of_1st_Halftime() {
		if (sCITimer.continue_ID) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			sCITimer.tick = 0;

			getTimerService()
					.setTimer(
							futsal_report_generator_main_region__1st_Halftime_time_event_0,
							1, cycleStartTime);

			nextStateIndex = 0;
			stateVector[0] = State.main_region__1st_Halftime;
		}
	}

	/* The reactions of state Waiting for the Start of Breaktime. */
	private void reactMain_region_Waiting_for_the_Start_of_Breaktime() {
		if (sCITimer.continue_ID) {
			nextStateIndex = 0;
			stateVector[0] = State.$NullState$;

			getTimerService().setTimer(
					futsal_report_generator_main_region_Breaktime_time_event_0,
					1, cycleStartTime);

			sCITimer.home_timeout_enabled = true;

			sCITimer.visitor_timeout_enabled = true;

			nextStateIndex = 0;
			stateVector[0] = State.main_region_Breaktime;
		}
	}

	/* The reactions of state Counting Fouls. */
	private void reactFouls_Counting_Fouls() {
		if (sCIFouls.home_counter == 5 && !sCIFouls.home_done) {
			nextStateIndex = 1;
			stateVector[1] = State.$NullState$;

			sCITimer.operationCallback.playSound();

			nextStateIndex = 1;
			stateVector[1] = State.fouls_Doing_some_noise_to_Home;
		} else {
			if (sCIFouls.visitors_counter == 5 && !sCIFouls.visitor_done) {
				nextStateIndex = 1;
				stateVector[1] = State.$NullState$;

				sCITimer.operationCallback.playSound();

				nextStateIndex = 1;
				stateVector[1] = State.fouls_Doing_some_noise_to_Visitor;
			}
		}
	}

	/* The reactions of state Doing some noise to Home. */
	private void reactFouls_Doing_some_noise_to_Home() {
	}

	/* The reactions of state Doing some noise to Visitor. */
	private void reactFouls_Doing_some_noise_to_Visitor() {
	}

	public void runCycle() {

		cycleStartTime = timerService.getSystemTimeMillis();

		clearOutEvents();

		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {

			switch (stateVector[nextStateIndex]) {
				case main_region__1st_Halftime :
					reactMain_region_1st_Halftime();
					break;
				case main_region__2nd_Halftime :
					reactMain_region_2nd_Halftime();
					break;
				case main_region__final_ :
					reactMain_region__final_0();
					break;
				case main_region__1st_Extratime :
					reactMain_region_1st_Extratime();
					break;
				case main_region__2nd_Extratime :
					reactMain_region_2nd_Extratime();
					break;
				case main_region_Breaktime :
					reactMain_region_Breaktime();
					break;
				case main_region_End_Match :
					reactMain_region_End_Match();
					break;
				case main_region_End_2nd_Extratime :
					reactMain_region_End_2nd_Extratime();
					break;
				case main_region__1st_Visitor_Timeout :
					reactMain_region_1st_Visitor_Timeout();
					break;
				case main_region__1st_Home_Timeout :
					reactMain_region_1st_Home_Timeout();
					break;
				case main_region_Init :
					reactMain_region_Init();
					break;
				case main_region__2nd_Visitor_Timeout :
					reactMain_region_2nd_Visitor_Timeout();
					break;
				case main_region__2nd_Home_Timeout :
					reactMain_region_2nd_Home_Timeout();
					break;
				case main_region_Waiting_For_the_Start_of_1st_Halftime :
					reactMain_region_Waiting_For_the_Start_of_1st_Halftime();
					break;
				case main_region_Waiting_for_the_Start_of_Breaktime :
					reactMain_region_Waiting_for_the_Start_of_Breaktime();
					break;
				case fouls_Counting_Fouls :
					reactFouls_Counting_Fouls();
					break;
				case fouls_Doing_some_noise_to_Home :
					reactFouls_Doing_some_noise_to_Home();
					break;
				case fouls_Doing_some_noise_to_Visitor :
					reactFouls_Doing_some_noise_to_Visitor();
					break;
				default :
					// $NullState$
			}
		}

		clearEvents();
	}
}
