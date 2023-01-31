package com.howtodoinjava.example.employee.controller;

import java.util.*;
import java.util.stream.Collectors;

import com.howtodoinjava.example.employee.DAO.ActeurDAO;
import com.howtodoinjava.example.employee.DAO.FilmDAO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaControler {

    public String aide1;
    List<FilmDAO> acteurfilme = new ArrayList<FilmDAO>();

    {
        acteurfilme.add(new FilmDAO("Viking", "Moussa", "RackNard loadbrod", new Date()));
        acteurfilme.add(new FilmDAO("PrisonBreak", "Abdou", "Mickel Gerrad", new Date()));
        acteurfilme.add(new FilmDAO("Theatre", "Ahmed", "Acteur theatre Moussa", new Date()));

    }
    /////////// Récuperer tous les acteurs ;
    @RequestMapping(value = "/listedesfilms")
    public List<FilmDAO> getFilme() {
        return acteurfilme;
    }

    List<ActeurDAO> acteurDAOS = new ArrayList<ActeurDAO>();

    {
        acteurDAOS.add(new ActeurDAO("Racknard", "loadbrod", new Date(), "Racknard"+" Viking" ));
        acteurDAOS.add(new ActeurDAO("Mickel ", "Gerrad", new Date(), "Mickel Gerrad"+ "PrisonBreak"));
        acteurDAOS.add(new ActeurDAO("Acteur theatre", "Moussa",  new Date(), "Acteur theatre Moussa" + "Theatre"));
    }
    @RequestMapping(value = "/listedesacteurs")
    public List<ActeurDAO> getActeur() {
        return acteurDAOS;
    }

    @RequestMapping(value = "/getActeur/{nom}")
    public ActeurDAO getStudent(@PathVariable(value = "nom") String nom) {
        return acteurDAOS.stream().filter(x -> x.getNom().equalsIgnoreCase(nom)).collect(Collectors.toList()).get(0);
    }
}