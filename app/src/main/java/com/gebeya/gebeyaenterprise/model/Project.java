package com.gebeya.gebeyaenterprise.model;

import java.util.UUID;

/**
 * Created by davescof on 2/25/17.
 */

public class Project {
    private String mTitle;
    private UUID mUUID;

    public Project(UUID uuid){
        mUUID = uuid;
    }

    public Project(){
        this(UUID.randomUUID());
    }
}
