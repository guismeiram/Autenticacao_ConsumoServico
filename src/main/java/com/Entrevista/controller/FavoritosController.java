package com.Entrevista.controller;

import com.Entrevista.repository.FavoritosRepository;
import com.Entrevista.repository.MoedasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FavoritosController {

    @Autowired
    private MoedasRepository moedasRepository;

    @Autowired
    private FavoritosRepository favoritosRepository;
}
