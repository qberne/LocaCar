package com.eni_ecole.lokacarapp.bo;

public class Gerant {

    private int IdGerant;
    private String Nom;
    private String Prenom;
    private String Login;
    private String Password;

    public Gerant() {
    }

    public Gerant(String nom, String prenom, String login, String password) {
        Nom = nom;
        Prenom = prenom;
        Login = login;
        Password = password;
    }

    public int getIdGerant() {
        return IdGerant;
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

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}