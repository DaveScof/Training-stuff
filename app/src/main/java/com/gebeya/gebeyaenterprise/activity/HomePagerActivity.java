package com.gebeya.gebeyaenterprise.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BasePagerActivity;
import com.gebeya.gebeyaenterprise.fragment.ClientPagerFragment;
import com.gebeya.gebeyaenterprise.fragment.TalentPagerFragment;

/**
 * Created by davescof on 2/11/17.
 */

public class HomePagerActivity extends BasePagerActivity {
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
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(mViewPager, true);

        Fragment[] fragments = new Fragment[]{new ClientPagerFragment(), new TalentPagerFragment()};
        setUpViewPager(fragments.length,fragments);
    }
}
