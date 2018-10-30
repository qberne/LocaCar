package com.eni_ecole.lokacarapp.dao;

public class ClientContract {

    public static final String TABLE_NAME = " CLIENT ";
    public static final String COL_ID = " IDCLIENT ";
    public static final String COL_NOM = " NOM CLIENT ";
    public static final String COL_PRENOM = " PRENOM CLIENT ";
    public static final String COL_NO_DE_TELEPHONE = " NO DE TELEPHONE ";
    public static final String COL_EMAIL = " EMAIL ";
    public static final String COL_SCAN_DE_PERMIS = " PERMIS";  // url du stockage

    public static final int NUM_COL_ID = 0;
    public static final int NUM_COL_NOM = 1 ;
    public static final int NUM_COL_PRENOM = 2 ;
    public static final int NUM_COL_NO_DE_TELEPHONE = 3 ;
    public static final int NUM_COL_EMAIL = 4 ;
    public static final int NUM_SCAN_DE_PERMIS = 5 ;

    public static final String SQL_CREATE_TABLE =
            " CREATE TABLE IF NOT EXISTS "
                    + TABLE_NAME + " ("
                    + COL_ID
                    + " INTEGER PRIMARY KEY AUTOINCREMENT , "
                    + COL_NOM
                    + " TEXT , "
                    + COL_PRENOM
                    + " TEXT , "
                    + COL_NO_DE_TELEPHONE
                    + " TEXT , "
                    + COL_SCAN_DE_PERMIS
                    + " TEXT , "
                    + COL_EMAIL
                    + " TEXT ) ";

    public static final String SQL_DROP_TABLE =
            " DROP TABLE IF EXISTS "
                    + TABLE_NAME;

}
