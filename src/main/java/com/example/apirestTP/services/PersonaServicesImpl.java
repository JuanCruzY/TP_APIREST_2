package com.example.apirestTP.services;

import com.example.apirestTP.entities.Persona;
import com.example.apirestTP.repositories.BaseRepository;
import com.example.apirestTP.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicesImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;


    public PersonaServicesImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }
}
