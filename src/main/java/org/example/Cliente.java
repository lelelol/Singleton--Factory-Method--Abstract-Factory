package org.example;

public class Cliente {

    private Cadeira cadeira;
    private Mesa mesa;

    public Cliente(AbstractFactory fabrica) {
        this.cadeira = fabrica.createCadeira();
        this.mesa = fabrica.createMesa();
    }

    public String descreverCadeira() {
        return this.cadeira.descrever();
    }

    public String descreverMesa() {
        return this.mesa.descrever();
    }
}
