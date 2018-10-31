package com.eni_ecole.lokacarapp.dao;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.eni_ecole.lokacarapp.GestionBddHelper;
import com.eni_ecole.lokacarapp.bo.LouerTache;

import java.util.ArrayList;
import java.util.List;

public class LouerTacheDao {

    private SQLiteDatabase db;
    private GestionBddHelper helper;

    public LouerTacheDao(Context context) {
        helper = new GestionBddHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insert(LouerTache item) {
        ContentValues values = new ContentValues();
        values.put(LouerTacheContract.COL_ID_VEHICULE , item.getIdVehicule());
        values.put(LouerTacheContract.COL_ID_CLIENT, item.getIdClient());
        values.put(LouerTacheContract.COL_DATE_LOUE , item.getDateLoue());
        values.put(LouerTacheContract.COL_DATE_RENDU , item.getDateRendu());
        values.put(LouerTacheContract.COL_SMS_RECAPITULATIF, item.getSmsRecapitulatif());
        values.put(LouerTacheContract.COL_IMG_AVANT_LOUER , item.getImgAvantLouer());
        values.put(LouerTacheContract.COL_IMG_APRES_RENDU , item.getImgApresRendu());
        values.put(LouerTacheContract.COL_PRIX_TOTAL, item.getPrixTotal());
        values.put(LouerTacheContract.COL_DUREE , item.getDuree());
        values.put(LouerTacheContract.COL_PRIX_PAR_JOUR, item.getPrixParJour());

        return db.insert(LouerTacheContract.TABLE_NAME, null, values);
    }

    public List<LouerTache> select_all(int id) {
        ContentValues values = new ContentValues();
        Cursor cursor = db.rawQuery("select * from " + LouerTacheContract.TABLE_NAME, null);

        List<LouerTache> list_gerant = new ArrayList<>();

        while (cursor.moveToNext()) {
            LouerTache louerTacheEnCours = new LouerTache();
            louerTacheEnCours.setIdVehicule(cursor.getInt(cursor.getColumnIndex(LouerTacheContract.COL_ID_VEHICULE )));
            louerTacheEnCours.setIdVehicule(cursor.getInt(cursor.getColumnIndex(LouerTacheContract.COL_ID_CLIENT)));
            louerTacheEnCours.setDateLoue(cursor.getString(cursor.getColumnIndex(LouerTacheContract.COL_DATE_LOUE )));
            louerTacheEnCours.setDateRendu(cursor.getString(cursor.getColumnIndex(LouerTacheContract.COL_DATE_RENDU )));
            louerTacheEnCours.setSmsRecapitulatif(cursor.getString(cursor.getColumnIndex(LouerTacheContract.COL_SMS_RECAPITULATIF)));
            louerTacheEnCours.setImgAvantLouer(cursor.getString(cursor.getColumnIndex(LouerTacheContract.COL_IMG_AVANT_LOUER )));
            louerTacheEnCours.setImgApresRendu(cursor.getString(cursor.getColumnIndex(LouerTacheContract.COL_IMG_APRES_RENDU )));
            louerTacheEnCours.setPrixTotal(cursor.getFloat(cursor.getColumnIndex(LouerTacheContract.COL_PRIX_TOTAL)));
            louerTacheEnCours.setDuree(cursor.getFloat(cursor.getColumnIndex(LouerTacheContract.COL_DUREE )));
            louerTacheEnCours.setPrixTotal(cursor.getFloat(cursor.getColumnIndex(LouerTacheContract.COL_PRIX_PAR_JOUR)));

            list_gerant.add(louerTacheEnCours);
        }
        cursor.close();
        db.close();

        return list_gerant;

    }

    public int update(LouerTache item) {
        ContentValues values = new ContentValues();
        values.put(LouerTacheContract.COL_ID_VEHICULE , item.getIdVehicule());
        values.put(LouerTacheContract.COL_ID_CLIENT, item.getIdClient());
        values.put(LouerTacheContract.COL_DATE_LOUE , item.getDateLoue());
        values.put(LouerTacheContract.COL_DATE_RENDU , item.getDateRendu());
        values.put(LouerTacheContract.COL_SMS_RECAPITULATIF, item.getSmsRecapitulatif());
        values.put(LouerTacheContract.COL_IMG_AVANT_LOUER , item.getImgAvantLouer());
        values.put(LouerTacheContract.COL_IMG_APRES_RENDU , item.getImgApresRendu());
        values.put(LouerTacheContract.COL_PRIX_TOTAL, item.getPrixTotal());
        values.put(LouerTacheContract.COL_DUREE , item.getDuree());
        values.put(LouerTacheContract.COL_PRIX_PAR_JOUR, item.getPrixParJour());

        return db.update("LOUER_TACHE", values, null, null);
    }
    public int deleteLouerTache(LouerTache ancienLouerTache) {
        return db.delete("LOUER_TACHE", LouerTacheContract.COL_IDTACHE + " = " + ancienLouerTache, null);

    }

}
