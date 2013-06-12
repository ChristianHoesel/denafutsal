package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.one.app.management.ViewData;

import model.Match;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

public class RestartCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		MainView activePart = (MainView) HandlerUtil.getActivePart(event);
		Match model = activePart.getModel();
		model.getEvents().clear();
		
		ViewData.instance().setModel(model);
		
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
