package com.example.controller;

import com.example.domain.Jugador;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sergi Mateu on 24/10/2016.
 */
@RestController
@RequestMapping ("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    public JugadorController(){

    }

    @RequestMapping(method = {RequestMethod.POST})
    @ResponseStatus(HttpStatus.CREATED)

    public Jugador createJugador(@RequestBody Jugador jugador){return(Jugador)this.jugadorRepository.save(jugador);}

    @RequestMapping(method = {RequestMethod.GET})
    public List<Jugador> findAll(){return this.jugadorRepository.findAll();}

    @RequestMapping(value = "/{id}",
            method = {RequestMethod.GET})
    public Jugador findById(@PathVariable Long id){
        Jugador jugador =  (Jugador)this.jugadorRepository.findOne(id);
        return jugador;
    }

    @RequestMapping(value = "/byCanastas/{num}",
            method = RequestMethod.GET)
    public List<Jugador> findByPointsGreaterThan(@PathVariable Integer num){
        return jugadorRepository.findBycanastasGreaterThanEqual(num);
    }

}