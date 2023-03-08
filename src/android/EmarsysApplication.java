package com.emarsys.cordova;
import com.emarsys.config.EmarsysConfig;
import com.emarsys.Emarsys;
import android.app.Application;

public class EmarsysApplication extends Application {
 
@Override
public void onCreate(String applicationCode, String merchantID) {
super.onCreate();
		EmarsysConfig config = new EmarsysConfig.Builder()
		.application(this)
		.applicationCode(applicationCode)
		.merchantId(merchantID)
		.build();
		Emarsys.setup(config);
		}
}