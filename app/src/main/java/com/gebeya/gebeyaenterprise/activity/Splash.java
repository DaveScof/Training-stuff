package com.gebeya.gebeyaenterprise.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

import com.gebeya.gebeyaenterprise.R;


public class Splash extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent (Splash.this, TourScreen.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
