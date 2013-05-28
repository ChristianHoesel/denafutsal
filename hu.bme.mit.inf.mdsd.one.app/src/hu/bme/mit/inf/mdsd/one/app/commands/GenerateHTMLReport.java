package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.reportgenerator.templates.MatchGenerator;
import hu.bme.mit.inf.mdsd.one.app.composites.PreferencesPage;

import model.Match;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenerateHTMLReport extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		//IPreferenceStore preferenceStore = PlatformUI.getPreferenceStore();
		
		MainView activePart = (MainView) HandlerUtil.getActivePart(event);
		Match model = activePart.getModel();
		
		
		DirectoryDialog dd = new DirectoryDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
        dd.setText("Select output folder");
        
        String selected = dd.open();

		if (selected == null)
			return null;

		IWorkbenchPage activePage = HandlerUtil.getActiveWorkbenchWindow(event)
				.getActivePage();
		activePage.hideView(activePage.findView(MainView.ID));
		try {
			activePage.showView(MainView.ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		MatchGenerator generator = new MatchGenerator();
		//System.out.println("FRDF " + preferenceStore.getString(PreferencesPage.OUT_FOLD));
		//generator.generateDataModelToOutputFolder(model, preferenceStore.getString(PreferencesPage.OUT_FOLD));
		generator.generateDataModelToOutputFolder(model, selected);
		
		return null;
	}

}
