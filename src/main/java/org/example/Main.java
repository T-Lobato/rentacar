package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.example.entity.Carro;

public class Main {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner sc = new Scanner(System.in);

        // Listas
        List<String> listaDeCategorias = new ArrayList<>();

        Carro carro = new Carro();

        List<Carro> carrosCadastrados = new ArrayList<>();

        System.out.println("\nBem-vindo a Locadora Só o Bagaço, escolha uma das opções abaixo:");

        System.out.println("" +
                "1) Cadastrar um Novo Veículo.\n" +
                "2) Cadastrar um Novo Cliente.\n" +
                "3) Realizar a locação de um Veículo.\n" +
                "4) Relatório de locação.\n");

        System.out.print("Escolha uma das opções: ");
        int index = sc.nextInt();

        if(index == 1) {

            for (String listaDeCategoria : listaDeCategorias) {
                System.out.print(listaDeCategoria + " ");
            }

            System.out.println();

            System.out.print("O carro que será cadastrado está em uma das categorias listadas acima? [S/N]: ");
            sc.nextLine();
            String simOuNao = sc.nextLine();

            if(simOuNao.equalsIgnoreCase("N")){

                System.out.print("Entre com o nome da categoria: ");
                carro.setCategoria(sc.nextLine());
                System.out.print("Informe a transmissão: ");
                carro.setTransmissao(sc.nextLine());
                System.out.print("Informe o tipo de combustível: ");
                carro.setCombustivel(sc.nextLine());
                System.out.print("Informe a Marca: ");
                carro.setMarca(sc.nextLine());
                System.out.print("Informe o Modelo: ");
                carro.setModelo(sc.nextLine());

                carrosCadastrados.add(carro);
                listaDeCategorias.add(carro.getCategoria());

            }


        }
    }
}