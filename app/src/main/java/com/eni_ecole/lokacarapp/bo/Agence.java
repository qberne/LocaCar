package com.eni_ecole.lokacarapp.bo;

public class Agence {

    private int IdAgence;
    private String NomAgence;
    private Gerant Responsable;
    private int NbreVehicules;

    public Agence() {
    }

    public Agence( String nomAgence, Gerant responsable, int nbreVehicules) {
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

    public Gerant getResponsable() {
        return Responsable;
    }

    public void setResponsable(Gerant responsable) {
        Responsable = responsable;
    }

    public int getNbreVehicules() {
        return NbreVehicules;
    }

    public void setNbreVehicules(int nbreVehicules) {
        NbreVehicules = nbreVehicules;
    }
}
