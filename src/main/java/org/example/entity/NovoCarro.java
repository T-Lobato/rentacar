package org.example.entity;

import org.example.enums.Categoria;
import org.example.enums.Combustivel;
import org.example.enums.Transmissao;

public class NovoCarro extends Carro{

    private Long ano;
    private String placa;

    public NovoCarro(){
    }

    public NovoCarro(Categoria categoria, Transmissao transmissao, Combustivel combustivel,
                     String marca, String modelo, Long ano, String placa) {
        super(categoria, transmissao, combustivel, marca, modelo);
        this.ano = ano;
        this.placa = placa;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}