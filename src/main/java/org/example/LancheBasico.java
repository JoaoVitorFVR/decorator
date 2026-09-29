package org.example;

public class LancheBasico implements Pedido{
    public float preco;

    public LancheBasico() {
    }

    public LancheBasico(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Lanche Básico";
    }
}
