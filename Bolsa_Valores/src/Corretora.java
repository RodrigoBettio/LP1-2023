import java.util.Queue;
import java.util.LinkedList;

class Corretora {
    private String nome;
    private Queue<Ordem> filaOrdens = new LinkedList<>();

    public Corretora(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Queue<Ordem> getFilaOrdens() {
        return filaOrdens;
    }

    public void adicionarOrdem(Ordem ordem) {
        filaOrdens.add(ordem);
    }

    public Ordem processarOrdem() {
        return filaOrdens.poll();
    }
}
