package com.gebeya.gebeyaenterprise.database;

/**
 * Created by davescof on 2/25/17.
 */

public class GebeyaDBSchema {

    public static final class UserTable{
        public static final String NAME = "users";
        public static final int VERSION = 1;

        public static final class Cols{
            public static final String UUID = "UUID";
            public static final String USERNAME = "username";
            public static final String PHONE = "phone";
        }
    }

    public static final class ProjectTable {
        public static final String NAME = "project";

        public static final class Cols {
            public static final String TITLE = "title";
            public static final String UUID = "uuid";
        }
    }
}
