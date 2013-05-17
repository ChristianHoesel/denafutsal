package futsal;

import org.yakindu.scr.TimerService;
import org.yakindu.scr.futsal_report_generator.Futsal_report_generatorStatemachine;
import org.yakindu.scr.futsal_report_generator.Futsal_report_generatorStatemachine.State;

public class FutsalClient {

	public static void main(String[] args) throws InterruptedException {
		Futsal_report_generatorStatemachine sm = new Futsal_report_generatorStatemachine();
		sm.setTimerService(new TimerService());
		sm.enter();
		if (sm.isStateActive(State.match_region_Init)) {
			System.out.println("Itt vagyunk az Init-ben");
		}
		

		System.out.println(sm.isStateActive(State.match_region_Waiting_For_the_Start_of_1st_Halftime));

	}
}
