package org.example.entity;

public class Carro {

    private String categoria;
    private String transmissao;
    private String combustivel;
    private String marca;
    private String modelo;

    public Carro(){
    }

    public Carro(String categoria, String transmissao, String combustivel, String marca, String modelo) {
        this.categoria = categoria;
        this.transmissao = transmissao;
        this.combustivel = combustivel;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
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

    @Override
    public String toString() {
        return "Carro{" +
                "categoria='" + categoria + '\'' +
                ", transmissao='" + transmissao + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}