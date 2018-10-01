package org.techtown.barvel;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class PaidActivity extends AppCompatActivity {

    NotificationCompat.Builder notification;
    private static final int uniqueID = 45612;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paid);

        notification = new NotificationCompat.Builder(this, "a");
        notification.setAutoCancel(true); // notification to disappear after you click it

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                notificationButtonClicked();
                startActivity(new Intent(PaidActivity.this, Pop.class));
            }
        }, 5000);
    }
    private void orderIsReady(){
        Log.d("LOG", "orderIsReady() called");
    }


    public void notificationButtonClicked(){
        //Build Notification
        notification.setSmallIcon(R.drawable.avengers);
        notification.setTicker("Barvel");
        notification.setWhen(System.currentTimeMillis()); // set time, when notifcation was hit, you can tell the user to say when?
        notification.setContentTitle("Barvel");
        notification.setContentText("Your Item is Ready");

        Intent intent = new Intent(this, PaidActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        //Builds notification and issues it
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID, notification.build());

    }

}
