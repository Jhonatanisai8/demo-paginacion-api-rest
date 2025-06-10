package com.isai.demo_paginacion_api_rest.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isai.demo_paginacion_api_rest.models.Libro;
import com.isai.demo_paginacion_api_rest.repositorys.LibroRepository;
import com.isai.demo_paginacion_api_rest.services.LibroCrud;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LibroService implements LibroCrud {

    private final LibroRepository libroRepository;

    @Override
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

}
