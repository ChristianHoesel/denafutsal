package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.app.composites.PreferencesPage;
import hu.bme.mit.inf.mdsd.one.rest.MDSDClient;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.PlatformUI;

public class DownloadHTML extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
				

		IPreferenceStore preferenceStore = PlatformUI.getPreferenceStore();
		System.out.println("FRDF " + preferenceStore.getString(PreferencesPage.OUT_FOLD));
		//generator.generateDataModelToOutputFolder(model, preferenceStore.getString(PreferencesPage.OUT_FOLD));
		
		MDSDClient mdsdClient = new MDSDClient();
		
		//TODO: cb08dc5ccffde7ec9e13befa8697a74d
		
		String htmlId = "cb08dc5ccffde7ec9e13befa8697a74d";
		
		mdsdClient.getHTML(htmlId, "E:\\futsal+"+htmlId+".html");
		
		return null;
	}

}
