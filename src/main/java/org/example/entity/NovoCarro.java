package org.example.entity;

public class NovoCarro extends Carro{

    private Integer ano;
    private String placa;

    public NovoCarro(){
    }

    public NovoCarro(Integer ano, String placa) {
        this.ano = ano;
        this.placa = placa;
    }

    public NovoCarro(String categoria, String transmissao, String combustivel, String marca, String modelo, Integer ano, String placa) {
        super(categoria, transmissao, combustivel, marca, modelo);
        this.ano = ano;
        this.placa = placa;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}