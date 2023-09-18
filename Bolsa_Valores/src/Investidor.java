import java.util.*;
import java.util.LinkedList;

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

    public List<Ativo> getComposicaoCarteira() {
        List<Ativo> composicao = new LinkedList<>();
        for (Carteira carteira : carteiras) {
            composicao.addAll(carteira.getAtivos());
        }
        return composicao;
    }
}
