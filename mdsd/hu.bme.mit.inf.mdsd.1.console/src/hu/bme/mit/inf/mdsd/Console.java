package hu.bme.mit.inf.mdsd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.yakindu.scr.TimerService;
import org.yakindu.scr.futsal_report_generator.Futsal_report_generatorStatemachine;
import org.yakindu.scr.futsal_report_generator.Futsal_report_generatorStatemachine.State;
import org.yakindu.scr.RuntimeService;

public class Console {

	private Futsal_report_generatorStatemachine sm;

	public static int getNumberFromConsole() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		System.out.print("Choose a number: ");
		try {
			String i_str = br.readLine();
			i = Integer.parseInt(i_str);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Format!");
			i = -1;
		}
		return i;
	}

	public void god(int i) {
		switch (i) {
		case 1:
			sm.getSCITimer().raisePause();
			sm.runCycle();
			System.out.println("raisePause");
			break;
		case 2:
			sm.getSCITimer().raiseContinue();
			sm.runCycle();
			System.out.println("raiseContinue");
			break;
		case 3:
			sm.getSCITimer().raiseStop();
			sm.runCycle();
			System.out.println("raiseStop");
			break;
		case 4:
			sm.getSCIController().raiseNext_state();
			sm.runCycle();
			System.out.println("raiseNext_state");
			break;
		default:
			break;
		}
	}

	public String getState() {
		String state = "";
		if (sm.isStateActive(State.match_region_Init)) {
			state = "match_region_Init";
		} else if (sm
				.isStateActive(State.match_region_Waiting_For_the_Start_of_1st_Halftime)) {
			state = "match_region_Waiting_For_the_Start_of_1st_Halftime";
		} else {
			state = "Undefined";
		}

		return state;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Inicializálás:

		Console c = new Console();

		c.sm = new Futsal_report_generatorStatemachine();
		c.sm.setTimerService(new TimerService());
		c.sm.enter();

		RuntimeService.getInstance().registerStatemachine(c.sm, 100);

		Boolean loop_running = true;

		while (loop_running) {

			System.out.println();
			System.out.println(String.format("Aktuális állapot: %s - %d",
					c.getState(), c.sm.getSCITimer().getTick()));
			System.out.println();
			System.out.println("1. Pause");
			System.out.println("2. Continue");
			System.out.println("3. Stop");
			System.out.println("4. Next");

			System.out.println();
			int i = getNumberFromConsole();
			if (i == 0) {
				loop_running = false;
				c.sm.getTimerService().cancel();
				RuntimeService.getInstance().cancelTimer();
			} else {
				c.god(i);
			}

		}

	}

}
