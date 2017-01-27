package com.gebeya.gebeyaenterprise.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gebeya.gebeyaenterprise.activity.ClientSignUpActivity;
import com.gebeya.gebeyaenterprise.base.BaseScreen;
import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.utils.Fonts;

/**
 * Created by gebeya-admin on 1/23/17.
 */

public class SignUpFragment extends BaseScreen {

    Button mClientSignUpBt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_sign_up, container, false);
        initViews();
        setListeners();
        return root;
    }

    @Override
    protected void initViews() {
        Fonts.initialize(getActivity());
        mClientSignUpBt = getBt(R.id.signUp_client_bt, Fonts.thin);
    }

    @Override
    protected void setListeners() {
        mClientSignUpBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ClientSignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }
}


