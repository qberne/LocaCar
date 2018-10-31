package com.eni_ecole.lokacarapp.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.eni_ecole.lokacarapp.GestionBddHelper;
import com.eni_ecole.lokacarapp.bo.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDao {

    private SQLiteDatabase db;
    private GestionBddHelper helper;

    public ClientDao(Context context) {
        helper = new GestionBddHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insert(Client item) {
        ContentValues values = new ContentValues();
        values.put(ClientContract.COL_NOM , item.getNom());
        values.put(ClientContract.COL_PRENOM , item.getPrenom());
        values.put(ClientContract.COL_NO_DE_TELEPHONE , item.getNoDeTelephone());
        values.put(ClientContract.COL_EMAIL , item.getEmail());
        values.put(ClientContract.COL_SCAN_DE_PERMIS, item.getScanPermis());

        return db.insert(ClientContract.TABLE_NAME, null, values);
    }

    public List<Client> select_all(int id) {
        ContentValues values = new ContentValues();
        Cursor cursor = db.rawQuery("select * from " + ClientContract.TABLE_NAME, null);

        List<Client> list_gerant = new ArrayList<>();

        while (cursor.moveToNext()) {
           Client clientEnCours = new Client();

           clientEnCours.setNom(cursor.getString(cursor.getColumnIndex(ClientContract.COL_NOM)));
           clientEnCours.setPrenom(cursor.getString(cursor.getColumnIndex(ClientContract.COL_PRENOM)));
           clientEnCours.setNoDeTelephone(cursor.getString(cursor.getColumnIndex(ClientContract.COL_NO_DE_TELEPHONE)));
           clientEnCours.setEmail(cursor.getString(cursor.getColumnIndex(ClientContract.COL_EMAIL)));
           clientEnCours.setScanPermis(cursor.getString(cursor.getColumnIndex(ClientContract.COL_SCAN_DE_PERMIS)));

            list_gerant.add(clientEnCours);
        }
        cursor.close();
        db.close();

        return list_gerant;

    }

    public int update(Client item) {
        ContentValues values = new ContentValues();
        values.put(ClientContract.COL_NOM, item.getNom());
        values.put(ClientContract.COL_PRENOM, item.getPrenom());
        values.put(ClientContract.COL_NO_DE_TELEPHONE, item.getNoDeTelephone());
        values.put(ClientContract.COL_EMAIL, item.getEmail());
        values.put(ClientContract.COL_SCAN_DE_PERMIS, item.getScanPermis());


        return db.update("CLIENT", values, null ,null );
    }

    public int deleteGerant(Client ancienClient) {
        return db.delete("CLIENT", GerantContract.COL_NOM + " = " + ancienClient, null);

    }

}

