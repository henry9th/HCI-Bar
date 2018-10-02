package org.techtown.barvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CocktailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail);
    }
    public void onClickNext(View view) {
        Intent intent = new Intent(this, MargaritaActivity.class);
        startActivity(intent);

    }
}
