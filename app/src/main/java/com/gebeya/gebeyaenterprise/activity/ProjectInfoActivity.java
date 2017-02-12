package com.gebeya.gebeyaenterprise.activity;

import android.support.v4.app.Fragment;

import com.gebeya.gebeyaenterprise.base.BaseSingleFragmentActivity;
import com.gebeya.gebeyaenterprise.fragment.ProjectInfo;

/**
 * Created by dave-5cof on 1/26/17.
 */

public class ProjectInfoActivity extends BaseSingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new com.gebeya.gebeyaenterprise.fragment.ProjectInfo();
    }
}
