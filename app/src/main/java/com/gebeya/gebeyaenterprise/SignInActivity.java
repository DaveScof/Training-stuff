package com.gebeya.gebeyaenterprise;

import android.support.v4.app.Fragment;

/**
 * Created by gebeya-admin on 1/23/17.
 */

public class SignInActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new SignInFragment();
    }
}
