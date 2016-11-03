package com.example.controller;

import com.example.domain.Equipo;
import com.example.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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