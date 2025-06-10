package com.isai.demo_paginacion_api_rest.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isai.demo_paginacion_api_rest.models.Libro;

@Repository
public interface LibroRepository
        extends JpaRepository<Libro, Integer> {

}
