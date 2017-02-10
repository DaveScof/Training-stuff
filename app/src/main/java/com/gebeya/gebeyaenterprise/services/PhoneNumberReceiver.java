package com.gebeya.gebeyaenterprise.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.gebeya.gebeyaenterprise.utils.Util;

/**
 * Created by davescof on 2/10/17.
 */

public class PhoneNumberReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.hasExtra("phone_number")){
            String phoneNumber = intent.getStringExtra("phone_number");
            Util.toast(context, "Receiver: Phone Number Received: " + phoneNumber);
        }
    }
}
