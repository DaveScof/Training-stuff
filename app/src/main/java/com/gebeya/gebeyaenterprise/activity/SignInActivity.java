package com.gebeya.gebeyaenterprise.activity;

import android.support.v4.app.Fragment;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BaseSingleFragmentActivity;
import com.gebeya.gebeyaenterprise.fragment.SignIn;

/**
 * Created by gebeya-admin on 1/23/17.
 */

public class SignInActivity extends BaseSingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new SignIn();
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.frag_single);
    }
}
