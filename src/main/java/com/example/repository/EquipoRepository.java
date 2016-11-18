package com.example.repository;

import com.example.domain.Equipo;
import com.example.domain.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Sergi M on 21/10/2016.
 */
    public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    List<Equipo> findByLocalidad(Localidad localidad);

    //List<Equipo> findByNombreEquipo(String nombre);

    //List<Equipo> findByPosicion(String Equipo, String posicion);



}