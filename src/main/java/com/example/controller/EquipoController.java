package com.example.controller;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.domain.Localidad;
import com.example.domain.Posicion;
import com.example.repository.EquipoRepository;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Sergi Mateu on 24/10/2016.
 */



@RestController
@RequestMapping("/equipos")
public class EquipoController {

    @Autowired
    private EquipoRepository equipoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Equipo createEquipo(@RequestBody Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @PutMapping
    public Equipo updateEquipo(@RequestBody Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @GetMapping
    public List<Equipo> findAll() {
        return equipoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Equipo findById(@PathVariable Long id) {
        Equipo equipo = equipoRepository.findOne(id);
        return equipo;
    }

    /**ERROR
     *
     * @GetMapping("/byPoints/{num}")
    public List<Equipo> findBycanastasGreaterThanEqual(@PathVariable Integer num) {
        return equipoRepository.findBycanastasGreaterThanEqual(num);
    }
*/
    @DeleteMapping("/{id}")
    public void deleteEquipo(@PathVariable Long id) {
        equipoRepository.delete(id);
    }

    @GetMapping("/ByLocalidadALLEquipos")
    public Map<Localidad, Collection<Equipo>> findByAllPosiciones() {
        List<Equipo> equipos = equipoRepository.findAll();

        ListMultimap<Localidad, Equipo> equipoMultiMap = ArrayListMultimap.create();

        equipos.forEach(equipo ->
                equipoMultiMap.put(equipo.getLocalidad(), equipo));

       // System.out.println(equipoMultiMap.get(Localidad.Base));

        return equipoMultiMap.asMap();


    }
}


/**
@RestController
@RequestMapping ("/equipos")
public class EquipoController {

    @Autowired
    private EquipoRepository equipoRepository;

    public EquipoController(){

    }

    @RequestMapping(method = {RequestMethod.POST})
    @ResponseStatus(HttpStatus.CREATED)

    public Equipo createEquipo(@RequestBody Equipo equipo){return(Equipo)this.equipoRepository.save(equipo);}

    @RequestMapping(method = {RequestMethod.GET})
    public List<Equipo> findAll(){return this.equipoRepository.findAll();}

    @RequestMapping(value = "/{id}",
            method = {RequestMethod.GET})
    public Equipo findById(@PathVariable Long id){
        Equipo equipo =  (Equipo)this.equipoRepository.findOne(id);
        return equipo;
    }

    @RequestMapping(value = "/byLocalidad/{local}",
            method = RequestMethod.GET)
    public List<Equipo> findByLocalidad(@PathVariable String local){
        return equipoRepository.findByLocalidad(local);
    }

}
 */