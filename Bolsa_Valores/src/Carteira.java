import java.util.List;
import java.util.LinkedList;

class Carteira {
    private String numero;
    private Investidor proprietario;
    private List<Ativo> ativos = new LinkedList<>();

    public Carteira(String numero, Investidor proprietario) {
        this.numero = numero;
        this.proprietario = proprietario;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Investidor getProprietario() {
        return proprietario;
    }

    public void setProprietario(Investidor proprietario) {
        this.proprietario = proprietario;
    }

    public List<Ativo> getAtivos() {
        return ativos;
    }

    public void adicionarAtivo(Ativo ativo) {
        ativos.add(ativo);
    }
}
