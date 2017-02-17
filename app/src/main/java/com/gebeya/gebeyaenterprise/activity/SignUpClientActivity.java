package com.gebeya.gebeyaenterprise.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BasePagerActivity;
import com.gebeya.gebeyaenterprise.fragment.SignUpClientOne;
import com.gebeya.gebeyaenterprise.fragment.SignUpClientTwo;

/**
 * Created by dave-5cof on 1/27/17.
 */

public class SignUpClientActivity extends BasePagerActivity {

    @Override
    protected void setContentView() {
        setContentView(R.layout.frag_signup_client_parent);
    }

    @Override
    public void initViewPager() {
        mViewPager = getVp(R.id.singleViewPager);
    }

    @Override
    public void addFragments() {
        Fragment[] fragments = new Fragment[]{new SignUpClientOne(), new SignUpClientTwo()};
        addFragments(fragments);
    }

    @Override
    public void initViews() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void nextButton(){
        mViewPager.setCurrentItem(1);
    }
}
