package com.github.howeyc.slideshow.settings.detailsPrefScreen;

import android.preference.Preference;
import android.view.ViewGroup;

import java.util.ArrayList;

public abstract interface IDetailsPreferenceScreen {
    public ArrayList<Preference> getAllDetailPreferenceFields();
    public ViewGroup getStatusViewGroup();
}
