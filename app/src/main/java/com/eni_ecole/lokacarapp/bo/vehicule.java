package com.eni_ecole.lokacarapp.bo;

public class vehicule {

    private int IdVehicule;
    private String Marque;
    private String Modele;
    private int Places;
    private String Immatriculation;
    private int Chevaux;
    private int Kilometrage;
    private String LienPhoto;
    private int PrixParJour;
    private boolean Disponible;
    private agence AgenceDeRattachement;

    public vehicule(int idVehicule, String marque, String modele, int places, String immatriculation,
                    int chevaux, int kilometrage, String lienPhoto, int prixParJour, boolean disponible, agence agenceDeRattachement) {
        IdVehicule = idVehicule;
        Marque = marque;
        Modele = modele;
        Places = places;
        Immatriculation = immatriculation;
        Chevaux = chevaux;
        Kilometrage = kilometrage;
        LienPhoto = lienPhoto;
        PrixParJour = prixParJour;
        Disponible = disponible;
        AgenceDeRattachement = agenceDeRattachement;
    }

    public int getIdVehicule() {
        return IdVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        IdVehicule = idVehicule;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public String getModele() {
        return Modele;
    }

    public void setModele(String modele) {
        Modele = modele;
    }

    public int getPlaces() {
        return Places;
    }

    public void setPlaces(int places) {
        Places = places;
    }

    public String getImmatriculation() {
        return Immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        Immatriculation = immatriculation;
    }

    public int getChevaux() {
        return Chevaux;
    }

    public void setChevaux(int chevaux) {
        Chevaux = chevaux;
    }

    public int getKilometrage() {
        return Kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        Kilometrage = kilometrage;
    }

    public String getLienPhoto() {
        return LienPhoto;
    }

    public void setLienPhoto(String lienPhoto) {
        LienPhoto = lienPhoto;
    }

    public int getPrixParJour() {
        return PrixParJour;
    }

    public void setPrixParJour(int prixParJour) {
        PrixParJour = prixParJour;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }

    public agence getAgenceDeRattachement() {
        return AgenceDeRattachement;
    }

    public void setAgenceDeRattachement(agence agenceDeRattachement) {
        AgenceDeRattachement = agenceDeRattachement;
    }
}
