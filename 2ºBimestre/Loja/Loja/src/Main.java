public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja("Centaurus");

        System.out.println("-----------------------------");
        System.out.println("Bem vindo à " + loja.getNomeLoja());
        System.out.println("-----------------------------\n");

        Cliente cliente1 = new Cliente("Rodrigo", "39973705831", "989999518");
        Cliente cliente2 = new Cliente("Breno", "37584927463", "927773846");
        Cliente cliente3 = new Cliente("Derick", "38492754637", "936547354");

        Pedido pedido1 = new Pedido(cliente1, "Celular", 1300.0, 0011);
        Pedido pedido2 = new Pedido(cliente2, "Jaqueta", 110.0, 0010);
        Pedido pedido3 = new Pedido(cliente3, "Bola", 149.90, 0001);

        loja.addCliente(cliente1);
        loja.addCliente(cliente2);
        loja.addCliente(cliente3);

        loja.addPedido(pedido1);
        loja.addPedido(pedido2);

        loja.listaClientes();
    }
}
