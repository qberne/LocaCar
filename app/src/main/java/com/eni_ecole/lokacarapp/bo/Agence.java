package com.eni_ecole.lokacarapp.bo;

public class Agence {

    private int IdAgence;
    private String NomAgence;
    private String Responsable;
    private int NbreVehicules;

    public Agence() {
    }

    public Agence(String nomAgence, String responsable, int nbreVehicules) {
        NomAgence = nomAgence;
        Responsable = responsable;
        NbreVehicules = nbreVehicules;
    }

    public int getIdAgence() {
        return IdAgence;
    }

    public String getNomAgence() {
        return NomAgence;
    }

    public void setNomAgence(String nomAgence) {
        NomAgence = nomAgence;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String responsable) {
        Responsable = responsable;
    }

    public int getNbreVehicules() {
        return NbreVehicules;
    }

    public void setNbreVehicules(int nbreVehicules) {
        NbreVehicules = nbreVehicules;
    }
}
