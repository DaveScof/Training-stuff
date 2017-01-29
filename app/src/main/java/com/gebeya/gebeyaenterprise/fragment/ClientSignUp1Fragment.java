package com.gebeya.gebeyaenterprise.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BaseScreen;

/**
 * Created by dave-5cof on 1/29/17.
 */

public class ClientSignUp1Fragment extends BaseScreen {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.client_sign_up1, container, false);
        return mRoot;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void setListeners() {

    }
}
