import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public Loja(String nome) {
        this.nome = nome;
    }

    public String getNomeLoja() {
        return nome;
    }

    public void setNomeLoja(String nome) {
        this.nome = nome;
    }

    public void listaClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            cliente.mostrarCliente();
        }
    }

    public void listaPedidos() {
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido pedido = pedidos.get(i);
            pedido.mostrarPedido();
        }
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}
