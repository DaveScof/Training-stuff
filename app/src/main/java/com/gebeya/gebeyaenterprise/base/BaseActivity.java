package com.gebeya.gebeyaenterprise.base;

import android.content.Context;
import android.graphics.Typeface;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gebeya.gebeyaenterprise.utils.Fonts;

import java.util.Locale;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public abstract class BaseActivity extends AppCompatActivity {

    public static final String TAG = "Qene Technologies";

    /* Fonts */
    public Typeface fontThin = Fonts.thin;
    public Typeface fontBold = Fonts.bold;
    public Typeface fontLight = Fonts.light;
    public Typeface fontNormal = Fonts.normal;

    public abstract void initViews ();
    public abstract void setListeners ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d("<============================= onCreate(Bundle) =============================>");
    }

    @Override
    protected void onStop() {
        super.onStop();
        d("<================================= onStop() =================================>");
    }

    public TextView getTv(int id) {
        return (TextView) findViewById(id);
    }

    public TextView getTv(int id, View v) {
        return (TextView) v.findViewById(id);
    }

    public TextView getTv(int id, Typeface font) {
        TextView tv =  (TextView) findViewById(id);
        tv.setTypeface(font);
        return tv;
    }

    public Button getBt(int id) {
        return (Button) findViewById(id);
    }

    public Button getBt(int id, Typeface f){
        Button b = getBt(id);
        b.setTypeface(f);
        return b;
    }

    public EditText getEd(int id) {
        return (EditText) findViewById(id);
    }

    public EditText getEd(int id, Typeface font){
        EditText ed = getEd(id);
        ed.setTypeface(font);
        return ed;
    }

    public ImageView getIm(int id) {
        return (ImageView) findViewById(id);
    }

    public View getView(int id) {
        return findViewById(id);
    }

    public void toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void d(String message) {
        Log.d(TAG, String.format(Locale.getDefault(), "%s : %s", TAG, message));
    }

    public void e(String message) {
        Log.e(TAG, String.format(Locale.getDefault(), "%s : %s", TAG, message));
    }

    public int getColorValue(int id) {
        return ContextCompat.getColor(getApplicationContext(), id);
    }
}
