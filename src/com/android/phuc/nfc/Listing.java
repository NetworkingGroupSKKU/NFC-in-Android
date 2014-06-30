package com.android.phuc.nfc;

//import com.android.phuc.nfc.R;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Listing extends Preference {

	private Dialog dialog;
	private String[] entries;
	private String[] entryValues;
	private ListView listView;

	public Listing(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public Listing(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
	}

	public void init() {
		setPersistent(true);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
				R.layout.prefe_items, entries);
		listView = new ListView(getContext());
		listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(onItemClickListener);
		String persistedEntryValue = getPersistedString(null);
		if (persistedEntryValue != null) {
			for (int x = 0; x < entryValues.length; x++) {
				if (persistedEntryValue.equals(entryValues[x])) {
					listView.setItemChecked(x, true);
				}
			}
		}
		CustomDialog.Builder builder = new CustomDialog.Builder(getContext());
		builder.setTitle(getTitle().toString());
		builder.setContentView(listView);
		builder.setNegativeButton(R.string.cancel, onClickListener);
		dialog = builder.create(R.layout.list_dialog_layout);
	}

	public void setEntries(String[] entries) {
		this.entries = entries;
	}

	public void setEntryValues(String[] entryValues) {
		this.entryValues = entryValues;
	}

	@Override
	protected void onClick() {
		dialog.show();
	}

	OnItemClickListener onItemClickListener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			persistString(entryValues[position]);
			dialog.dismiss();
		}
	};

	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(DialogInterface dialog, int which) {
			switch (which) {
			case DialogInterface.BUTTON_NEGATIVE:
				dialog.dismiss();
				break;
			}

		}
	};
}