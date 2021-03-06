package com.example.controller;

import com.example.domain.Jugador;
import com.example.domain.Posicion;
import com.example.repository.JugadorRepository;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.*;
import java.net.URI;


/**
 * Created by Sergi Mateu on 24/10/2016.
 */



@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Jugador> createPlayer(@RequestBody Jugador jugador) throws URISyntaxException {
        if (jugador.getId()!= null) {
            return ResponseEntity.
                    badRequest().
                    headers(
                            HeaderUtil.
                                    createFailureAlert("player", "idexists", "A new player cannot already have an ID")).body(null);
        }
        Jugador result = jugadorRepository.save(jugador);
        return ResponseEntity.created(new URI("/jugadores/" + result.getId()))
                .headers(HeaderUtil.createEntityCreationAlert("jugador", result.getId().toString()))
                .body(result);
    }

    /**@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador createPlayer(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }
     */

    @PutMapping
    public Jugador updatePlayer(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @GetMapping
    public List<Jugador> findAll() {
        return jugadorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Jugador findById(@PathVariable Long id) {
        Jugador jugador = jugadorRepository.findOne(id);
        return jugador;
    }

    @GetMapping("/byPoints/{num}")
    public List<Jugador> findBycanastasGreaterThanEqual(@PathVariable Integer num) {
        return jugadorRepository.findBycanastasGreaterThanEqual(num);
    }

    @DeleteMapping("/{id}")
    public void deleteJugador(@PathVariable Long id) {
        jugadorRepository.delete(id);
    }


    @GetMapping("/Jugadoresordcanastas")
    public List<Object[]> findbycanastasorderby() {
        return jugadorRepository.findbycanastasorderby();
    }


    @GetMapping("/between/{puntos1}/{puntos2}")
    public List<Jugador> findBycanastasBetween(@PathVariable Integer puntos1, @PathVariable Integer puntos2) {
        return jugadorRepository.findBycanastasBetween(puntos1, puntos2);
    }


    @GetMapping("/PosicionAndMedia")

    public Map<Posicion, EstadisticasPosicion> findByPosicionAndMedia() {

        List<Object[]> estadisticasPosicions = jugadorRepository.findByPosicionAndMedia ();


        Map<Posicion, EstadisticasPosicion> estadisticasPosicionMap = new HashMap<>();

        estadisticasPosicions.
                forEach(estadisticasPosicion -> {

                    EstadisticasPosicion aux = new EstadisticasPosicion();
                    aux.setPosicion((Posicion) estadisticasPosicion[0]);
                    aux.setMinCanastas((Integer) estadisticasPosicion[1]);
                    aux.setMaxCanastas((Integer) estadisticasPosicion[2]);
                    aux.setAvgCanastas((Double) estadisticasPosicion[3]);

                    estadisticasPosicionMap.put(aux.getPosicion(), aux);

                });

        return estadisticasPosicionMap;
    }

    //ordenar por posiciones
    @GetMapping("/ByPositionALLJugadores")
    public Map<Posicion, Collection<Jugador>> findByAllPosiciones() {
        List<Jugador> jugadores = jugadorRepository.findAll();

        ListMultimap<Posicion, Jugador> jugadorMultiMap = ArrayListMultimap.create();

        jugadores.forEach(jugador ->
                jugadorMultiMap.put(jugador.getPosicion(), jugador));

        System.out.println(jugadorMultiMap.get(Posicion.Base));
        
        return jugadorMultiMap.asMap();


    }


}

/**
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
 */

