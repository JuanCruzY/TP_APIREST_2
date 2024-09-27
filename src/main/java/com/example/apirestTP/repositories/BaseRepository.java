package com.example.apirestTP.repositories;

import com.example.apirestTP.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean//Permite no instanciar esta entidad.
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository <E, ID>{
}
