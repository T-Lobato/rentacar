package org.example.service;

import org.example.dao.LocacaoDAO;
import org.example.entity.Carro;
import org.example.entity.Cliente;
import org.example.entity.Locacao;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class LocacaoService {

    private LocacaoDAO locacaoDAO;
    private ClienteService clienteService;
    private CarroService carroService;
    private Scanner sc;

    public LocacaoService() {
        this.locacaoDAO = new LocacaoDAO();
        this.clienteService = new ClienteService();
        this.carroService = new CarroService();
        this.sc = new Scanner(System.in);
    }

    public void salvar(){
        if(carroService.carrosLivres() == 0){
            System.out.println("Não há carros livres para alugar!");
            return;
        }
        System.out.println("====================== Clientes ======================");
        clienteService.listar();
        System.out.print("Digite o ID do cliente: ");
        int idCliente = sc.nextInt();
        System.out.println("====================== Carros ======================");
        carroService.listarLivres();
        System.out.print("Digite o ID do carro: ");
        int idCarro = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o fim da locação [dd/MM/aaaa]: ");
        String[] aux = sc.nextLine().split("/");
        LocalDate fimLocacao = LocalDate.of(
                Integer.parseInt(aux[2]),
                Integer.parseInt(aux[1]),
                Integer.parseInt(aux[0]));

        Cliente cliente = clienteService.buscarPorId(idCliente);
        Carro carro = carroService.alugar(idCarro);
        Locacao locacao = new Locacao(fimLocacao, carro, cliente);
        locacaoDAO.salvar(locacao);
    }

    public void listar(){
        List<Locacao> locacoes = locacaoDAO.listar();
        System.out.println("===========================================");
        locacoes.forEach(System.out::println);
        System.out.println("===========================================");
    }

}
