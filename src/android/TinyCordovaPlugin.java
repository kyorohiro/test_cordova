package info.kyorohiro.hello;

import android.content.pm.PackageManager;
import android.os.Build;
import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import android.Manifest;

/**
 * Created by kyorohiro on 2016/02/11.
 */
public class TinyCordovaPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        android.util.Log.v("KY", "### " + action + ", " + args);
        {
            PluginResult result = new PluginResult(PluginResult.Status.OK, "AAA");
            result.setKeepCallback(true);
            callbackContext.sendPluginResult(result);
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, "BBB"));
            callbackContext.success("test(1)");
            callbackContext.success("test(2)");
            android.widget.Toast.makeText(this.cordova.getActivity(), args.getString(0), Toast.LENGTH_LONG).show();
            callbackContext.success();
        }
        return true;
    }
}
