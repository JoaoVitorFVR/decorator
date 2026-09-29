package org.example;

public class MolhoEspecial extends PedidoDecorator {

    public MolhoEspecial(Pedido pedido) {
        super(pedido);
    }

    public float getPercentualPreco() {
        return 5.0f;
    }

    public String getNomeAdicional() {
        return "Molho Especial";
    }
}