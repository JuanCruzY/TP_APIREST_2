package com.example.apirestTP.repositories;

import com.example.apirestTP.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    //Esta interface va a ser un DAO. Un DAO es un patrón que propone separar por completo la lógica de negocio de nuestra aplicación de la lógica para acceder a la base de datos
    // Aquí puedes agregar métodos personalizados si es necesario
}
