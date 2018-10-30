package com.eni_ecole.lokacarapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.eni_ecole.lokacarapp.dao.LouerTacheContract;
import com.eni_ecole.lokacarapp.dao.AgenceContract;
import com.eni_ecole.lokacarapp.dao.ClientContract;
import com.eni_ecole.lokacarapp.dao.GerantContract;
import com.eni_ecole.lokacarapp.dao.VehiculeContract;

public class GestionBddHelper extends SQLiteOpenHelper {

    private final static String DATABASE_NAME = "Lokacar.db";
    private final static int DATABASE_VERSION = 1;

    public GestionBddHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
        public void onCreate(SQLiteDatabase db) {
        db.execSQL(AgenceContract.SQL_CREATE_TABLE);
        db.execSQL(ClientContract.SQL_CREATE_TABLE);
        db.execSQL(GerantContract.SQL_CREATE_TABLE);
        db.execSQL(VehiculeContract.SQL_CREATE_TABLE);
        db.execSQL(LouerTacheContract.SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(AgenceContract.SQL_DROP_TABLE);
        db.execSQL(ClientContract.SQL_DROP_TABLE);
        db.execSQL(GerantContract.SQL_DROP_TABLE);
        db.execSQL(VehiculeContract.SQL_DROP_TABLE);
        db.execSQL(LouerTacheContract.SQL_DROP_TABLE);
        onCreate(db);
    }


 }