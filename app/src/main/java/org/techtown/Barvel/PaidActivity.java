package org.techtown.barvel;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class PaidActivity extends AppCompatActivity {
    private static final String CHANNEL_ID = "notifier";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paid);


        //createNotificationChannel();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                notifyDrinkIsReady();
            }
        }, 5000);


    }

    private void notifyDrinkIsReady(){
        Log.d("log", "notifyDrinkIsReady() called");
    }


}
