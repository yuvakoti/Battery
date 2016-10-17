package koti.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.Date;

/**
 * Created by User on 10/16/2016.
 */

public class BatteryPlugIn extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Date date = new Date();
        Log.d("BatteryPlugIn", date.toString());
        SharedPreferences sharedpref = context.getSharedPreferences("holister", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpref.edit();
        editor.putLong("reddy",date.getTime());
        editor.commit();
    }


}
