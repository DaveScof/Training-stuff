package com.gebeya.gebeyaenterprise.activity;

import android.support.v4.app.Fragment;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BaseSingleFragmentActivity;
import com.gebeya.gebeyaenterprise.fragment.SignUp;

public class SignUpActivity extends BaseSingleFragmentActivity {


    @Override
    public Fragment createFragment() {
        return new com.gebeya.gebeyaenterprise.fragment.SignUp();
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.frag_single);
    }
}
