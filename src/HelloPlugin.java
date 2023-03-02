package org.camden.plugin;
import com.emarsys;
import org.apache.cordova.CallbackContext;
import org.apache.cordova. CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

/*public class SampleApplication extends Application {
 
@Override
public void onCreate() {
super.onCreate();
		EmarsysConfig config = new EmarsysConfig.Builder()
		.application(this)
		.applicationCode(<applicationCode:String?>)
		.merchantId(<merchantId:String?>)
		.build();
		Emarsys.setup(config);
		}
}*/

public class HelloPlugin extends CordovaPlugin {
    public static final String ACTION_SAY_HELLO = "initSdk";
    @Override
    public boolean execute (String action, JSONArray args,CallbackContext callbackContext)
    throws JSONException {
    if (ACTION_SAY_HELLO.equals(action)) {
        JSONObject arg_object = args.getJSONObject(0); 
        String applicationCode = arg_object.getString("applicationCode"); //If Bob, we have an error
        String merchantID = arg_object.getString("merchantID");
        if (applicationCode.equals("applicationCode")&& merchantID.equals("merchantID")) {                
            EmarsysConfig config = new EmarsysConfig.Builder()
		    .application(this)
		    .applicationCode(applicationCode)
		    .merchantId(merchantID)
		    .build();
		    Emarsys.setup(config);
		}   
        //String result = "Hello, "+name; callbackContext.success (result);
        //return true;

    }
    //callbackContext.error ("Invalid action");
    //return false;
    }
}

/*public class HelloPlugin extends CordovaPlugin {
    public static final String ACTION_SAY_HELLO = "sayHello";
    @Override
    public boolean execute (String action, JSONArray args,CallbackContext callbackContext)
    throws JSONException {
    if (ACTION_SAY_HELLO.equals (action)) {
        JSONObject arg_object = args.getJSONObject(0); String name = arg_object.getString("name"); //If Bob, we have an error
        if (name.equals("Bob")) {                
            callbackContext.error("Bob is a bad name!"); 
            return false;
        }
        String result = "Hello, "+name; callbackContext.success (result);
        return true;

    }
    callbackContext.error ("Invalid action");
    return false;
    }
}*/
