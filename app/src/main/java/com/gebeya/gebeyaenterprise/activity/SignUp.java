package com.gebeya.gebeyaenterprise.activity;

import android.support.v4.app.Fragment;

import com.gebeya.gebeyaenterprise.base.BaseSingleFragmentActivity;
import com.gebeya.gebeyaenterprise.fragment.SignUp;

public class SignUp extends BaseSingleFragmentActivity {


    @Override
    public Fragment createFragment() {
        return new com.gebeya.gebeyaenterprise.fragment.SignUp();
    }
}
