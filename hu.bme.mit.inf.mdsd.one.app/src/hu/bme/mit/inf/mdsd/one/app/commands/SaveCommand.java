package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.one.app.management.ManageModelHelper;
import model.Match;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.handlers.HandlerUtil;

public class SaveCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	
		FileDialog dd = new FileDialog (HandlerUtil.getActiveShell(event),
				SWT.SAVE);
		dd.setText("Select folder to save model");
		String[] filterExt = { "*.model" };
		dd.setFilterExtensions(filterExt);
		String selected = dd.open();

		if (selected == null)
			return null;
		
		MainView activePart = (MainView) HandlerUtil.getActivePart(event);
		Match model = activePart.getModel();
		
		ManageModelHelper.saveModelToFile(selected, model);
		
		return null;
	}

}
