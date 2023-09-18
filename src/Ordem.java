class Ordem {
    private String tipo;
    private int quantidade;
    private double preco;
    private Investidor investidor;
    private Ativo ativo;
    private Corretora corretora;

    public Ordem(String tipo, int quantidade, double preco, Investidor investidor, Ativo ativo, Corretora corretora) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.preco = preco;
        this.investidor = investidor;
        this.ativo = ativo;
        this.corretora = corretora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public Ativo getAtivo() {
        return ativo;
    }

    public void setAtivo(Ativo ativo) {
        this.ativo = ativo;
    }

    public Corretora getCorretora() {
        return corretora;
    }

    public void setCorretora(Corretora corretora) {
        this.corretora = corretora;
    }
}
