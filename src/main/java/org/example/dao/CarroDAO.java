package org.example.dao;

import org.example.entity.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    List<Carro> carros = new ArrayList<>();

    public void salvar(Carro carro){
        carros.add(carro);
    }

    public List<Carro> listar(){
        return carros;
    }

    public Carro deletar(int numero){
        return carros.remove(numero);
    }

}
