package com.gebeya.gebeyaenterprise.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gebeya.gebeyaenterprise.base.BaseScreen;
import com.gebeya.gebeyaenterprise.R;

/**
 * Created by dave-5cof on 1/26/17.
 */

public class ProjectInfoFragment extends BaseScreen{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.project_info, container, false);
        initViews();

        return mRoot;
    }

    @Override
    protected void initViews() {
    }

    @Override
    protected void setListeners() {

    }
}
