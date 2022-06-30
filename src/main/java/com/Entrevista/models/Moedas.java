package com.Entrevista.models;

import javax.persistence.*;

@Entity
public class Moedas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idMoedas;

    public String id;
    public String name;
    public String symbol;
    public int rank;
    public boolean is_new;
    public boolean is_active;
    public String type;



    public Favoritas getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(Favoritas favoritas) {
        this.favoritas = favoritas;
    }

    @ManyToOne
    private Favoritas favoritas;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isIs_new() {
        return is_new;
    }

    public void setIs_new(boolean is_new) {
        this.is_new = is_new;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}
