package org.example;

public abstract class PedidoDecorator implements Pedido {

    private Pedido pedido;
    public String descricao;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.pedido.getPreco()
                * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeAdicional();

    public String getDescricao() {
        return this.pedido.getDescricao()
                + " / " + this.getNomeAdicional();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}