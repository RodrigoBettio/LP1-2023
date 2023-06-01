public class Gastos{
    private String nome;
    private double valor;

    public Gastos(String nome, double valorInicio){
        this.valor = valorInicio;
        this.nome = nome;
        
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    
    public void mudarValor(double valorFinal){
        this.valor = valorFinal;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
            this.nome = nome;
        }
    }


