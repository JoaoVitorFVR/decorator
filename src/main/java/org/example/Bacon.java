package org.example;

public class Bacon extends PedidoDecorator {

    public Bacon(Pedido pedido) {
        super(pedido);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeAdicional() {
        return "Bacon";
    }
}