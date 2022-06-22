import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class PedidoTest {

    Pedido pedido;

    @BeforeEach
    void setUp()
    {
        pedido = new Pedido();
    }

    @Test
    void deveArmazenarEstados()
    {
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals(3, pedido.getEstados().size());
    }

    @Test
    void deveRetornarAoEstadoDeRealizado()
    {
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        pedido.restauraEstado(PedidoEstadoRealizado.getInstance());
        assertEquals(PedidoEstadoRealizado.getInstance(), pedido.getEstado());
    }

    @Test
    void naoDeveRetornarAoEstadoQueAindaNaoPassou()
    {
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        pedido.restauraEstado(PedidoEstadoCancelado.getInstance());
        assertNotEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

}