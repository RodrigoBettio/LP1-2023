public class Main {
    public static void main(String[] args) {
        GastoFixo conta1 = new GastoFixo("Conta de água", 90.00);
        GastoFixo conta2 = new GastoFixo("Conta luz", 210.00);
        GastoFixo conta3 = new GastoFixo("Conta net", 80.00);
        GastoFixo conta4 = new GastoFixo("Aluguel", 1900.00);

        GastoLazer conta5 = new GastoLazer("Cinema", 20.00, false);
        GastoLazer conta6 = new GastoLazer("Parque", 40.00, false);
        GastoLazer conta7 = new GastoLazer("Teatro", 50.00, false);

        GastoVariavel conta8 = new GastoVariavel("VideoGame", 2800, 6);
        GastoVariavel conta9 = new GastoVariavel("Celular", 1300, 10);

        System.out.println("Conta fixa:");
        System.out.println(conta1.getNome());
        System.out.print("Valor da conta: R$" + conta1.getValor());
        System.out.println("\n");

        System.out.println(conta2.getNome());
        System.out.print("Valor da conta: R$" + conta2.getValor());
        System.out.println("\n");

        System.out.println(conta3.getNome());
        System.out.print("Valor da conta: R$" + conta3.getValor());
        System.out.println("\n");

        System.out.println(conta4.getNome());
        System.out.print("Valor da conta: R$" + conta4.getValor());
        System.out.println("\n");
        

        System.out.println("Gasto com Lazer:");
        System.out.print("Valor inicial do cinema: R$");
        System.out.println(conta5.getValor());
        conta5.mudarValor(28.00);
        System.out.print("Valor reajustado do cinema: R$");
        System.out.println(conta5.getValor());
        System.out.println("");

        System.out.print("Valor inicial do parque: R$");
        System.out.println(conta6.getValor());
        conta6.mudarValor(60);
        System.out.print("Valor reajustado do parque: R$");
        System.out.println(conta6.getValor());
        System.out.println("");

        System.out.print("Valor inicial do teatro: R$");
        System.out.println(conta7.getValor());
        conta7.mudarValor(80);
        System.out.print("Valor reajustado do teatro: R$");
        System.out.println(conta7.getValor());
        System.out.println("");

        System.out.println("Contas variáveis:");
        System.out.println(conta8.getNome());
        System.out.println("Valor da conta: R$" + conta8.getValor());
        System.out.println("Quantidade de Parcelas: " + conta8.getTempoMeses());
    }
}
