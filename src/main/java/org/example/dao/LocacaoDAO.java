package org.example.dao;

import org.example.entity.Locacao;

import java.util.ArrayList;
import java.util.List;

public class LocacaoDAO {

    private static List<Locacao> locacoes = new ArrayList<>();

    public void salvar(Locacao locacao){
        locacoes.add(locacao);
    }

    public List<Locacao> listar(){
        return locacoes;
    }

}
