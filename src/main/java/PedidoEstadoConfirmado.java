/*
 ** created by: jorge.lessa
 */
public class PedidoEstadoConfirmado implements IPedidoEstado{

    private static PedidoEstadoConfirmado instance = new PedidoEstadoConfirmado();

    private PedidoEstadoConfirmado(){};

    public static PedidoEstadoConfirmado getInstance()
    {
        return instance;
    }
    
    @Override
    public String getEstado() {
        return "Confirmado";
    }
}
