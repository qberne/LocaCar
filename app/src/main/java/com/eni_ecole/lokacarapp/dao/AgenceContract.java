package com.eni_ecole.lokacarapp.dao;

public class AgenceContract {

    public static final String TABLE_NAME = "AGENCE";
    public static final String COL_ID = "IDAGENCE";
    public static final String COL_NOM_AGENCE = "NOM_AGENCE";
    public static final String COL_GERANT = "GERANT";
    public static final String COL_NBRE_VEHICULE= "NBRE_VEHICULE";

    public static final int NUM_COL_ID = 0;
    public static final int NUM_COL_NOM_AGENCE = 1;
    public static final int NUM_COL_GERANT = 2 ;
    public static final int NUM_COL_NBRE_VEHICULE = 3 ;

    public static final String SQL_CREATE_TABLE =
            " CREATE TABLE IF NOT EXISTS "
                    + TABLE_NAME + " ("
                    + COL_ID
                    + " INTEGER PRIMARY KEY AUTOINCREMENT , "
                    + COL_GERANT
                    + " TEXT , "
                    + COL_NOM_AGENCE
                    + " TEXT , "
                    + COL_NBRE_VEHICULE
                    + " INTEGER )";

    public static final String SQL_DROP_TABLE =
            " DROP TABLE IF EXISTS "
                    + TABLE_NAME;

}