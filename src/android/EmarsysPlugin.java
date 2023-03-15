package com.emarsys.cordova;
import com.emarsys.Emarsys;
//import com.emarys.cordova.EmarsysApplication;
import org.apache.cordova.CallbackContext;
import org.apache.cordova. CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;


public class EmarsysPlugin extends CordovaPlugin {
    public static final String ACTION_SETUP = "track";
    @Override
    public boolean execute (String action, JSONArray args,CallbackContext callbackContext)
    throws JSONException {
    if (ACTION_SETUP.equals(action)) {
        JSONObject arg_object = args.getJSONObject(0); 
        String eventName = arg_object.getString("eventName"); 
        String key  = arg_object.getString("key");
        String value  = arg_object.getString("value");
        Map<String, String> map = new HashMap<String, String>();
        map.put(key,value);
        Emarsys.trackCustomEvent(eventName, map,(throwable)->{});     
        //EmarsysApplication.onCreate(applicationCode,merchantID)
        return true;

    }
    //return true;
    callbackContext.error ("Invalid action");
    return false;
    }
}


