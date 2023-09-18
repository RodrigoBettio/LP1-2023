//Código feito por Lucas Milhomem, Pedro Mafra, Rafael Munõz e Rodrigo Bettio

import java.util.LinkedList;
import java.util.List;

class Investidor {
    private String nome;
    private String cpf;
    private List<Carteira> carteiras = new LinkedList<>();

    public Investidor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Carteira> getCarteiras() {
        return carteiras;
    }

    public void adicionarCarteira(Carteira carteira) {
        carteiras.add(carteira);
    }
}
