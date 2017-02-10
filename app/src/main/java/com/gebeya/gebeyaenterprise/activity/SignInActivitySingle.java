package com.gebeya.gebeyaenterprise.activity;

import android.support.v4.app.Fragment;

import com.gebeya.gebeyaenterprise.base.BaseSingleFragmentActivity;
import com.gebeya.gebeyaenterprise.fragment.SignInFragment;

/**
 * Created by gebeya-admin on 1/23/17.
 */

public class SignInActivitySingle extends BaseSingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new SignInFragment();
    }
}
