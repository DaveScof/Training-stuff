package com.gebeya.gebeyaenterprise.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.gebeya.gebeyaenterprise.database.GebeyaDBSchema.ProjectTable;
import com.gebeya.gebeyaenterprise.database.GebeyaDBSchema.UserTable;

/**
 * Created by davescof on 2/25/17.
 */

public class GebeyaDatabaseHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "gebeyaBase.db";

    public GebeyaDatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + UserTable.NAME + "(" +
        " _id integer primary key autoincrement, "+
        UserTable.Cols.UUID + ", " +
        UserTable.Cols.USERNAME + ", " +
        UserTable.Cols.PHONE+
        ")");

        sqLiteDatabase.execSQL("create table " + ProjectTable.NAME + "(" +
        " _id integer primary key autoincrement, " +
        ProjectTable.Cols.UUID + ", " +
        ProjectTable.Cols.TITLE +
        ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
