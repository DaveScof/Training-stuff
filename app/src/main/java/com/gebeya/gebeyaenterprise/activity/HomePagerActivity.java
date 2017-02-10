package com.gebeya.gebeyaenterprise.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BasePagerActivity;
import com.gebeya.gebeyaenterprise.fragment.ClientPagerFragment;
import com.gebeya.gebeyaenterprise.fragment.TalentPagerFragment;

/**
 * Created by davescof on 2/11/17.
 */

public class HomePagerActivity extends BasePagerActivity {
    private Button mSignUpButton;
    private Button mLoginButton;

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_home);
    }

    @Override
    public void initViewPager() {
        mViewPager = getVp(R.id.singleViewPager);
    }

    @Override
    public void setUpViewPager() {
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
//        tabLayout.setupWithViewPager(mViewPager, true);
        Fragment[] fragments = new Fragment[]{new ClientPagerFragment(), new TalentPagerFragment()};
        setUpViewPager(fragments.length,fragments);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
        setListeners();
    }

    public void initViews(){
        mSignUpButton = getBt(R.id.sign_up_button);
        mLoginButton = getBt(R.id.login_button);
    }

    public void setListeners(){
        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePagerActivity.this,SignUpActivitySingle.class);
                startActivity(intent);
            }
        });

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePagerActivity.this,SignInActivitySingle.class);
                startActivity(intent);
            }
        });
    }
}
