package picframe.at.picframe.helper.settings.detailsPrefScreen;

import android.content.Context;
import android.preference.Preference;

import java.util.ArrayList;

import picframe.at.picframe.R;
import picframe.at.picframe.activities.SettingsActivity;
import picframe.at.picframe.helper.settings.AppData;
import picframe.at.picframe.helper.settings.SimpleFileDialog;

public class ExtSdPrefs implements IDetailsPreferenceScreen {
    private ArrayList<Preference> allPrefs = new ArrayList<>();
    private Context mSettAct;

    public ExtSdPrefs(SettingsActivity mSettAct) {
        this.mSettAct = mSettAct;

        //createStatusView();
        createSourcePref();
    }

    private void createSourcePref() {
        Preference mySrcPathPref = new Preference(mSettAct);
        mySrcPathPref.setTitle(mSettAct.getString(R.string.sett_srcPath_externalSD));
        mySrcPathPref.setSummary(R.string.sett_srcPath_externalSDSumm);
        mySrcPathPref.setDefaultValue("");
        mySrcPathPref.setKey(mSettAct.getString(R.string.sett_key_srcpath_sd));
        mySrcPathPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            String _chosenDir = AppData.getSourcePath();

            @Override
            public boolean onPreferenceClick(Preference preference) {
                SimpleFileDialog FolderChooseDialog =
                        new SimpleFileDialog(
                                mSettAct,
                                new SimpleFileDialog.SimpleFileDialogListener() {
                                    @Override
                                    // The code in this function will be executed when the dialog OK button is pushed
                                    public void onChosenDir(String chosenDir) {
                                        _chosenDir = chosenDir;
                                        AppData.setSdSourcePath(_chosenDir);
                                    }
                                });
                FolderChooseDialog.chooseFile_or_Dir(_chosenDir);
                return true;
            }
        });
        allPrefs.add(mySrcPathPref);
    }


    @Override
    public ArrayList<Preference> getAllDetailPreferenceFields() {
        return allPrefs;
    }
}