package org.example.dao;

import org.example.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private static List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente){
        cliente.setId(clientes.size() + 1);
        clientes.add(cliente);
    }

    public List<Cliente> listar(){
        return clientes;
    }

    public Cliente buscarPorId(int id){
        return clientes.get(id - 1);
    }

}
