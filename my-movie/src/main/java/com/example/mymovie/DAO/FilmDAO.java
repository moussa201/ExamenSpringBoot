package com.example.mymovie.DAO;

import java.util.Date;

public class FilmDAO {

    private String titre;
    private String realisateur;
    private String acteurprincipal;
    private Date datesortie;

    public FilmDAO() {
    }

    public FilmDAO(String titre, String realisateur, String acteurprincipal, Date datesortie) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurprincipal = acteurprincipal;
        this.datesortie = datesortie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getActeurprincipal() {
        return acteurprincipal;
    }

    public void setActeurprincipal(String acteurprincipal) {
        this.acteurprincipal = acteurprincipal;
    }

    public Date getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(Date datesortie) {
        this.datesortie = datesortie;
    }

    @Override
    public String toString() {
        return "FilmDAO{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", acteurprincipal='" + acteurprincipal + '\'' +
                ", datesortie=" + datesortie +
                '}';
    }
}
