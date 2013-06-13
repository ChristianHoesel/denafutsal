package hu.bme.mit.inf.mdsd.one.app;

import hu.bme.mit.inf.mdsd.one.app.composites.Preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(Preferences.BT_LONG, 30);
		store.setDefault(Preferences.ET_LONG, 25);
		store.setDefault(Preferences.HT_LONG, 120);
		store.setDefault(Preferences.PT_LONG, 20);
		store.setDefault(Preferences.TO_LONG, 10);		
	}

}
