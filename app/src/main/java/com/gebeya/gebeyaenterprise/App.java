package com.gebeya.gebeyaenterprise;

import android.app.Application;

import com.gebeya.gebeyaenterprise.utils.Fonts;

/**
 * Created by dave-5cof on 1/27/17.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fonts.initialize(getApplicationContext());
    }
}
