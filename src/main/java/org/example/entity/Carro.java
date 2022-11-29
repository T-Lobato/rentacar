package org.example.entity;

import org.example.enums.Categoria;
import org.example.enums.Combustivel;
import org.example.enums.Transmissao;

public class Carro {

    private Categoria categoria;
    private Transmissao transmissao;
    private Combustivel combustivel;
    private String marca;
    private String modelo;

    public Carro(){

    }

    public Carro(Categoria categoria, Transmissao transmissao, Combustivel combustivel, String marca, String modelo) {
        this.categoria = categoria;
        this.transmissao = transmissao;
        this.combustivel = combustivel;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}