package org.example.service;

import org.example.dao.CarroDAO;
import org.example.entity.Carro;
import org.example.entity.enums.Combustivel;
import org.example.entity.enums.Transmissao;

import java.util.List;
import java.util.Scanner;

public class CarroService {

    private CarroDAO carroDAO;
    private Scanner sc;


    public CarroService() {
        this.carroDAO = new CarroDAO();
        this.sc = new Scanner(System.in);
    }

    public void salvar() {
        Carro carro = new Carro();
        System.out.print("Entre com o nome da categoria: ");
        carro.setCategoria(sc.nextLine());
        System.out.print("Informe a transmissão: ");
        carro.setTransmissao(Transmissao.valueOf(sc.nextLine().toUpperCase()));
        System.out.print("Informe o tipo de combustível: ");
        carro.setCombustivel(Combustivel.valueOf(sc.nextLine().toUpperCase()));
        System.out.print("Informe a Marca: ");
        carro.setMarca(sc.nextLine());
        System.out.print("Informe o Modelo: ");
        carro.setModelo(sc.nextLine());
        carroDAO.salvar(carro);
    }

    public void listarAlugados(){
        List<Carro> carros = carroDAO.listar();
        for(Carro c: carros){
            if(c.isAlugado()) System.out.println(c);
        }
    }

    public void listarLivres(){
        List<Carro> carros = carroDAO.listar();
        for(Carro c: carros){
            if(!c.isAlugado()) System.out.println(c);
        }
    }

    public void listarTodos(){
        List<Carro> carros = carroDAO.listar();
        carros.forEach(System.out::println);
    }

    public Carro alugar(int id) {
        return carroDAO.atualizarStatus(id - 1);
    }

}
