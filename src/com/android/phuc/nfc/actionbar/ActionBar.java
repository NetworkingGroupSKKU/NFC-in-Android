package com.android.phuc.nfc.actionbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.android.phuc.nfc.ActivityManagement;
import com.android.phuc.nfc.R;


public abstract class ActionBar extends Activity {
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
		mActionBarHelper = Support.createInstance(this, true);
		mActionBarHelper.onCreate(savedInstanceState);
		super.onCreate(savedInstanceState);
	}

	/** {@inheritDoc} */
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mActionBarHelper.onPostCreate(savedInstanceState);
	}

	/** {@inheritDoc} */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		boolean retValue = false;
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		mActionBarHelper.onCreateOptionsMenu(menu);
		menu.findItem(R.id.write_to_tag).setVisible(false);
		retValue |= super.onCreateOptionsMenu(menu);
		return retValue;
	}

	/** {@inheritDoc} */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (!mActionBarHelper.onOptionsItemSelected(item)) {
			switch (item.getItemId()) {
			case android.R.id.home:
				Intent intent = new Intent(this,
						ActivityManagement.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				return true;
			default:
				return super.onOptionsItemSelected(item);
			}
		}
		return super.onOptionsItemSelected(item);
	}

	/** {@inheritDoc} */
	@Override
	protected void onTitleChanged(CharSequence title, int color) {
		mActionBarHelper.onTitleChanged(title, color);
		super.onTitleChanged(title, color);
	}
}
