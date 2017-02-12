package com.qene.androidbasemodule.base;

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
    public abstract void setUpViewPager();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        initViewPager();
        setUpViewPager();
    }

    public ViewPager getVp (int id) {
        return  (ViewPager) findViewById(id);
    }

    public boolean setUpViewPager (final int count, final Fragment... fragments){
        if (mViewPager == null)
            return false;

        mViewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments[position];
            }

            @Override
            public int getCount() {
                return count;
            }
        });


        return true;
    }

    public Button getBt(int id) {
        return (Button) findViewById(id);
    }
}
