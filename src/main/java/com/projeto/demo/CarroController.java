package com.projeto.demo;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class CarroController {
        private CarroManager carros = new CarroManager();

     @GetMapping("api/carros")
     public List<Carro> get() {
        return carros.getCarro();
     }   

    }

