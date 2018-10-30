package com.eni_ecole.lokacarapp.dao;

public class VehiculeContract {

    public static final String TABLE_NAME = " VEHICULE ";
    public static final String COL_ID = " IDVEHICULE";
    public static final String COL_MARQUE = " MARQUE ";
    public static final String COL_MODELE = " MODELE ";
    public static final String COL_PLACES = " PLACES ";
    public static final String COL_IMMAT = " IMMATRICULATION ";
    public static final String COL_CHEVAUX = " CHEVAUX ";
    public static final String COL_KILOMETRAGE = " KILOMETRAGE ";
    public static final String COL_LIEN_PHOTO = " LIEN_PHOTO ";
    public static final String COL_PRIX_PAR_JOUR = " PRIX PAR JOUR ";
    public static final String COL_DISPONIBLE = " DISPONIBLE";
    public static final String COL_AGENCE_DE_RATTACHEMENT = " AGENCE_DE_RATTACHEMENT ";

    public static final int NUM_COL_ID = 0 ;
    public static final int NUM_COL_MARQUE = 1 ;
    public static final int NUM_COL_MODELE = 2;
    public static final int NUM_COL_PLACES = 3 ;
    public static final int NUM_COL_IMMAT = 4 ;
    public static final int NUM_COL_CHEVAUX = 5 ;
    public static final int NUM_COL_KILOMETRAGE = 6 ;
    public static final int NUM_COL_LIEN_PHOTO = 7 ;
    public static final int NUM_COL_PRIX_PAR_JOUR = 8 ;
    public static final int NUM_COL_DISPONIBLE = 9 ;
    public static final int NUM_COL_AGENCE_DE_RATTACHEMENT = 10 ;

    public static final String SQL_CREATE_TABLE =
            " CREATE TABLE IF NOT EXISTS "
                    + TABLE_NAME + " ("
                    + COL_ID
                    + " INTEGER PRIMARY KEY AUTOINCREMENT , "
                    + COL_MARQUE
                    + " TEXT , "
                    + COL_MODELE
                    + " TEXT , "
                    + COL_PLACES
                    + " INTEGER , "
                    + COL_IMMAT
                    + " TEXT , "
                    + COL_CHEVAUX
                    + " INTEGER , "
                    + COL_KILOMETRAGE
                    + " INTEGER , "
                    + COL_LIEN_PHOTO
                    + " TEXT , "
                    + COL_PRIX_PAR_JOUR
                    + " INTEGER , "
                    + COL_DISPONIBLE
                    + " BOOLEAN , "
                    + COL_AGENCE_DE_RATTACHEMENT
                    + " INTEGER )";

    public static final String SQL_DROP_TABLE =
            " DROP TABLE IF EXISTS "
                    + TABLE_NAME;

}
