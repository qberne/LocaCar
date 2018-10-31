package com.eni_ecole.lokacarapp.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.eni_ecole.lokacarapp.GestionBddHelper;
import com.eni_ecole.lokacarapp.bo.Agence;
import com.eni_ecole.lokacarapp.bo.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class VehiculeDao {

    private SQLiteDatabase db;
    private GestionBddHelper helper;

    public VehiculeDao(Context context) {
        helper = new GestionBddHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insert(Vehicule item) {
        ContentValues values = new ContentValues();
        values.put(VehiculeContract.COL_MARQUE, item.getMarque());
        values.put(VehiculeContract.COL_MODELE, item.getModele());
        values.put(VehiculeContract.COL_PLACES, item.getPlaces());
        values.put(VehiculeContract.COL_IMMAT, item.getImmatriculation());
        values.put(VehiculeContract.COL_CHEVAUX, item.getChevaux());
        values.put(VehiculeContract.COL_KILOMETRAGE, item.getKilometrage());
        values.put(VehiculeContract.COL_LIEN_PHOTO, item.getLienPhoto());
        values.put(VehiculeContract.COL_PRIX_PAR_JOUR, item.getPrixParJour());
        values.put(VehiculeContract.COL_DISPONIBLE, item.isDisponible());
        values.put(VehiculeContract.COL_AGENCE_DE_RATTACHEMENT, item.getAgenceDeRattachement());

        return db.insert(VehiculeContract.TABLE_NAME, null, values);
    }

    public List<Vehicule> select_all(int id) {
        ContentValues values = new ContentValues();
        Cursor cursor = db.rawQuery("select * from " + VehiculeContract.TABLE_NAME, null);

        List<Vehicule> list_gerant = new ArrayList<>();

        while (cursor.moveToNext()) {
            Vehicule vehiculeEnCours = new Vehicule();
            vehiculeEnCours.setMarque(cursor.getString(cursor.getColumnIndex(VehiculeContract.COL_MARQUE)));
            vehiculeEnCours.setModele(cursor.getString(cursor.getColumnIndex(VehiculeContract.COL_MODELE)));
            vehiculeEnCours.setPlaces(cursor.getInt(cursor.getColumnIndex(VehiculeContract.COL_PLACES)));
            vehiculeEnCours.setImmatriculation(cursor.getString(cursor.getColumnIndex(VehiculeContract.COL_IMMAT)));
            vehiculeEnCours.setChevaux(cursor.getInt(cursor.getColumnIndex(VehiculeContract.COL_CHEVAUX)));
            vehiculeEnCours.setKilometrage(cursor.getInt(cursor.getColumnIndex(VehiculeContract.COL_KILOMETRAGE)));
            vehiculeEnCours.setLienPhoto(cursor.getString(cursor.getColumnIndex(VehiculeContract.COL_LIEN_PHOTO)));
            vehiculeEnCours.setPrixParJour(cursor.getInt(cursor.getColumnIndex(VehiculeContract.COL_PRIX_PAR_JOUR)));
            vehiculeEnCours.setDisponible(cursor.getInt(cursor.getColumnIndex(VehiculeContract.COL_DISPONIBLE)) > 0);
            vehiculeEnCours.setAgenceDeRattachement(cursor.getInt(cursor.getColumnIndex(VehiculeContract.COL_AGENCE_DE_RATTACHEMENT)));

            list_gerant.add(vehiculeEnCours);
        }
        cursor.close();
        db.close();

        return list_gerant;

    }

    public int update(Vehicule item) {
        ContentValues values = new ContentValues();
        values.put(VehiculeContract.COL_MARQUE, item.getMarque());
        values.put(VehiculeContract.COL_MODELE, item.getModele());
        values.put(VehiculeContract.COL_PLACES, item.getPlaces());
        values.put(VehiculeContract.COL_IMMAT, item.getImmatriculation());
        values.put(VehiculeContract.COL_CHEVAUX, item.getChevaux());
        values.put(VehiculeContract.COL_KILOMETRAGE, item.getKilometrage());
        values.put(VehiculeContract.COL_LIEN_PHOTO, item.getLienPhoto());
        values.put(VehiculeContract.COL_PRIX_PAR_JOUR, item.getPrixParJour());
        values.put(VehiculeContract.COL_DISPONIBLE, item.isDisponible());
        values.put(VehiculeContract.COL_AGENCE_DE_RATTACHEMENT, item.getAgenceDeRattachement());

        return db.update("VEHICULE", values, null, null);
    }
    public int deleteVehicule(Vehicule ancienVehicule) {
        return db.delete("VEHICULE", GerantContract.COL_NOM + " = " + ancienVehicule, null);

    }

}