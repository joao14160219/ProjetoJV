package com.projeto.demo;

import java.util.*;

public class CarroManager {
    private List<Carro> carros;

    public CarroManager() {
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("911", "porche"));
        this.carros.add(new Carro("corsa", "chevrolet"));
        this.carros.add(new Carro("mobilete", "motoca"));        
    }

    public List<Carro> getCarro() {
        return this.carros;
    }
}