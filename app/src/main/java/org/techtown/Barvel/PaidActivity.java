package org.techtown.barvel;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class PaidActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paid);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                orderIsReady();
            }
        }, 5000);
    }
    private void orderIsReady(){
        Log.d("LOG", "orderIsReady() called");
    }

}
