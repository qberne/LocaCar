package com.eni_ecole.lokacarapp.bo;

public class Client {

    private int IdClient;
    private String Nom;
    private String Prenom;
    private String NoDeTelephone;
    private String Email;
    private String ScanPermis;              // url du stockage

    public Client(int idClient, String nom, String prenom, String noDeTelephone, String email, String scanPermis) {
        IdClient = idClient;
        Nom = nom;
        Prenom = prenom;
        NoDeTelephone = noDeTelephone;
        Email = email;
        ScanPermis = scanPermis;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int idClient) {
        IdClient = idClient;
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

    public String getNoDeTelephone() {
        return NoDeTelephone;
    }

    public void setNoDeTelephone(String noDeTelephone) {
        NoDeTelephone = noDeTelephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getScanPermis() {
        return ScanPermis;
    }

    public void setScanPermis(String scanPermis) {
        ScanPermis = scanPermis;
    }

}
