package com.example.apirestTP.repositories;

import com.example.apirestTP.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    //Esta interface va a ser un DAO. Un DAO es un patrón que propone separar por completo la lógica de negocio de nuestra aplicación de la lógica para acceder a la base de datos

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    //boolean existsByDni(int dni);

    //@Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?1%")
    //List<Persona> search(String filtro);

    //@Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?2%")
    //List<Persona> search(String filtro, String filtro2);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);
}
