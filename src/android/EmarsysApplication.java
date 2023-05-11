package com.emarsys.cordova;
import com.emarsys.config.EmarsysConfig;
import com.emarsys.Emarsys;
import android.app.Application;

import android.app.NotificationManager;
import android.app.NotificationChannel;
import android.R;
import android.os.Build;

public class EmarsysApplication extends Application {
 
@Override
public void onCreate() {
super.onCreate();
		EmarsysConfig config = new EmarsysConfig.Builder()
		.application(this)
		.applicationCode("EMS20-DFDF4")
		.merchantId("1CEA5AF1FE153881")
		.build();
		Emarsys.setup(config);
		}

private void createNotificationChannel() {
  // Create the NotificationChannel, but only on API 26+ because
  // the NotificationChannel class is new and not in the support library
	if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
    //CharSequence name = getString(R.string.channel_name);
    String description = "This is an emarsys test" ;//getString(R.string.channel_description);
    int importance = NotificationManager.IMPORTANCE_DEFAULT;
    NotificationChannel channel = new NotificationChannel("kunooz-2000", "Emarsys-test-kunooz ", importance);
    channel.setDescription(description);
    // Register the channel with the system; you can't change the importance
    // or other notification behaviors after this
    NotificationManager notificationManager = getSystemService(NotificationManager.class);
    notificationManager.createNotificationChannel(channel);
  		}
	}
}