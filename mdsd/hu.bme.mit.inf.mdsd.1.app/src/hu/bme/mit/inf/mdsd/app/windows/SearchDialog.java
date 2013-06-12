package hu.bme.mit.inf.mdsd.app.windows;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Button;

public class SearchDialog extends Dialog {

	protected Object result;
	protected Shell shlSearchDialog;
	private Text text;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public SearchDialog(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlSearchDialog.open();
		shlSearchDialog.layout();
		Display display = getParent().getDisplay();
		while (!shlSearchDialog.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlSearchDialog = new Shell(getParent(), getStyle());
		shlSearchDialog.setSize(450, 300);
		shlSearchDialog.setText("Search Dialog");
		
		text = new Text(shlSearchDialog, SWT.BORDER);
		text.setBounds(10, 10, 424, 26);
		
		List list = new List(shlSearchDialog, SWT.BORDER);
		list.setBounds(10, 42, 424, 195);
		
		Button btnNewButton = new Button(shlSearchDialog, SWT.NONE);
		btnNewButton.setBounds(359, 243, 75, 25);
		btnNewButton.setText("Ok");

	}
}
