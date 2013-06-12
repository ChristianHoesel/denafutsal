package hu.bme.mit.inf.mdsd.one.app.composites;

import javax.swing.filechooser.FileSystemView;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.swt.events.MouseAdapter;

public class PreferencesPage extends PreferencePage implements
		IWorkbenchPreferencePage {

	public static final String PT_LONG = "pt_long";
	public static final String TO_LONG = "to_long";
	public static final String ET_LONG = "et_long";
	public static final String BT_LONG = "bt_long";
	public static final String HT_LONG = "ht_long";
	public static final String SOUND_WAV = "sound_wav";
	public static final String FAN_WAV = "fan_wav";
	public static final String SOUND_WAV_E = "sound_wav_e";
	public static final String FAN_WAV_E = "fan_wav_e";
	public static final String OUT_FOLD = "";
	private Text textSound;
	private Spinner pt_s;
	private Spinner pt_m;
	private Spinner et_s;
	private Spinner et_m;
	private Spinner to_s;
	private Spinner bt_s;
	private Spinner ht_s;
	private Spinner to_m;
	private Spinner bt_m;
	private Spinner ht_m;
	private Text textFan;
	private Button btnPlayF;
	private Button btnPlayS;
	private Text textOutputFolder;

	/**
	 * Create the preference page.
	 */
	public PreferencesPage() {
		setTitle("Match settings");
	}

	/**
	 * Create contents of the preference page.
	 * 
	 * @param parent
	 */
	@Override
	public Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		Label lblHalfTimeLong = new Label(container, SWT.NONE);
		lblHalfTimeLong.setBounds(10, 10, 114, 15);
		lblHalfTimeLong.setText("Halftime long:");

		Label lblBreaktimeLong = new Label(container, SWT.NONE);
		lblBreaktimeLong.setBounds(10, 38, 114, 15);
		lblBreaktimeLong.setText("Breaktime long:");

		Label lblTimeoutLong = new Label(container, SWT.NONE);
		lblTimeoutLong.setBounds(10, 66, 114, 15);
		lblTimeoutLong.setText("Timeout long:");

		ht_m = new Spinner(container, SWT.BORDER);
		ht_m.setMaximum(240);
		ht_m.setBounds(160, 7, 47, 22);

		bt_m = new Spinner(container, SWT.BORDER);
		bt_m.setMaximum(240);
		bt_m.setBounds(160, 35, 47, 22);

		to_m = new Spinner(container, SWT.BORDER);
		to_m.setMaximum(240);
		to_m.setBounds(160, 63, 47, 22);

		Label lblMin = new Label(container, SWT.NONE);
		lblMin.setBounds(213, 10, 21, 15);
		lblMin.setText("min");

		Label lblMind = new Label(container, SWT.NONE);
		lblMind.setBounds(213, 38, 21, 15);
		lblMind.setText("min");

		Label lblMin_1 = new Label(container, SWT.NONE);
		lblMin_1.setBounds(213, 66, 21, 15);
		lblMin_1.setText("min");

		ht_s = new Spinner(container, SWT.BORDER);
		ht_s.setMaximum(59);
		ht_s.setBounds(240, 7, 47, 22);

		bt_s = new Spinner(container, SWT.BORDER);
		bt_s.setMaximum(59);
		bt_s.setBounds(240, 35, 47, 22);

		to_s = new Spinner(container, SWT.BORDER);
		to_s.setMaximum(59);
		to_s.setBounds(240, 63, 47, 22);

		Label lblSec = new Label(container, SWT.NONE);
		lblSec.setBounds(293, 10, 55, 15);
		lblSec.setText("sec");

		Label lblSec_1 = new Label(container, SWT.NONE);
		lblSec_1.setBounds(293, 38, 55, 15);
		lblSec_1.setText("sec");

		Label lblSec_2 = new Label(container, SWT.NONE);
		lblSec_2.setBounds(293, 66, 55, 15);
		lblSec_2.setText("sec");

		Label lblExtratimeLong = new Label(container, SWT.NONE);
		lblExtratimeLong.setBounds(10, 94, 114, 15);
		lblExtratimeLong.setText("Extratime long:");

		et_m = new Spinner(container, SWT.BORDER);
		et_m.setMaximum(240);
		et_m.setBounds(160, 91, 47, 22);

		et_s = new Spinner(container, SWT.BORDER);
		et_s.setMaximum(59);
		et_s.setBounds(240, 91, 47, 22);

		pt_m = new Spinner(container, SWT.BORDER);
		pt_m.setMaximum(240);
		pt_m.setBounds(160, 119, 47, 22);

		pt_s = new Spinner(container, SWT.BORDER);
		pt_s.setMaximum(59);
		pt_s.setBounds(240, 119, 47, 22);

		Label lblPenaltytimeLong = new Label(container, SWT.NONE);
		lblPenaltytimeLong.setBounds(10, 122, 114, 15);
		lblPenaltytimeLong.setText("Penaltytime long:");

		Label label = new Label(container, SWT.NONE);
		label.setText("min");
		label.setBounds(213, 94, 21, 15);

		Label label_1 = new Label(container, SWT.NONE);
		label_1.setText("min");
		label_1.setBounds(213, 122, 21, 15);

		Label label_2 = new Label(container, SWT.NONE);
		label_2.setText("sec");
		label_2.setBounds(293, 94, 55, 15);

		Label label_3 = new Label(container, SWT.NONE);
		label_3.setText("sec");
		label_3.setBounds(293, 122, 55, 15);

		Label lblSoundFile = new Label(container, SWT.NONE);
		lblSoundFile.setBounds(83, 185, 71, 15);
		lblSoundFile.setText("Sound file:");

		textSound = new Text(container, SWT.BORDER);
		textSound.setBounds(160, 182, 127, 21);

		Button btnBrowse = new Button(container, SWT.NONE);
		btnBrowse.setBounds(293, 178, 65, 25);
		btnBrowse.setText("Browse");
		
		Label lblSounds = new Label(container, SWT.NONE);
		lblSounds.setBounds(10, 164, 55, 15);
		lblSounds.setText("Sounds");
		
		btnPlayS = new Button(container, SWT.CHECK);
		btnPlayS.setBounds(160, 209, 198, 16);
		btnPlayS.setText("Play sound during the match");
		
		Label lblFanSound = new Label(container, SWT.NONE);
		lblFanSound.setBounds(83, 256, 71, 15);
		lblFanSound.setText("Fan sound:");
		
		textFan = new Text(container, SWT.BORDER);
		textFan.setBounds(160, 253, 127, 21);
		
		Button btnBrowse2 = new Button(container, SWT.NONE);
		btnBrowse2.setText("Browse");
		btnBrowse2.setBounds(293, 251, 65, 25);
		
		btnPlayF = new Button(container, SWT.CHECK);
		btnPlayF.setText("Play fans during the match");
		btnPlayF.setBounds(160, 280, 198, 16);
		
		Label lblOutputFolder = new Label(container, SWT.NONE);
		lblOutputFolder.setBounds(10, 310, 81, 15);
		lblOutputFolder.setText("Output folder:");
		
		textOutputFolder = new Text(container, SWT.BORDER);
		textOutputFolder.setBounds(10, 331, 277, 21);
		
		Button btnBrowseOutputFolder = new Button(container, SWT.NONE);
		btnBrowseOutputFolder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				handleOutPutFolderBrowseDialog(e, textOutputFolder);
			}
		});
		btnBrowseOutputFolder.setBounds(293, 329, 65, 25);
		btnBrowseOutputFolder.setText("Browse");
		btnBrowse.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				handleBrowseDialog(e, textSound);
			}

			@Override
			public void mouseDown(MouseEvent e) {
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});

		btnBrowse2.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				handleBrowseDialog(e, textFan);
			}

			@Override
			public void mouseDown(MouseEvent e) {
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});
		
		initValues();

		return container;
	}

	protected void handleBrowseDialog(MouseEvent e, Text text) {
		FileDialog fd = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
        fd.setText("Select sound file");
        String[] filterExt = { "*.wav" };
        fd.setFilterExtensions(filterExt);
        String selected = fd.open();
        
        if(selected != null)
        	text.setText(selected);
	}
	
	protected void handleOutPutFolderBrowseDialog(MouseEvent e, Text text) {
		
		DirectoryDialog dd = new DirectoryDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
        dd.setText("Select output folder");
        
        String selected = dd.open();
        
        if(selected != null)
        	text.setText(selected);
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(PlatformUI.getPreferenceStore());
		setDescription("A demonstration of a preference page implementation");
		setDefaultValues();		
	}

	private void setDefaultValues() {
		IPreferenceStore s = getPreferenceStore();
		s.setDefault(BT_LONG, 15 * 60);
		s.setDefault(HT_LONG, 20 * 60);
		s.setDefault(ET_LONG, 10 * 60);
		s.setDefault(TO_LONG, 60);
		s.setDefault(PT_LONG, 2 * 60);
		s.setDefault(SOUND_WAV, "");
		s.setDefault(FAN_WAV, "");
		s.setDefault(SOUND_WAV_E, true);
		s.setDefault(FAN_WAV_E, false);
		
		FileSystemView filesys = FileSystemView.getFileSystemView();
		
		s.setDefault(OUT_FOLD, filesys.getHomeDirectory().toPath().toString());
	}
	
	@Override
	public boolean performOk() {
		IPreferenceStore s = getPreferenceStore();
		s.setValue(BT_LONG, bt_m.getSelection() * 60 + bt_s.getSelection());
		s.setValue(HT_LONG, ht_m.getSelection() * 60 + ht_s.getSelection());
		s.setValue(ET_LONG, et_m.getSelection() * 60 + et_s.getSelection());
		s.setValue(TO_LONG, to_m.getSelection() * 60 + to_s.getSelection());
		s.setValue(PT_LONG, pt_m.getSelection() * 60 + pt_s.getSelection());
		s.setValue(SOUND_WAV, textSound.getText());
		s.setValue(FAN_WAV, textFan.getText());
		s.setValue(SOUND_WAV_E, btnPlayS.getSelection());
		s.setValue(FAN_WAV_E, btnPlayF.getSelection());
		s.setValue(OUT_FOLD, textOutputFolder.getText());
		
		return super.performOk();
	}

	@Override
	protected void performDefaults() {
		IPreferenceStore s = getPreferenceStore();
		int bt_long = s.getDefaultInt(BT_LONG);
		int ht_long = s.getDefaultInt(HT_LONG);
		int et_long = s.getDefaultInt(ET_LONG);
		int to_long = s.getDefaultInt(TO_LONG);
		int pt_long = s.getDefaultInt(PT_LONG);

		int bt_m = bt_long / 60;
		int bt_s = bt_long - bt_m * 60;
		this.bt_m.setSelection(bt_m);
		this.bt_s.setSelection(bt_s);

		int ht_m = ht_long / 60;
		int ht_s = ht_long - ht_m * 60;
		this.ht_m.setSelection(ht_m);
		this.ht_s.setSelection(ht_s);

		int et_m = et_long / 60;
		int et_s = et_long - et_m * 60;
		this.et_m.setSelection(et_m);
		this.et_s.setSelection(et_s);

		int to_m = to_long / 60;
		int to_s = to_long - to_m * 60;
		this.to_m.setSelection(to_m);
		this.to_s.setSelection(to_s);

		int pt_m = pt_long / 60;
		int pt_s = pt_long - pt_m * 60;
		this.pt_m.setSelection(pt_m);
		this.pt_s.setSelection(pt_s);
		
		btnPlayF.setSelection(false);
		btnPlayS.setSelection(true);
		super.performDefaults();
	}

	protected void initValues() {
		IPreferenceStore s = getPreferenceStore();
		int bt_long = s.getInt(BT_LONG);
		int ht_long = s.getInt(HT_LONG);
		int et_long = s.getInt(ET_LONG);
		int to_long = s.getInt(TO_LONG);
		int pt_long = s.getInt(PT_LONG);

		int bt_m = bt_long / 60;
		int bt_s = bt_long - bt_m * 60;
		this.bt_m.setSelection(bt_m);
		this.bt_s.setSelection(bt_s);

		int ht_m = ht_long / 60;
		int ht_s = ht_long - ht_m * 60;
		this.ht_m.setSelection(ht_m);
		this.ht_s.setSelection(ht_s);

		int et_m = et_long / 60;
		int et_s = et_long - et_m * 60;
		this.et_m.setSelection(et_m);
		this.et_s.setSelection(et_s);

		int to_m = to_long / 60;
		int to_s = to_long - to_m * 60;
		this.to_m.setSelection(to_m);
		this.to_s.setSelection(to_s);

		int pt_m = pt_long / 60;
		int pt_s = pt_long - pt_m * 60;
		this.pt_m.setSelection(pt_m);
		this.pt_s.setSelection(pt_s);
		
		btnPlayF.setSelection(s.getBoolean(FAN_WAV_E));
		btnPlayS.setSelection(s.getBoolean(SOUND_WAV_E));
		textFan.setText(s.getString(FAN_WAV));
		textSound.setText(s.getString(SOUND_WAV));
		textOutputFolder.setText(s.getString(OUT_FOLD));
	}
}