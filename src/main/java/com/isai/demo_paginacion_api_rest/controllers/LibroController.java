package com.isai.demo_paginacion_api_rest.controllers;

import java.util.List;

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

    @RequestMapping(path = "/listar",method = RequestMethod.GET)
    public List<Libro> obtenerLibros() {
        return libroService.listarLibros();
    }
}
