package org.example.service;

import org.example.dao.ClienteDAO;
import org.example.entity.Cliente;

import java.util.List;
import java.util.Scanner;

public class ClienteService {

    private ClienteDAO clienteDAO;
    private Scanner sc;

    public ClienteService() {
        this.clienteDAO = new ClienteDAO();
        this.sc = new Scanner(System.in);
    }

    public void salvar(){
        Cliente cliente = new Cliente();
        System.out.print("Nome: ");
        cliente.setNome(sc.nextLine());
        System.out.print("CPF: ");
        cliente.setCpf(sc.nextLine());
        System.out.print("RG: ");
        cliente.setRg(sc.nextLine());
        clienteDAO.salvar(cliente);
    }

    public void listar(){
        List<Cliente> clientes = clienteDAO.listar();
        clientes.forEach(System.out::println);
    }

}
