package com.Entrevista.models;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Favoritas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDate created = LocalDate.now();
    private LocalTime updated = LocalTime.now(); //data de atualização do favorito

    public long getAllId() {
        return (id.equals(0) ? null : id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Moedas> getMoedas() {
        return moedas;
    }

    public void setMoedas(List<Moedas> moedas) {
        this.moedas = moedas;
    }

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "favoritas")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Moedas> moedas = new ArrayList<>();//ou coinId: símbolo da moeda (ex: BTC, ETH, XNO) ou id da API




    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalTime updated) {
        this.updated = updated;
    }
}
