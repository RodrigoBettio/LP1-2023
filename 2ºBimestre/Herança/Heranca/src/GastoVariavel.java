public class GastoVariavel extends Gastos {
    private int tempoMeses;

    public GastoVariavel(String nome, double valor, int tempoMeses){
        super(nome,valor);
        this.tempoMeses = tempoMeses;

    }

    public int getTempoMeses(){
        return tempoMeses;
    }

    public void setTempoMeses (int tempoMeses){
        this.tempoMeses = tempoMeses;
    }
    
}
