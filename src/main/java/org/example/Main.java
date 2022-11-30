package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.example.entity.Carro;
import org.example.entity.NovoCarro;
import org.example.entity.enums.Combustivel;
import org.example.entity.enums.Transmissao;
import org.example.service.CarroService;

public class Main {
    public static void main(String[] args) {

        CarroService carroService = new CarroService();
        Scanner sc = new Scanner(System.in);

        // Listas
        while(true) {
            System.out.println("\nBem-vindo a Locadora Só o Bagaço, escolha uma das opções abaixo:");
            System.out.println("" +
                    "1) Cadastrar um Novo Veículo.\n" +
                    "2) Cadastrar um Novo Cliente.\n" +
                    "3) Realizar a locação de um Veículo.\n" +
                    "4) Relatório de locação.\n" +
                    "5) Sair");
            System.out.print("Escolha uma das opções: ");
            int opcao = sc.nextInt();
            if(opcao == 1){
                carroService.salvar();
            } else {
                break;
            }
        }
        carroService.listar();
    }
}
