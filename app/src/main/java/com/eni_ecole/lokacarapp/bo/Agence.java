package com.eni_ecole.lokacarapp.bo;

public class Agence {

    private int IdAgence;
    private String NomAgence;
    private int Responsable;
    private int NbreVehicules;

    public Agence() {
    }

    public Agence(String nomAgence, int responsable, int nbreVehicules) {
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

    public int getResponsable() {
        return Responsable;
    }

    public void setResponsable(int responsable) {
        Responsable = responsable;
    }

    public int getNbreVehicules() {
        return NbreVehicules;
    }

    public void setNbreVehicules(int nbreVehicules) {
        NbreVehicules = nbreVehicules;
    }
}
