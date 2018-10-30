package com.eni_ecole.lokacarapp.bo;

import android.widget.ImageView;

import java.util.Date;

public class louerTache {

   private int IdTache;
   private int IdVehicule;
   private int IdClient;
   private Date DateLoue;
   private Date DateRendu;
   private String SmsRecapitulatif;
   private ImageView ImgAvantLouer;
   private ImageView ImgApresRendu;
   private Float PrixTotal;
   private Float Dure;

    public louerTache( int idVehicule, int idClient, Date dateLoue, Date dateRendu, String smsRecapitulatif, ImageView imgAvantLouer, ImageView imgApresRendu, Float prixTotal, Float dure) {
        IdVehicule = idVehicule;
        IdClient = idClient;
        DateLoue = dateLoue;
        DateRendu = dateRendu;
        SmsRecapitulatif = smsRecapitulatif;
        ImgAvantLouer = imgAvantLouer;
        ImgApresRendu = imgApresRendu;
        PrixTotal = prixTotal;
        Dure = dure;
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

    public Date getDateLoue() {
        return DateLoue;
    }

    public void setDateLoue(Date dateLoue) {
        DateLoue = dateLoue;
    }

    public Date getDateRendu() {
        return DateRendu;
    }

    public void setDateRendu(Date dateRendu) {
        DateRendu = dateRendu;
    }

    public String getSmsRecapitulatif() {
        return SmsRecapitulatif;
    }

    public void setSmsRecapitulatif(String smsRecapitulatif) {
        SmsRecapitulatif = smsRecapitulatif;
    }

    public ImageView getImgAvantLouer() {
        return ImgAvantLouer;
    }

    public void setImgAvantLouer(ImageView imgAvantLouer) {
        ImgAvantLouer = imgAvantLouer;
    }

    public ImageView getImgApresRendu() {
        return ImgApresRendu;
    }

    public void setImgApresRendu(ImageView imgApresRendu) {
        ImgApresRendu = imgApresRendu;
    }

    public Float getPrixTotal() {
        return PrixTotal;
    }

    public void setPrixTotal(Float prixTotal) {
        PrixTotal = prixTotal;
    }

    public Float getDure() {
        return Dure;
    }

    public void setDure(Float dure) {
        Dure = dure;
    }
}
