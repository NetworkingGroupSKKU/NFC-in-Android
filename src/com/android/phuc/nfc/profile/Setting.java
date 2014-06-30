package com.android.phuc.nfc.profile;

public class Setting {

	private boolean toggleWifiEnabled;
	private boolean toggleBluetoothEnabled;
	private boolean toggleRingtoneEnabled;
	private boolean toggleAirplaneModeEnabled;
	private boolean setAlarmEnabled;
	private boolean startExternalAppEnabled;
	private String alarmTime;
	private String externalAppPackageName;

	public boolean isToggleWifiEnabled() {
		return toggleWifiEnabled;
	}

	public void setToggleWifiEnabled(boolean toggleWifiEnabled) {
		this.toggleWifiEnabled = toggleWifiEnabled;
	}

	public boolean isToggleBluetoothEnabled() {
		return toggleBluetoothEnabled;
	}

	public void setToggleBluetoothEnabled(boolean toggleBluetoothEnabled) {
		this.toggleBluetoothEnabled = toggleBluetoothEnabled;
	}

	public boolean isToggleRingtoneEnabled() {
		return toggleRingtoneEnabled;
	}

	public void setToggleRingtoneEnabled(boolean toggleRingtoneEnabled) {
		this.toggleRingtoneEnabled = toggleRingtoneEnabled;
	}

	public boolean isToggleAirplaneModeEnabled() {
		return toggleAirplaneModeEnabled;
	}

	public void setToggleAirplaneModeEnabled(boolean toggleAirplaneModeEnabled) {
		this.toggleAirplaneModeEnabled = toggleAirplaneModeEnabled;
	}

	public boolean isSetAlarmEnabled() {
		return setAlarmEnabled;
	}

	public void setSetAlarmEnabled(boolean setAlarmEnabled) {
		this.setAlarmEnabled = setAlarmEnabled;
	}

	public boolean isStartExternalAppEnabled() {
		return startExternalAppEnabled;
	}

	public void setStartExternalAppEnabled(boolean startExternalAppEnabled) {
		this.startExternalAppEnabled = startExternalAppEnabled;
	}

	public String getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(String alarmTime) {
		this.alarmTime = alarmTime;
	}

	public String getExternalAppPackageName() {
		return externalAppPackageName;
	}

	public void setExternalAppPackageName(String externalAppPackageName) {
		this.externalAppPackageName = externalAppPackageName;
	}
}
