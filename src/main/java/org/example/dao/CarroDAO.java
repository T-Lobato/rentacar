package org.example.dao;

import org.example.entity.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    private static List<Carro> carros = new ArrayList<>();

    public void salvar(Carro carro){
        carro.setId(carros.size() + 1);
        carros.add(carro);
    }

    public List<Carro> listar(){
        return carros;
    }

    public Carro deletar(int numero){
        return carros.remove(numero);
    }

    public Carro atualizarStatus(int id){
        Carro carro = carros.get(id);
        carro.setAlugado(!carro.isAlugado());
        return carro;
    }

    public int contarLivres(){
        int count = 0;
        for(Carro c: carros){
            if(!c.isAlugado()) count++;
        }
        return count;
    }

}
