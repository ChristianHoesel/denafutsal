package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.one.app.management.ManageModelHelper;
import hu.bme.mit.inf.mdsd.one.app.management.ViewData;
import hu.bme.mit.inf.mdsd.one.rest.MDSDClient;
import hu.bme.mit.inf.mdsd.reportgenerator.templates.MatchGenerator;

import model.Match;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenerateTeXReport extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// IPreferenceStore preferenceStore = PlatformUI.getPreferenceStore();
		// System.out.println("FRDF " +
		// preferenceStore.getString(PreferencesPage.OUT_FOLD));
		// generator.generateDataModelToOutputFolder(model,
		// preferenceStore.getString(PreferencesPage.OUT_FOLD));
		
		//TODO: Megcsinálni rendesen
		
		MainView activePart = (MainView) HandlerUtil.getActivePart(event);
		Match model = activePart.getModel();
		
		FileDialog fd = new FileDialog(HandlerUtil.getActiveShell(event),
				SWT.SAVE);
		fd.setText("Add a name to the file");
		String[] filterExt = { "*.tex" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();

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
		generator.generateTex(model, selected);

		
		return null;
	}

}