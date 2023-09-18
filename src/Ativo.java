import java.util.LinkedList;
import java.util.List;

class Ativo {
    private String codigo;
    private double precoAtual;
    private List<Ordem> filaOrdens = new LinkedList<>();

    public Ativo(String codigo) {
        this.codigo = codigo;
        this.precoAtual = 0.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(double precoAtual) {
        this.precoAtual = precoAtual;
    }

    public List<Ordem> getFilaOrdens() {
        return filaOrdens;
    }

    public void adicionarOrdem(Ordem ordem) {
        filaOrdens.add(ordem);
    }
}
