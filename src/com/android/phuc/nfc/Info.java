
package com.android.phuc.nfc;

import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

import com.android.phuc.nfc.actionbar.ActionBar;
//import com.android.phuc.nfc.R;


public class Info extends ActionBar {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info_layout);
		((TextView) findViewById(R.id.info_text)).setText(Html
				.fromHtml(getString(R.string.info_text)));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		menu.findItem(R.id.info).setVisible(false);
		return true;
	}
}
