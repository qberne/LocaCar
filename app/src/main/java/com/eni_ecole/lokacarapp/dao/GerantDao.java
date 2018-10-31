package com.eni_ecole.lokacarapp.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.eni_ecole.lokacarapp.GestionBddHelper;
import com.eni_ecole.lokacarapp.bo.Gerant;

import java.util.ArrayList;
import java.util.List;

public class GerantDao {

    private SQLiteDatabase db;
    private GestionBddHelper helper;

    public GerantDao(Context context) {
        helper = new GestionBddHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insert(Gerant item) {
        ContentValues values = new ContentValues();
        values.put(GerantContract.COL_NOM, item.getNom());
        values.put(GerantContract.COL_PRENOM, item.getPrenom());
        values.put(GerantContract.COL_LOGIN, item.getPrenom());
        values.put(GerantContract.COL_PASSWORD, item.getPrenom());
        return db.insert(GerantContract.TABLE_NAME, null, values);
    }

    public List<Gerant> select_all(int id) {
        ContentValues values = new ContentValues();
        Cursor cursor = db.rawQuery("select * from " + GerantContract.TABLE_NAME, null);

        List<Gerant> list_gerant = new ArrayList<>();

        while (cursor.moveToNext()) {
            Gerant gerantEnCours = new Gerant();
            gerantEnCours.setNom(cursor.getString(cursor.getColumnIndex(GerantContract.COL_NOM)));
            gerantEnCours.setPrenom(cursor.getString(cursor.getColumnIndex(GerantContract.COL_PRENOM)));
            gerantEnCours.setLogin(cursor.getString(cursor.getColumnIndex(GerantContract.COL_LOGIN)));
            gerantEnCours.setPassword(cursor.getString(cursor.getColumnIndex(GerantContract.COL_PASSWORD)));
            list_gerant.add(gerantEnCours);
        }
        cursor.close();
        db.close();

        return list_gerant;

    }

    public int update(Gerant item) {
        ContentValues values = new ContentValues();
        values.put(GerantContract.COL_NOM, item.getNom());
        values.put(GerantContract.COL_PRENOM, item.getPrenom());
        values.put(GerantContract.COL_LOGIN, item.getLogin());
        values.put(GerantContract.COL_PASSWORD, item.getPassword());

        return db.update("GERANT", values, null ,null );
    }

    public int deleteGerant(String ancienGerant) {
        return db.delete("GERANT", GerantContract.COL_NOM + " = " + ancienGerant, null);

    }

}