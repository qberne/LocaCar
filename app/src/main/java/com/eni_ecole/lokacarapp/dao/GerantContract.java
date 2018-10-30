package com.eni_ecole.lokacarapp.dao;

public class GerantContract {
    public static final String TABLE_NAME = " GERANT ";
    public static final String COL_ID = " IDGERANT ";
    public static final String COL_NOM = " NOM GERANT ";
    public static final String COL_PRENOM = " PRENOM GERANT ";
    public static final String COL_LOGIN = " LOGIN ";
    public static final String COL_PASSWORD = " PASSWORD ";

    public static final int NUM_COL_ID = 0;
    public static final int NUM_COL_NOM = 1 ;
    public static final int NUM_COL_PRENOM = 2 ;
    public static final int NUM_COL_LOGIN = 3 ;
    public static final int NUM_COL_PASSWORD = 4 ;

    public static final String SQL_CREATE_TABLE =
            " CREATE TABLE IF NOT EXISTS "
                    + TABLE_NAME + " ("
                    + COL_ID
                    + " INTEGER PRIMARY KEY AUTOINCREMENT , "
                    + COL_NOM
                    + " TEXT , "
                    + COL_PRENOM
                    + " TEXT , "
                    + COL_LOGIN
                    + " TEXT , "
                    + COL_PASSWORD
                    + " TEXT ) ";

    public static final String SQL_DROP_TABLE =
            " DROP TABLE IF EXISTS "
                    + TABLE_NAME;

}
