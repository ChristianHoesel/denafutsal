package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.one.app.management.ManageModelHelper;
import hu.bme.mit.inf.mdsd.one.app.management.ViewData;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

public class OpenCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		FileDialog fd = new FileDialog(HandlerUtil.getActiveShell(event),
				SWT.OPEN);
		fd.setText("Select model file");
		String[] filterExt = { "*.model" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();

		if (selected == null)
			return null;

		ViewData.instance().setModel(
				ManageModelHelper.readModelFromFile(selected));

		IWorkbenchPage activePage = HandlerUtil.getActiveWorkbenchWindow(event)
				.getActivePage();
		activePage.hideView(activePage.findView(MainView.ID));
		try {
			activePage.showView(MainView.ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
