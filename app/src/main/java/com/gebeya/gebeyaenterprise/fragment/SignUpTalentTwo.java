package com.gebeya.gebeyaenterprise.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BaseScreen;
import com.gebeya.gebeyaenterprise.dialog.SkillsDialog;

/**
 * Created by dave-5cof on 1/29/17.
 */

public class SignUpTalentTwo extends BaseScreen {
    private static final String DIALOG_SKILL = "DialogSkill";
    private Button mLangButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.frag_signup_talent_2, container, false);
        initViews();
        setListeners();
        return mRoot;
    }

    @Override
    protected void initViews() {
        mLangButton = getBt(R.id.langs_spinner);
    }

    @Override
    protected void setListeners() {
        mLangButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fg = getFragmentManager();
                SkillsDialog dialog = new SkillsDialog();
                dialog.show(fg,DIALOG_SKILL);
            }
        });
    }
}
