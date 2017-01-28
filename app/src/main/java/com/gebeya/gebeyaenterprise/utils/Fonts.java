package com.gebeya.gebeyaenterprise.utils;

import android.content.Context;
import android.graphics.Typeface;

public final class Fonts {

    public static Typeface thin;
    public static Typeface light;
    public static Typeface normal;
    public static Typeface bold;

    public static void initialize(Context context) {
        thin = Typeface.createFromAsset(context.getAssets(), "fonts/thin.ttf");
        light = Typeface.createFromAsset(context.getAssets(), "fonts/light.ttf");
        normal = Typeface.createFromAsset(context.getAssets(), "fonts/normal.ttf");
        bold = Typeface.createFromAsset(context.getAssets(), "fonts/bold.ttf");
    }
}
