package com.gebeya.gebeyaenterprise.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by davescof on 2/10/17.
 */

public class Util {
    public static void toast(Context context, String message, int duration){
        Toast.makeText(context,message, duration);
    }

    public static void toast(Context context, String message){
        Toast.makeText(context,message, Toast.LENGTH_SHORT);
    }
}
