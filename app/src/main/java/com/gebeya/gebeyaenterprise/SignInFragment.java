package com.gebeya.gebeyaenterprise;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInFragment extends Fragment {

    private EditText mEmailEditText;
    private EditText mPasswordEditText;
    private Button mSignInButton;

    private String mEmailInput;
    private String mPasswordInput;

    private TextView mSignUpTextView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_in, container, false);
        mEmailEditText = (EditText) view.findViewById(R.id.email_edit_text);

        mPasswordEditText = (EditText) view.findViewById(R.id.password_edit_text);

        mSignInButton = (Button) view.findViewById(R.id.sign_in_button);
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
                if (!isPasswordSet){
                    mPasswordEditText.setError("Please enter password");
                    return;
                }

                Toast.makeText(getActivity(), "Signing in...", Toast.LENGTH_SHORT).show();
            }
        });

        mSignUpTextView = (TextView) view.findViewById(R.id.signUpLink);
        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SignUpActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
