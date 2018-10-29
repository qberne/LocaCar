package com.eni_ecole.lokacarapp.bo;

public class agence {

    private int IdAgence;
    private String NomAgence;
    private gerant Responsable;
    private int NbreVehicules;

    public agence(int idAgence, String nomAgence, gerant responsable, int nbreVehicules) {
        IdAgence = idAgence;
        NomAgence = nomAgence;
        Responsable = responsable;
        NbreVehicules = nbreVehicules;
    }

    public int getIdAgence() {
        return IdAgence;
    }

    public void setIdAgence(int idAgence) {
        IdAgence = idAgence;
    }

    public String getNomAgence() {
        return NomAgence;
    }

    public void setNomAgence(String nomAgence) {
        NomAgence = nomAgence;
    }

    public gerant getResponsable() {
        return Responsable;
    }

    public void setResponsable(gerant responsable) {
        Responsable = responsable;
    }

    public int getNbreVehicules() {
        return NbreVehicules;
    }

    public void setNbreVehicules(int nbreVehicules) {
        NbreVehicules = nbreVehicules;
    }
}
