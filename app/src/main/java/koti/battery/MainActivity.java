package koti.battery;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4);
        SharedPreferences sharedPref = getSharedPreferences("holister", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        long koti=sharedPref.getLong("reddy",0);
        long lohith=sharedPref.getLong("reddy2",0);
        Log.d("Battery",koti +" "+lohith);

        long result = lohith - koti;

        long sec = result/ 1000 % 60;
        long min = result / (60 * 1000) % 60;
        long hours= result / (60 * 60 * 1000) % 24;
        long days = result / (24*  60 * 60 * 1000);

        Log.d("TestMainActivity", "days"+days+" hours"+hours+"min"+min+"sec"+sec);
        textView.setText("days " + String.valueOf(days));
        textView2.setText("hours "+ String.valueOf(hours));
        textView3.setText("min" + String.valueOf(min));
        textView4.setText("sec "+ String.valueOf(sec));


    }

}
