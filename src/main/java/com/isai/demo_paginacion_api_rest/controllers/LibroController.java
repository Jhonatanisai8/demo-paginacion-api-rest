package com.isai.demo_paginacion_api_rest.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isai.demo_paginacion_api_rest.models.Libro;
import com.isai.demo_paginacion_api_rest.services.impl.LibroService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/libros")
@RequiredArgsConstructor
public class LibroController {

    private final LibroService libroService;

    @RequestMapping(path = "/listar", method = RequestMethod.GET)
    public List<Libro> obtenerLibros() {
        return libroService.listarLibros();
    }

    @GetMapping(path = "/paginados")
    public Page<Libro> listarLibrosPaginados() {
        final Pageable pageable = PageRequest.of(0, 10);
        return libroService.listarLibrosPaginados(pageable);
    }

    @GetMapping(path = "/paginados/ordenados")
    public Page<Libro> listarLibrosPaginadosOrdenados() {
        final Pageable pageable = PageRequest.of(0, 10,Sort.by(Direction.DESC,"titulo"));
        return libroService.listarLibrosPaginados(pageable);
    }
}
