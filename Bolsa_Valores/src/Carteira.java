//Código feito por Lucas Milhomem, Pedro Mafra, Rafael Munõz e Rodrigo Bettio

import java.util.LinkedList;
import java.util.List;

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
