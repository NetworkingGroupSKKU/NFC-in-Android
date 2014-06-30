package com.android.phuc.nfc;

import java.util.List;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
//import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

import com.android.phuc.nfc.actionbar.PrefActivity;
//import com.android.phuc.nfc.R;

public class ActivityManagement extends PrefActivity {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
		setContentView(R.layout.prefer_layout);
	}

	@Override
	protected void onResume() {
		super.onResume();

		// check if NFC adapter is enabled
		new AsyncTask<Void, Void, Boolean>() {

			@Override
			protected Boolean doInBackground(Void... params) {
				NfcAdapter nfcAdapter = NfcAdapter
						.getDefaultAdapter(getApplicationContext());
				if (nfcAdapter != null) {
					return nfcAdapter.isEnabled();
				}
				return false;
			}

			protected void onPostExecute(Boolean enabled) {
				if (!enabled) {
					CustomDialog.Builder nfcDisabledDialogBuilder = new CustomDialog.Builder(
							ActivityManagement.this);
					TextView nfcDisabledMessage = new TextView(
							ActivityManagement.this);
					nfcDisabledMessage.setTextAppearance(
							ActivityManagement.this,
							R.style.text_medium);
					nfcDisabledMessage.setText(R.string.turn_on_nfc);
					nfcDisabledMessage.setPadding(10, 10, 10, 10);
					nfcDisabledDialogBuilder.setContentView(nfcDisabledMessage);
					nfcDisabledDialogBuilder
							.setTitle(R.string.nfc_off);
					OnClickListener onClicklistener = new OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							dialog.dismiss();
							if (which == DialogInterface.BUTTON_POSITIVE) {
								Intent systemSettingsIntent = new Intent(
										Settings.ACTION_WIRELESS_SETTINGS);
								startActivity(systemSettingsIntent);
							}
						}
					};
					nfcDisabledDialogBuilder.setPositiveButton(R.string.yes,
							onClicklistener);
					nfcDisabledDialogBuilder.setNegativeButton(R.string.no,
							onClicklistener);
					nfcDisabledDialogBuilder.create(
							R.layout.dialog_layout).show();
				}
			};

		}.execute((Void) null);

		
	}
}
