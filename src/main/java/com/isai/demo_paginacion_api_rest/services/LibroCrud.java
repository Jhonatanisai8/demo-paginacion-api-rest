package com.isai.demo_paginacion_api_rest.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.isai.demo_paginacion_api_rest.models.Libro;

public interface LibroCrud {

    List<Libro> listarLibros();

    Page<Libro> listarLibrosPaginados(Pageable pageable);
}
