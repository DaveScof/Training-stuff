package com.gebeya.gebeyaenterprise.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;


/**
 * Created by dave-5cof on 1/29/17.
 */

public abstract class BasePagerActivity extends AppCompatActivity {

    public ViewPager mViewPager;
    protected abstract void setContentView ();
    public abstract void initViewPager ();
    public abstract void addFragments();
    public abstract void initViews();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        initViews();
        initViewPager();
        addFragments();
    }

    public ViewPager getVp (int id) {
        return  (ViewPager) findViewById(id);
    }

    public boolean addFragments(final Fragment... fragments){
        if (mViewPager == null)
            return false;

        mViewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments[position];
            }

            @Override
            public int getCount() {
                return fragments.length;
            }
        });

        return true;
    }

    public Button getBt(int id) {
        return (Button) findViewById(id);
    }
}
