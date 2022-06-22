/*
 ** created by: jorge.lessa
 */
public class PedidoEstadoCancelado implements IPedidoEstado{

    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();

    private PedidoEstadoCancelado(){};

    public static PedidoEstadoCancelado getInstance()
    {
        return instance;
    }
    
    @Override
    public String getEstado() {
        return "Cancelado";
    }
}
