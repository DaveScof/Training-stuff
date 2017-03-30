package com.gebeya.gebeyaenterprise.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.gebeya.gebeyaenterprise.R;

import java.util.prefs.Preferences;


public class Splash extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000;

    private boolean view_cllicked =false;
    private boolean closed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        findViewById(R.id.activity_splash).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_cllicked = true;
                initNext();
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (view_cllicked) return;
                if (closed) return;
                initNext();
            }
        }, SPLASH_TIME_OUT);
    }

    private void initNext(){
        Intent i = new Intent (Splash.this, TourScreen.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onBackPressed() {
        closed = true;
        super.onBackPressed();
    }
}
