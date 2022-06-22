
/*
 ** created by: jorge.lessa
 */
public class PedidoEstadoEntregue implements IPedidoEstado{

    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();

    private PedidoEstadoEntregue(){};

    public static PedidoEstadoEntregue getInstance()
    {
        return instance;
    }
    
    @Override
    public String getEstado() {
        return "Entregue";
    }
}
