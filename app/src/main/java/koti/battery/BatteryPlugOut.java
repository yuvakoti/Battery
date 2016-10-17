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

public class BatteryPlugOut extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Date date = new Date();
        Log.d("BatteryPlugOut", date.toString());
        SharedPreferences sharedPref = context.getSharedPreferences("holister", Context.MODE_PRIVATE);
       // long yuva=sharedPref.getLong("reddy",0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putLong("reddy2", date.getTime());
        editor.commit();
    }
}
