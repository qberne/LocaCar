package com.eni_ecole.lokacarapp.bo;

public class gerant {

    private int IdGerant;
    private String Nom;
    private String Prenom;

    public gerant(int idGerant, String nom, String prenom) {
        IdGerant = idGerant;
        Nom = nom;
        Prenom = prenom;
    }

    public int getIdGerant() {
        return IdGerant;
    }

    public void setIdGerant(int idGerant) {
        IdGerant = idGerant;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }
}