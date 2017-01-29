package com.gebeya.gebeyaenterprise.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BaseActivity;
import com.gebeya.gebeyaenterprise.base.BasePagerActivity;
import com.gebeya.gebeyaenterprise.fragment.ClientSignUp1Fragment;
import com.gebeya.gebeyaenterprise.fragment.ClientSignUp2Fragment;

/**
 * Created by dave-5cof on 1/27/17.
 */

public class ClientSignUpActivity extends BasePagerActivity {

    @Override
    protected void setContentView() {
        setContentView(R.layout.signup_view_pager);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        mViewPager = getVp(R.id.singleViewPager);
        Fragment[] fragments = new Fragment[]{new ClientSignUp1Fragment(), new ClientSignUp2Fragment()};
        setUpViewPager(fragments.length, fragments);
    }
}
