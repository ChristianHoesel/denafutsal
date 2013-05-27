package hu.bme.mit.inf.mdsd.one.app.composites;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;

public class Preferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static final String PT_LONG = "pt_long";
	public static final String TO_LONG = "to_long";
	public static final String ET_LONG = "et_long";
	public static final String BT_LONG = "bt_long";
	public static final String HT_LONG = "ht_long";

	/**
	 * Create the preference page.
	 */
	public Preferences() {
		super(FLAT);
		setTitle("Match data");
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		addField(new IntegerFieldEditor(HT_LONG, "Halftime long (sec)",
				getFieldEditorParent()));
		addField(new IntegerFieldEditor(BT_LONG, "Breaktime long (sec)",
				getFieldEditorParent()));
		addField(new IntegerFieldEditor(ET_LONG, "Extratime long (sec)",
				getFieldEditorParent()));
		addField(new IntegerFieldEditor(TO_LONG, "Timeout long (sec)",
				getFieldEditorParent()));
		addField(new IntegerFieldEditor(PT_LONG, "Penalty long (sec)",
				getFieldEditorParent()));
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(PlatformUI.getPreferenceStore());
		setDescription("A demonstration of a preference page implementation");
	}
}
