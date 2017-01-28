package com.gebeya.gebeyaenterprise.utils;

import android.text.TextUtils;

import com.gebeya.gebeyaenterprise.model.Country;

/**
 * Created by MATIVO-PC on 5/24/2015, 2:06 PM
 * Modified by davescof on 26/1/2017, 11:14 PM
 */
public class ValidateUtils {

    /**
     * Checks that a value is not empty
     *
     * @param value The String Value to validate
     * @return boolean, TRUE if its not Empty
     */
    public static boolean isNotEmpty(String value) {
        return !TextUtils.isEmpty(value);
    }

    public static boolean isNotEmpty(String...value){
        for (String s:
                value) {
            if (TextUtils.isEmpty(s.trim())) return false;
        }
        //Country.addCountries();
        return true;
    }

    /**
     * Validate the Email Address.
     *
     * @param target The Email Address to validate
     * @return boolean, TRUE is its valid
     */
    public static boolean isValidEmail(String target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}
