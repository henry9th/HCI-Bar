package org.techtown.barvle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//BarVle
<<<<<<< HEAD
    private static final String TAG = MainActivity.class.getSimpleName();
    Button foodButton;

=======
>>>>>>> ff8f1cd2ce3b0bfa9aabc8bf001aa9679ed5d8b6
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodButton = (Button) findViewById(R.id.foodButton);

        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(TAG, "Yes, I just clicked my button");
                //intent go to next page please
                startActivity(new Intent(MainActivity.this, foodMenuOne.class));

            }
        });
    }
}
