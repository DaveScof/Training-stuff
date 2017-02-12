package com.gebeya.gebeyaenterprise.activity;

import android.support.v4.app.Fragment;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BasePagerActivity;
import com.gebeya.gebeyaenterprise.fragment.SignUpTalentOne;
import com.gebeya.gebeyaenterprise.fragment.SignUpTalentTwo;


/**
 * Created by dave-5cof on 1/29/17.
 */
public class SignUpTalentActivity extends BasePagerActivity{
    Fragment[] fragments;

    @Override
    protected void setContentView() {
        setContentView(R.layout.frag_signup_talent_parent);
    }

    @Override
    public void initViewPager() {
        mViewPager = getVp(R.id.singleViewPager);
    }

    @Override
    public void setUpViewPager() {
        fragments = new Fragment[]{new SignUpTalentOne(), new SignUpTalentTwo()};
        setUpViewPager(fragments.length, fragments);
    }

    public void nextButton(){
        mViewPager.setCurrentItem(1);
    }

}
