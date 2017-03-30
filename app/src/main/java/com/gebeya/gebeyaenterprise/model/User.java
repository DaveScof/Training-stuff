package com.gebeya.gebeyaenterprise.model;

import java.util.UUID;

/**
 * Created by gebeya-admin on 1/25/17.
 */

public class User {
    private UUID mUUID;
    private String mUserName;
    private String mPhone;

    public User (UUID uuid){
        mUUID = uuid;
    }

    public User(){
        this(UUID.randomUUID());
    }
}
