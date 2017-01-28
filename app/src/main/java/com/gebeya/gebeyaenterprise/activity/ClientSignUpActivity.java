package com.gebeya.gebeyaenterprise.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BaseActivity;

/**
 * Created by dave-5cof on 1/27/17.
 */

public class ClientSignUpActivity extends BaseActivity {

    Button mSignUpButton;
    String JsonIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client_sign_up2);
    }

    @Override
    public void initViews() {
        mSignUpButton = getBt(R.id.signUp_client_bt);
    }

    @Override
    public void setListeners() {
        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText fName = getEd(R.id.first_name_Ed);
                EditText sName = getEd(R.id.second_name_Ed);

                Spinner countrySpinner = (Spinner) findViewById(R.id.country_sp);
                Spinner citySpinner = (Spinner) findViewById(R.id.city_sp);

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
