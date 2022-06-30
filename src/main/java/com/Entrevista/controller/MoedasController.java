package com.Entrevista.controller;

import com.Entrevista.models.Favoritas;
import com.Entrevista.models.Moedas;
import com.Entrevista.repository.FavoritosRepository;
import com.Entrevista.repository.MoedasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MoedasController {

    @Autowired
    private MoedasRepository moedasRepository;
    @Autowired
    private FavoritosRepository favoritosRepository;
    private String url = "https://api.coinpaprika.com/v1/coins";

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("moedas")
    public List<Moedas> getAll() {
        Moedas[] moedas = restTemplate.getForObject(url, Moedas[].class);
        return List.of(moedas);
    }


    @GetMapping("moedasSalvas")
    public Favoritas convertMoedas(Favoritas favoritos) {
        List<Moedas> moedasList = getAll();
        favoritos.setMoedas(moedasList);

        return favoritosRepository.save(favoritos);
    }

       @GetMapping("rankMoedas")
        public List<Moedas> getALlTopMoedas(@RequestParam(value = "rank", required = false) Long rank) {
            return moedasRepository.findTopRankMoedas(rank);
        }



}
