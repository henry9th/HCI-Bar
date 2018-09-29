package org.techtown.barvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DrinksActivity extends AppCompatActivity {

    private static final String TAG = DrinksActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

    }

    public void onClickNext() {
        Intent intent = new Intent(this, DrinksListActivity.class);
        startActivity(intent);
    }
}
