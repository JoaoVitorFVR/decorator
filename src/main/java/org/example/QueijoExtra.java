package org.example;

public class QueijoExtra extends PedidoDecorator {

    public QueijoExtra(Pedido pedido) {
        super(pedido);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }

    public String getNomeAdicional() {
        return "Queijo Extra";
    }
}