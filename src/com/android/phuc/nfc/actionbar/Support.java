package com.android.phuc.nfc.actionbar;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.android.phuc.nfc.Info;
import com.android.phuc.nfc.WriteToTag;
import com.android.phuc.nfc.R;


public abstract class Support {
	protected Activity mActivity;

	public static Support createInstance(Activity activity,
			boolean showHomeBackButton) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
			return new ICS(activity, showHomeBackButton);
		} else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			return new SupportForHC(activity, showHomeBackButton);
		} else {
			return new Support_Base(activity);
		}
	}

	protected Support(Activity activity) {
		mActivity = activity;
	}

	
	public void onCreate(Bundle savedInstanceState) {
	}

	
	public void onPostCreate(Bundle savedInstanceState) {
	}

	
	public boolean onCreateOptionsMenu(Menu menu) {
		return true;
	}

	public boolean onPrepareOptionsMenu(Menu menu) {
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == R.id.write_to_tag) {
			Intent writeToTagIntent = new Intent(mActivity,
					WriteToTag.class);
			mActivity.startActivity(writeToTagIntent);
			return true;
		}
		return false;
	}


	protected void onTitleChanged(CharSequence title, int color) {
	}

	
	public MenuInflater getMenuInflater(MenuInflater superMenuInflater) {
		return superMenuInflater;
	}
}