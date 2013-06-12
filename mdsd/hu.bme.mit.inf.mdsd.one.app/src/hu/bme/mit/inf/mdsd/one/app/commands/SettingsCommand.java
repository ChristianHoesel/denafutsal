package hu.bme.mit.inf.mdsd.one.app.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.handlers.HandlerUtil;

public class SettingsCommand extends AbstractHandler {

	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Shell activeShell = HandlerUtil.getActiveShell(event);
		PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(activeShell, "hu.bme.mit.inf.mdsd.one.app.preference", new String[] {"hu.bme.mit.inf.mdsd.one.app.preference"}, null);
		dialog.open();
		return null;
	}
	
}
