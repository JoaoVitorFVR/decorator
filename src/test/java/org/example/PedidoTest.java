package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarPrecoPedido() {
        Pedido pedido = new LancheBasico(20.0f);

        assertEquals(20.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComQueijoExtra() {
        Pedido pedido = new QueijoExtra(new LancheBasico(20.0f));
        assertEquals(22.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComBacon() {
        Pedido pedido = new Bacon(new LancheBasico(20.0f));
        assertEquals(24.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComMolhoEspecial() {
        Pedido pedido = new MolhoEspecial(new LancheBasico(20.0f));
        assertEquals(21.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComQueijoExtraMaisBacon() {
        Pedido pedido = new QueijoExtra(new Bacon(new LancheBasico(20.0f)));
        assertEquals(26.4f, pedido.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPedidoComQueijoExtraMaisMolhoEspecial() {
        Pedido pedido = new QueijoExtra(new MolhoEspecial(new LancheBasico(20.0f)));
        assertEquals(23.1f, pedido.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPedidoComBaconMaisMolhoEspecial() {
        Pedido pedido = new Bacon(new MolhoEspecial(new LancheBasico(20.0f)));
        assertEquals(25.2f, pedido.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPedidoComQueijoExtraMaisBaconMaisMolhoEspecial() {
        Pedido pedido = new QueijoExtra(new Bacon(new MolhoEspecial(new LancheBasico(20.0f))));
        assertEquals(27.72f, pedido.getPreco(), 0.01f);
    }
}