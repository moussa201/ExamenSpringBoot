package com.howtodoinjava.example.employee.controller;

import java.util.*;
import java.util.stream.Collectors;

import com.howtodoinjava.example.employee.DAO.ActeurDAO;
import com.howtodoinjava.example.employee.DAO.FilmDAO;
import com.howtodoinjava.example.employee.service.filmService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CinemaControler {

    public String aide1;
    @Autowired
    filmService filmservice = new filmService();

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

    @ApiOperation(value = "Suppression d'une filme ", response = ActeurDAO.class, tags = "deleteFilm")
    @DeleteMapping("/films/{titre}")
    public void deleteFilm(@PathVariable String titre) {
        filmservice.deleteFilm(titre);
    }

    @ApiOperation(value = "Ajout d'une film ", response = ActeurDAO.class, tags = "addedFilm")
    @PostMapping
    public ResponseEntity<FilmDAO> addFilm(@RequestBody FilmDAO film) {
        FilmDAO addedFilm = filmservice.addFilm(film);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedFilm);
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

    @ApiOperation(value = "Pour avoir un filme en fonction de nom ", response = ActeurDAO.class, tags = "getActeur")
    @RequestMapping(value = "/getActeur/{nom}")
    public ActeurDAO getActeur(@PathVariable(value = "nom") String nom) {
        return acteurDAOS.stream().filter(x -> x.getNom().equalsIgnoreCase(nom)).collect(Collectors.toList()).get(0);
    }


}