package com.gebeya.gebeyaenterprise.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BasePagerActivity;
import com.gebeya.gebeyaenterprise.fragment.TalentSignUpOne;
import com.gebeya.gebeyaenterprise.fragment.TalentSignUpTwo;


/**
 * Created by dave-5cof on 1/29/17.
 */
public class TalentSignupActivity extends BasePagerActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_view_pager);

        mViewPager = getVp(R.id.singleViewPager);
        Fragment[] fragments = new Fragment[]{new TalentSignUpOne(), new TalentSignUpTwo()};
        setUpViewPager(fragments.length, fragments);
    }
}
