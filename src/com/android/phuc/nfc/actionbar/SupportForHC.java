package com.android.phuc.nfc.actionbar;

import android.app.ActionBar;
import android.app.Activity;
public class SupportForHC extends Support {

	protected SupportForHC(Activity activity,
			boolean showHomeBackButton) {
		super(activity);
		ActionBar actionBar = activity.getActionBar();
		if (actionBar != null) {
			actionBar.setDisplayHomeAsUpEnabled(showHomeBackButton);
		}
	}
}