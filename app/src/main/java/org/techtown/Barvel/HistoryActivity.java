package org.techtown.barvel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    TextView backGroundColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_screen);

        backGroundColor = (TextView) findViewById(R.id.backGroundColor);
      //  backGroundColor.setBackgroundResource(R.color.colorPrimary);

//        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
 //       setSupportActionBar(myToolbar);
    }
}
