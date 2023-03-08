package com.emarsys.cordova;
import com.emarys.cordova.EmarsysApplication;
import org.apache.cordova.CallbackContext;
import org.apache.cordova. CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;


public class EmarsysPlugin extends CordovaPlugin {
    public static final String ACTION_SETUP = "setup";
    @Override
    public boolean execute (String action, JSONArray args,CallbackContext callbackContext)
    throws JSONException {
    if (ACTION_SETUP.equals(action)) {
        JSONObject arg_object = args.getJSONObject(0); 
        String applicationCode = arg_object.getString("applicationCode"); 
        String merchantID = arg_object.getString("merchantID");    
        EmarsysApplication.onCreate(applicationCode,merchantID)
        return true;

    }
    //return true;
    callbackContext.error ("Invalid action");
    return false;
    }
}


