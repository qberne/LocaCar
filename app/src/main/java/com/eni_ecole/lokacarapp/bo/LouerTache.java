package com.eni_ecole.lokacarapp.bo;

import android.widget.ImageView;

import java.util.Date;

public class LouerTache {

   private int IdTache;
   private int IdVehicule;
   private int IdClient;
   private String DateLoue;
   private String DateRendu;
   private String SmsRecapitulatif;
   private String ImgAvantLouer;
   private String ImgApresRendu;
   private Float PrixTotal;
   private Float Duree;
   private Float PrixParJour;

    public LouerTache(int idVehicule, int idClient, String dateLoue, String dateRendu, String smsRecapitulatif, String imgAvantLouer, String imgApresRendu, Float prixTotal, Float duree, Float prixParJour) {
        IdVehicule = idVehicule;
        IdClient = idClient;
        DateLoue = dateLoue;
        DateRendu = dateRendu;
        SmsRecapitulatif = smsRecapitulatif;
        ImgAvantLouer = imgAvantLouer;
        ImgApresRendu = imgApresRendu;
        PrixTotal = prixTotal;
        Duree = duree;
        PrixParJour = prixParJour;
    }

    public LouerTache() {
    }

    public int getIdTache() {
        return IdTache;
    }

    public void setIdTache(int idTache) {
        IdTache = idTache;
    }

    public int getIdVehicule() {
        return IdVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        IdVehicule = idVehicule;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int idClient) {
        IdClient = idClient;
    }

    public String getDateLoue() {
        return DateLoue;
    }

    public void setDateLoue(String dateLoue) {
        DateLoue = dateLoue;
    }

    public String getDateRendu() {
        return DateRendu;
    }

    public void setDateRendu(String dateRendu) {
        DateRendu = dateRendu;
    }

    public String getSmsRecapitulatif() {
        return SmsRecapitulatif;
    }

    public void setSmsRecapitulatif(String smsRecapitulatif) {
        SmsRecapitulatif = smsRecapitulatif;
    }

    public String getImgAvantLouer() {
        return ImgAvantLouer;
    }

    public void setImgAvantLouer(String imgAvantLouer) {
        ImgAvantLouer = imgAvantLouer;
    }

    public String getImgApresRendu() {
        return ImgApresRendu;
    }

    public void setImgApresRendu(String imgApresRendu) {
        ImgApresRendu = imgApresRendu;
    }

    public Float getPrixTotal() {
        return PrixTotal;
    }

    public void setPrixTotal(Float prixTotal) {
        PrixTotal = prixTotal;
    }

    public Float getDuree() {
        return Duree;
    }

    public void setDuree(Float duree) {Duree = duree;}

    public Float getPrixParJour() {
        return PrixParJour;
    }

    public void setPrixParJour(Float prixParJour) {
        PrixParJour = prixParJour;
    }

}
