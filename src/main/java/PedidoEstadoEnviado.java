/*
 ** created by: jorge.lessa
 */
public class PedidoEstadoEnviado implements IPedidoEstado{

    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();

    private PedidoEstadoEnviado(){};

    public static PedidoEstadoEnviado getInstance()
    {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Enviado";
    }
}
