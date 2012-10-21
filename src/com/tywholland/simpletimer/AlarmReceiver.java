package com.tywholland.simpletimer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		AlarmApplication alarmApplication = (AlarmApplication)context.getApplicationContext();
		if(intent.getBooleanExtra(AlarmApplication.CANCEL_ALARM, false)) {
			alarmApplication.stopTimer();
		}
		else {
			alarmApplication.notifyUser();
			alarmApplication.updateTimerNotificationAlarmDone();
		}
	}
}
