package com.howtodoinjava.example.employee.DAO;

import java.util.Date;

public class ActeurDAO {
    private String nom;
    private String prenom;
    private Date date;
    private String filmographie;

    public ActeurDAO() {
    }

    public ActeurDAO(String nom, String prenom, Date date, String filmographie) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.filmographie = filmographie;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFilmographie() {
        return filmographie;
    }

    public void setFilmographie(String filmographie) {
        this.filmographie = filmographie;
    }

    @Override
    public String toString() {
        return "ActeurDAO{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date=" + date +
                ", filmographie='" + filmographie + '\'' +
                '}';
    }
}
