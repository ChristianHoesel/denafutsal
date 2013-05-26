package hu.bme.mit.inf.mdsd.one.app.statechart.futsal_report_generatorimpl;
import hu.bme.mit.inf.mdsd.one.app.statechart.IStatemachine;
import hu.bme.mit.inf.mdsd.one.app.statechart.ITimedStatemachine;

public interface IFutsal_report_generatorStatemachine
		extends
			ITimedStatemachine,
			IStatemachine {

	public interface SCITimer {
		public void raisePause();
		public void raiseContinue();
		public void raiseStop();
		public void raiseEnd_breaktime();
		public void raiseHome_timeout();
		public void raiseVisitor_timeout();
		public int getHt_long();
		public void setHt_long(int value);
		public int getBt_long();
		public void setBt_long(int value);
		public int getEt_long();
		public void setEt_long(int value);
		public int getTo_long();
		public void setTo_long(int value);
		public boolean getPause_v();
		public void setPause_v(boolean value);
		public boolean getStop_v();
		public void setStop_v(boolean value);
		public int getTick();
		public void setTick(int value);
		public int getBreaktime_tick();
		public void setBreaktime_tick(int value);
		public int getTimeout_tick();
		public void setTimeout_tick(int value);
		public boolean getHome_timeout_enabled();
		public void setHome_timeout_enabled(boolean value);
		public boolean getVisitor_timeout_enabled();
		public void setVisitor_timeout_enabled(boolean value);

		public void setSCITimerOperationCallback(
				SCITimerOperationCallback operationCallback);
	}

	public interface SCITimerOperationCallback {
		public void playSound();
	}

	public SCITimer getSCITimer();

	public interface SCIFouls {
		public void raiseContinue();
		public int getHome_counter();
		public void setHome_counter(int value);
		public int getVisitors_counter();
		public void setVisitors_counter(int value);
		public boolean getHome_done();
		public void setHome_done(boolean value);
		public boolean getVisitor_done();
		public void setVisitor_done(boolean value);

	}

	public SCIFouls getSCIFouls();

}
