package org.example.entity;

import java.time.LocalDate;

public class Locacao {

    private LocalDate inicio = LocalDate.now();
    private LocalDate fim;
    private Carro carro;
    private Cliente cliente;

    public Locacao(LocalDate fim, Carro carro, Cliente cliente) {
        this.fim = fim;
        this.carro = carro;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Ínicio: " + inicio +
                " - Fim: " + fim +
                " - Carro: " + carro.getModelo() +
                " - Cliente: " + cliente.getNome();
    }

}
