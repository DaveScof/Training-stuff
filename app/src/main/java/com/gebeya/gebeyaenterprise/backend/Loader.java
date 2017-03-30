/*
package com.gebeya.gebeyaenterprise.backend;

import android.text.TextUtils;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

*/
/**
 * Created by davescof on 3/8/17.
 *//*


public class Loader {
    private OkHttpClient client;

    public String response;
    private int code;

    public String token;
    public String url;

    private String HTTP_METHOD;
    public static final String POST = "post";
    public static final String GET = "get";



    public Loader(String url){
        this.url = url;
        client = new OkHttpClient();
    }

    public Loader setToken(String token){
        this.token = token;
        return this;
    }

    public Loader setHttpMethod (String httpMethod){
        this.HTTP_METHOD = httpMethod;
        return this;
    }

    public boolean isSuccessful(){
        return code >= 200 && code < 300;
    }

    public boolean loadJSON (String jsonString){
        */
/*Initialize the http client if it is null*//*

        Request.Builder builder = new Request.Builder();

        builder.url(url)
                .addHeader("Content-Type", "application/json");

        */
/*Add token, if it is set *//*

        if (TextUtils.isEmpty(token)){
            builder.addHeader("Authorization", "Bearer "+token);
        }

        */
/*Check if it is POST / GET *//*


        if (HTTP_METHOD.equals(POST)){
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody requestBody = RequestBody.create(mediaType, jsonString);

            builder.post(requestBody);
        }
        else{
            builder.get();
        }

        */
/*Create Request *//*

        Request request = builder.build();

        try {
            Response r = client.newCall(request).execute();
            response = r.body().string();
            code = r.code();

            return isSuccessful();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}

*/
