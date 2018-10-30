package com.eni_ecole.lokacarapp.dao;

public class LouerTacheContract {

    public static final String TABLE_NAME = " LOUER_TACHE ";
    public static final String COL_IDTACHE = " IDTACHE ";
    public static final String COL_ID_VEHICULE = " ID VEHICULE";
    public static final String COL_ID_CLIENT= " ID_CLIENT";
    public static final String COL_DATE_LOUE = " DATE LOUE ";
    public static final String COL_DATE_RENDU = " DATE_RENDU";
    public static final String COL_SMS_RECAPITULATIF= " SMS RECAPITULATIF";
    public static final String COL_IMG_AVANT_LOUER = " IMG_AVANT_LOUER ";
    public static final String COL_IMG_APRES_RENDU = " IMG_APRES_RENDU ";
    public static final String COL_PRIX_TOTAL= " PRIX_TOTAL ";
    public static final String COL_DUREE = " GERANT ";
    public static final String COL_PRIX_PAR_JOUR= " PRIX_PAR_JOUR";


    public static final int NUM_COL_IDTACHE = 0;
    public static final int NUM_COL_ID_VEHICULE =  1 ;
    public static final int NUM_COL_ID_CLIENT=  2;
    public static final int NUM_COL_DATE_LOUE = 3;
    public static final int NUM_COL_DATE_RENDU =  4;
    public static final int NUM_COL_SMS_RECAPITULATIF=  5;
    public static final int NUM_COL_IMG_AVANT_LOUER =  6;
    public static final int NUM_COL_IMG_APRES_RENDU =  7;
    public static final int NUM_COL_PRIX_TOTAL=  8;
    public static final int NUM_COL_DUREE =  9;
    public static final int NUM_COL_PRIX_PAR_JOUR= 10;

    public static final String SQL_CREATE_TABLE =
            " CREATE TABLE IF NOT EXISTS "
                    + TABLE_NAME + " ("
                    + COL_IDTACHE
                    + " INTEGER PRIMARY KEY AUTOINCREMENT , "
                    +COL_ID_VEHICULE
                    + " INTEGER , "
                    +COL_ID_CLIENT
                    + " INTEGER , "
                    +COL_DATE_LOUE
                    + " TEXT , "
                    +COL_DATE_RENDU
                    + " TEXT , "
                    +COL_SMS_RECAPITULATIF
                    + " TEXT , "
                    +COL_IMG_AVANT_LOUER
                    + " TEXT , "
                    +COL_IMG_APRES_RENDU
                    + " TEXT , "
                    +COL_PRIX_TOTAL
                    + " INTEGER , "
                    +COL_DUREE
                    + " INTEGER , "
                    +COL_PRIX_PAR_JOUR
                    + " INTEGER )";

    public static final String SQL_DROP_TABLE =
            " DROP TABLE IF EXISTS "
                    + TABLE_NAME;

}


