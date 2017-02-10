package com.gebeya.gebeyaenterprise.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BaseScreen;

/**
 * Created by dave-5cof on 1/29/17.
 */

public class ClientSignUp2Fragment extends BaseScreen {


    Button mSignUpButton;
    String JsonIn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.client_sign_up2, container, false);

        return mRoot;
    }

    @Override
    protected void initViews() {
        mSignUpButton = getBt(R.id.signUp_client_bt);
    }

    @Override
    protected void setListeners() {
        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText fName = getEd(R.id.first_name_Ed);
                EditText sName = getEd(R.id.second_name_Ed);

                Spinner countrySpinner = getSp(R.id.country_sp);
                Spinner citySpinner = getSp(R.id.city_sp);

                String firstName = fName.getEditableText().toString().trim();
                String secondName = sName.getEditableText().toString().trim();


                String country = countrySpinner.getSelectedItem().toString();
                String city = citySpinner.getSelectedItem().toString();

                int countrySelPos = countrySpinner.getSelectedItemPosition();
                int citySelPos = citySpinner.getSelectedItemPosition();

                if (!firstName.equals("")){
                    return;
                }

                if (!secondName.equals("")){
                    return;
                }

                boolean selectionValid = countrySelPos > 0 && citySelPos > 0;
                if(!selectionValid){
                    return;
                }
            }
        });
    }
}
