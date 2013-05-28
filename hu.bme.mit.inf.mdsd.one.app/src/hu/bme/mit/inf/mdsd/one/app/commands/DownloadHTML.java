package hu.bme.mit.inf.mdsd.one.app.commands;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import hu.bme.mit.inf.mdsd.one.app.composites.PreferencesPage;
import hu.bme.mit.inf.mdsd.one.rest.MDSDClient;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class DownloadHTML extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		
		FileDialog fd = new FileDialog (HandlerUtil.getActiveShell(event),
				SWT.SAVE);
		fd.setText("Select folder to save HTML");
		String[] filterExt = { "*.html" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();

		if (selected == null)
			return null;
		
		MDSDClient mdsdClient = new MDSDClient();
		
		//TODO: cb08dc5ccffde7ec9e13befa8697a74d
		
		String htmlId = "cb08dc5ccffde7ec9e13befa8697a74d";
				
		try {
			htmlId = (String) Toolkit.getDefaultToolkit()
			        .getSystemClipboard().getData(DataFlavor.stringFlavor);
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedFlavorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		mdsdClient.getHTML(htmlId, selected);
		
		return null;
	}

}
