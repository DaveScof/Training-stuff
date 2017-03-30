/*
package com.gebeya.gebeyaenterprise.backend;

import org.json.JSONException;
import org.json.JSONObject;

*/
/**
 * Created by davescof on 3/8/17.
 *//*


public class API {
    public static final String BASE_URL = "http://api.staging.gebeya.io/gema/";
    public static final String LOGIN_URL = BASE_URL + "contractors/login";
    public static final String SIGNUP_URL = BASE_URL + "contractors/signup";

    public static boolean login (String username , String password){
        JSONObject b = new JSONObject();
        try  {
            b.put("username",username);
            b.put("password",password);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        */
/* Call Loader and Make http request *//*


        Loader loader = new Loader(LOGIN_URL)
                .setHttpMethod(Loader.POST);

        boolean res = loader.loadJSON(b.toString());

        if(!res) return res;

        */
/*Get the Response *//*

        String response = loader.response;


        return false;
    }
}*/
