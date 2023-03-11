package com.emarsys.cordova;
import com.emarsys.config.EmarsysConfig;
import com.emarsys.Emarsys;
import android.app.Application;

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
}