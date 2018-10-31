package com.eni_ecole.lokacarapp.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.eni_ecole.lokacarapp.GestionBddHelper;
import com.eni_ecole.lokacarapp.bo.Agence;

import java.util.ArrayList;
import java.util.List;

public class AgenceDao {

    private SQLiteDatabase db;
    private GestionBddHelper helper;

    public AgenceDao(Context context) {
        helper = new GestionBddHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insert(Agence item) {
        ContentValues values = new ContentValues();
        values.put(AgenceContract.COL_NOM_AGENCE, item.getNomAgence());
        values.put(AgenceContract.COL_GERANT, item.getResponsable());
        values.put(AgenceContract.COL_NBRE_VEHICULE, item.getNbreVehicules());

        return db.insert(AgenceContract.TABLE_NAME, null, values);
    }

    public List<Agence> select_all(int id) {
        ContentValues values = new ContentValues();
        Cursor cursor = db.rawQuery("select * from " + AgenceContract.TABLE_NAME, null);

        List<Agence> list_agence = new ArrayList<>();

        while (cursor.moveToNext()) {
            Agence agenceEnCours = new Agence();
            agenceEnCours.setNomAgence(cursor.getString(cursor.getColumnIndex(AgenceContract.COL_NOM_AGENCE)));
            agenceEnCours.setResponsable(cursor.getString(cursor.getColumnIndex(AgenceContract.COL_GERANT)));
            agenceEnCours.setNbreVehicules(cursor.getInt(cursor.getColumnIndex(AgenceContract.COL_NBRE_VEHICULE)));

            list_agence.add(agenceEnCours);
        }
        cursor.close();
        db.close();

        return list_agence;

    }

    public int update(Agence item) {
        ContentValues values = new ContentValues();
        values.put(AgenceContract.COL_NOM_AGENCE, item.getNomAgence());
        values.put(AgenceContract.COL_GERANT, item.getResponsable());
        values.put(AgenceContract.COL_NBRE_VEHICULE, item.getNbreVehicules());

        return db.update("AGENCE", values, null ,null );
    }

    public int deleteAgence(Agence ancienAgence) {
        return db.delete("AGENCE", AgenceContract.COL_NOM_AGENCE+ " = " + ancienAgence, null);

    }

}
