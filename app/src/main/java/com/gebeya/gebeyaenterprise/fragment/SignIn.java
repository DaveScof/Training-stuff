package com.gebeya.gebeyaenterprise.fragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gebeya.gebeyaenterprise.activity.HomeActivity;
import com.gebeya.gebeyaenterprise.activity.SignUpActivity;
import com.gebeya.gebeyaenterprise.base.BaseScreen;
import com.gebeya.gebeyaenterprise.R;

public class SignIn extends BaseScreen {

    /**
     * Widgets
     */
    private EditText mEmailEditText;
    private EditText mPasswordEditText;
    private Button mSignInButton;
    private TextView mSignUpTextView;

    private String mEmailInput;
    private String mPasswordInput;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.frag_sign_in, container, false);
        initViews();
        setListeners();
        return mRoot;
    }

    @Override
    protected void initViews() {
        mEmailEditText = getEd(R.id.email_edit_text);
        mPasswordEditText = getEd(R.id.password_edit_text);
        mSignInButton = getBt(R.id.sign_in_button);
        mSignUpTextView = getTv(R.id.signUpLink);
    }

    @Override
    protected void setListeners() {

        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mEmailInput = mEmailEditText.getText().toString().trim();
                mPasswordInput = mPasswordEditText.getText().toString();

                boolean isEmailSet = !TextUtils.isEmpty(mEmailInput);

                if (!isEmailSet) {
                    mEmailEditText.setError("Please enter email address");
                    return;
                }

                boolean isPasswordSet = !TextUtils.isEmpty(mPasswordInput);
                if (!isPasswordSet) {
                    mPasswordEditText.setError("Please enter password");
                    return;
                }

                Intent intent = new Intent(getActivity(), HomeActivity.class);
                startActivity(intent);
            }
        });

        mPasswordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_GO){
                    mSignInButton.callOnClick();
                    return true;
                }
                return false;
            }
        });

        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
