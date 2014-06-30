package com.android.phuc.nfc.actionbar;

import com.android.phuc.nfc.R;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
public abstract class PrefActivity extends PreferenceActivity {
	private Support mActionBarHelper;

	protected Support getActionBarHelper() {
		return mActionBarHelper;
	}

	/** {@inheritDoc} */
	@Override
	public MenuInflater getMenuInflater() {
		return mActionBarHelper.getMenuInflater(super.getMenuInflater());
	}

	/** {@inheritDoc} */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		mActionBarHelper = Support.createInstance(this, false);
		mActionBarHelper.onCreate(savedInstanceState);
		super.onCreate(savedInstanceState);
	}

	/** {@inheritDoc} */
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mActionBarHelper.onPostCreate(savedInstanceState);
	}

	/**
	 * Base action bar-aware implementation for
	 * {@link Activity#onCreateOptionsMenu(android.view.Menu)}.
	 * 
	 * Note: marking menu items as invisible/visible is not currently supported.
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		boolean retValue = false;
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		mActionBarHelper.onCreateOptionsMenu(menu);
		retValue |= super.onCreateOptionsMenu(menu);
		return retValue;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		mActionBarHelper.onOptionsItemSelected(item);
		return super.onOptionsItemSelected(item);
	}

	/** {@inheritDoc} */
	@Override
	protected void onTitleChanged(CharSequence title, int color) {
		mActionBarHelper.onTitleChanged(title, color);
		super.onTitleChanged(title, color);
	}
}
