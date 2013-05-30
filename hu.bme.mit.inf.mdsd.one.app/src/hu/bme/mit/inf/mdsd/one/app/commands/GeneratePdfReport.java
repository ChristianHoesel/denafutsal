package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.reportgenerator.templates.MatchTexGenerator;
import model.Match;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

public class GeneratePdfReport extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		MainView activePart = (MainView) HandlerUtil.getActivePart(event);
		Match model = activePart.getModel();
		
		FileDialog fd = new FileDialog(HandlerUtil.getActiveShell(event),
				SWT.SAVE);
		fd.setText("Add a name to the file");
		String[] filterExt = { "*.pdf" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();

		if (selected == null)
			return null;

		MatchTexGenerator generator = new MatchTexGenerator();
		generator.generate(model, selected);
		
		return null;
	}

}
