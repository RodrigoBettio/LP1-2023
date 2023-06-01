public class GastoLazer extends Gastos {
    private boolean essencial;

    public GastoLazer (String nome, double valor, boolean essencial){
        super(nome, valor);
        this.essencial = essencial;
    }

    public void mudarValor(double valor){
        super.mudarValor( valor + (valor*0.05));
    }

}