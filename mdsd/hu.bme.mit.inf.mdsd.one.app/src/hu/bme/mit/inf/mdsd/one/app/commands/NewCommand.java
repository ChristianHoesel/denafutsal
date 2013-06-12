package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.one.app.management.ViewData;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

public class NewCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ViewData.instance().setModel(null);
		
		IWorkbenchPage activePage = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
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
