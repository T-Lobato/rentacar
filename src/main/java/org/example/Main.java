package org.example;

import org.example.service.CarroService;
import org.example.service.ClienteService;
import org.example.service.LocacaoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarroService carroService = new CarroService();
        ClienteService clienteService = new ClienteService();
        LocacaoService locacaoService = new LocacaoService();
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
            } else if(opcao == 2) {
                clienteService.salvar();
            } else if(opcao == 3){
                locacaoService.salvar();
            } else if(opcao == 4) {
                locacaoService.listar();
            } else {
                break;
            }
        }
    }
}
