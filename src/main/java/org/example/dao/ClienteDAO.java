package org.example.dao;

import org.example.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Cliente> listar(){
        return clientes;
    }

}
