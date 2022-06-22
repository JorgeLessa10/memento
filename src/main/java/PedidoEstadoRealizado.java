/*
 ** created by: jorge.lessa
 */
public class PedidoEstadoRealizado implements IPedidoEstado{

    private static PedidoEstadoRealizado instance = new PedidoEstadoRealizado();

    private PedidoEstadoRealizado(){};

    public static PedidoEstadoRealizado getInstance()
    {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Realizado";
    }
}
