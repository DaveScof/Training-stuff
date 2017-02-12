package com.gebeya.gebeyaenterprise.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BaseScreen;

/**
 * Created by dave-5cof on 1/29/17.
 */

public class SignUpTalentOne extends BaseScreen implements View.OnClickListener{

    private Button nextButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.frag_signup_talent_1,container,false);
        return mRoot;
    }

    @Override
    protected void initViews() {
        nextButton = getBt(R.id.nextButotn);
    }

    @Override
    protected void setListeners() {
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        
    }
}
