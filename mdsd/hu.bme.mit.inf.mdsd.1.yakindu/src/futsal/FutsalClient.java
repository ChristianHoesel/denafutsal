package futsal;

import org.yakindu.scr.TimerService;
import org.yakindu.scr.futsal_report_generator.Futsal_report_generatorStatemachine;
import org.yakindu.scr.futsal_report_generator.Futsal_report_generatorStatemachine.State;

public class FutsalClient {

	private static void Init() {
		System.out.println(String
				.format("Állapot: %s", State.match_region_Init));
		// TODO Ide jönne a Match inicializálása
	}

	private static void sleep(Futsal_report_generatorStatemachine sm, int limit)
			throws InterruptedException {
		for (int i = 0; i < limit; i++) {
			Thread.sleep(100);
			sm.runCycle();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// Inicializálás:
		Futsal_report_generatorStatemachine sm = new Futsal_report_generatorStatemachine();
		sm.setTimerService(new TimerService());
		sm.enter();

		if (sm.isStateActive(State.match_region_Init)) {
			Init();
		}
		

		sm.getSCIController().raiseNext_state();
		sm.runCycle();

		if (sm.isStateActive(State.match_region_Waiting_For_the_Start_of_1st_Halftime)) {
			System.out.println(String.format("Állapot: %s",
					State.match_region_Waiting_For_the_Start_of_1st_Halftime));
		}
		sm.runCycle();

		sm.getSCITimer().raiseContinue();
		sm.runCycle();

		if (sm.isStateActive(State.match_region__1st_Halftime)) {
			System.out.println(String.format("Állapot: %s",
					State.match_region__1st_Halftime));
			sm.runCycle();

			sleep(sm, 10);
			System.out.println(sm.getSCITimer().getTick());
		}
		sm.runCycle();

		sm.exit();

		System.exit(0);
	}
}
