package hu.bme.mit.inf.mdsd.one.app.management;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;


import model.Match;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ManageModelHelper {

	private ManageModel mm;
	public static final String TESTMODEL = "D:\\University\\runtime-EclipseApplication\\TestProject\\My.model";
	//public static final String TESTMODEL = "E:\\runtime-EclipseApplication\\Model\\My.model";
	
	
	public ManageModelHelper(ManageModel manageModel) {
		this.mm = manageModel;
	
	}

	public static Match readModelFromFile(String path) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("model", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(
				URI.createURI(new File(path).toURI().toString()), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		return (Match) resource.getContents().get(0);
	}

	public static void saveModelToFile(String path, Match model) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("model", new XMIResourceFactoryImpl());

		FileOutputStream fo;
		File file;
		try {
			file = new File(path);
			if (!file.exists())
				file.createNewFile();
			fo = new FileOutputStream(path);
			model.eResource().save(fo, Collections.EMPTY_MAP);
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
