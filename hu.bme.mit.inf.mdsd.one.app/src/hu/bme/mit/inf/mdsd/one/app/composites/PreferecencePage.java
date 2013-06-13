package hu.bme.mit.inf.mdsd.one.app.composites;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;

public class PreferecencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	/**
	 * Create the preference page.
	 */
	public PreferecencePage() {
		setTitle("Match settings");
	}

	/**
	 * Create contents of the preference page.
	 * @param parent
	 */
	@Override
	public Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		
		Label lblHalfTimeLong = new Label(container, SWT.NONE);
		lblHalfTimeLong.setBounds(10, 10, 114, 15);
		lblHalfTimeLong.setText("Halftime long:");
		
		Label lblBreaktimeLong = new Label(container, SWT.NONE);
		lblBreaktimeLong.setBounds(10, 38, 114, 15);
		lblBreaktimeLong.setText("Breaktime long:");
		
		Label lblTimeoutLong = new Label(container, SWT.NONE);
		lblTimeoutLong.setBounds(10, 66, 114, 15);
		lblTimeoutLong.setText("Timeout long:");
		
		Spinner spinner = new Spinner(container, SWT.BORDER);
		spinner.setBounds(130, 7, 47, 22);
		
		Spinner spinner_1 = new Spinner(container, SWT.BORDER);
		spinner_1.setBounds(130, 35, 47, 22);
		
		Spinner spinner_2 = new Spinner(container, SWT.BORDER);
		spinner_2.setBounds(130, 63, 47, 22);
		
		Label lblMin = new Label(container, SWT.NONE);
		lblMin.setBounds(183, 10, 21, 15);
		lblMin.setText("min");
		
		Label lblMind = new Label(container, SWT.NONE);
		lblMind.setBounds(183, 38, 21, 15);
		lblMind.setText("min");
		
		Label lblMin_1 = new Label(container, SWT.NONE);
		lblMin_1.setBounds(183, 66, 21, 15);
		lblMin_1.setText("min");
		
		Spinner spinner_3 = new Spinner(container, SWT.BORDER);
		spinner_3.setBounds(210, 7, 47, 22);
		
		Spinner spinner_4 = new Spinner(container, SWT.BORDER);
		spinner_4.setBounds(210, 35, 47, 22);
		
		Spinner spinner_5 = new Spinner(container, SWT.BORDER);
		spinner_5.setBounds(210, 63, 47, 22);
		
		Label lblSec = new Label(container, SWT.NONE);
		lblSec.setBounds(263, 10, 55, 15);
		lblSec.setText("sec");
		
		Label lblSec_1 = new Label(container, SWT.NONE);
		lblSec_1.setBounds(263, 38, 55, 15);
		lblSec_1.setText("sec");
		
		Label lblSec_2 = new Label(container, SWT.NONE);
		lblSec_2.setBounds(263, 66, 55, 15);
		lblSec_2.setText("sec");

		return container;
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}
}