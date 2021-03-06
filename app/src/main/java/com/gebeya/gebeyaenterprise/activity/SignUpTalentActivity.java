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

    @Override
    protected void setContentView() {
        setContentView(R.layout.frag_signup_talent_parent);
    }

    @Override
    public void initViewPager() {
        mViewPager = getVp(R.id.singleViewPager);
    }

    @Override
    public void addFragments() {
        Fragment[] fragments = new Fragment[]{new SignUpTalentOne(), new SignUpTalentTwo()};
        addFragments(fragments);
    }

    @Override
    public void initViews() {

    }

    public void nextButton(){
        mViewPager.setCurrentItem(1);
    }

}
