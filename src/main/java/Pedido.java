import java.util.ArrayList;
import java.util.List;

/*
 ** created by: jorge.lessa
 */
public class Pedido {

    private Integer numero;
    private IPedidoEstado estado;
    private List<IPedidoEstado> memento = new ArrayList<>();

    public Pedido() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public IPedidoEstado getEstado() {
        return estado;
    }

    public void setEstado(IPedidoEstado estado) {
        this.estado = estado;
        this.memento.add(estado);
    }

    public void restauraEstado(IPedidoEstado estado)
    {
        for (IPedidoEstado e : memento)
        {
            if(e.getEstado() == estado.getEstado())
            {
                this.estado = e;
            }
        }
    }

    public List<IPedidoEstado> getEstados()
    {
        return this.memento;
    }
}
