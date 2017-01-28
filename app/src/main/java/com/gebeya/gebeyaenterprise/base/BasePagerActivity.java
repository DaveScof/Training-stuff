package com.gebeya.gebeyaenterprise.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.gebeya.gebeyaenterprise.R;

/**
 * Created by dave-5cof on 1/29/17.
 */

public class BasePagerActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);


    }
}
