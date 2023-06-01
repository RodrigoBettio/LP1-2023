public class Pedido {
    private Cliente cliente;
    private String produto;
    private int codigo;
    private double valor;

    public Pedido(Cliente cliente, String produto, double valor, int codigo) {
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
        this.codigo = codigo;
    }

    public void mostrarPedido() {
        System.out.println("- Pedido -");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto);
        System.out.println("Valor: " + valor);
        System.out.println("Código: " + codigo);
        System.out.println();
    }
}
