package com.howtodoinjava.example.employee.service;

import com.howtodoinjava.example.employee.DAO.FilmDAO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class filmService {


    private List<FilmDAO> films = new ArrayList<FilmDAO>();
    private String titre;

    public void FilmService() {
        films = new ArrayList<FilmDAO>();
        films.add(new FilmDAO("Viking", "Moussa", "RackNard loadbrod", new Date()));
        films.add(new FilmDAO("PrisonBreak", "Abdou", "Mickel Gerrad", new Date()));
        films.add(new FilmDAO("Theatre", "Ahmed", "Acteur theatre Moussa", new Date()));
    }


    public FilmDAO addFilm(FilmDAO film) {
        films.add(film);
        return film;
    }

    public void deleteFilm(String titre) {
        this.titre = titre;
        for (int i = 0; i < films.size(); i++) {
            if (films.get(i).getTitre().equals(titre)) {
                films.remove(i);
                break;
            }
        }
    }
}
