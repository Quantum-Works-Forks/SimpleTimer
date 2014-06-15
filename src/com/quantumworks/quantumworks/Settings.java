package com.quantumworks.timer;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.quantumworks.timer.R;

public class Settings extends PreferenceActivity {
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);
	}
}
