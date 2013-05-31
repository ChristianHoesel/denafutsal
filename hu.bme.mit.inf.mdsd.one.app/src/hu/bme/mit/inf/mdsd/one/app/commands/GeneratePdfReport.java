package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.reportgenerator.templates.MatchTexGenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import model.Match;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
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
		String selectedPdf = fd.open();

		if (selectedPdf == null)
			return null;

		String selectedTex = selectedPdf.replace(".pdf", ".tex");

		MatchTexGenerator generator = new MatchTexGenerator();
		generator.generate(model, selectedTex, true);

		String s = null;

		try {

			File file = new File(selectedTex);
			String folder = file.getParent();
			String filename = file.getName();
	    	String filenameWE = filename.replace(".tex", "");
	    	
			Process p = Runtime.getRuntime().exec("pdflatex -output-directory=" + folder + " -jobname=" + filenameWE + " " + selectedTex.replace(filename, "main.tex"));

			BufferedReader stdInput = new BufferedReader(new InputStreamReader(
					p.getInputStream()));

			BufferedReader stdError = new BufferedReader(new InputStreamReader(
					p.getErrorStream()));

			// read the output from the command
			System.out.println("Here is the standard output of the command:\n");
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}

			// read any errors from the attempted command
			System.out
					.println("Here is the standard error of the command (if any):\n");
			while ((s = stdError.readLine()) != null) {
				System.out.println(s);
			}
			
			String[] toDeleteExtenstions = new String[] { "aux", "log", "out", "tex" };
			for(String ext : toDeleteExtenstions) {
				new File(selectedTex.replace(".tex", "." + ext)).delete();
			}
			//new File(selectedTex.replace(filename, "main.tex")).delete();

		} catch (Exception e) {
			System.out.println("exception happened - here's what I know: ");
			e.printStackTrace();
		}
		
		return null;
	}

}
