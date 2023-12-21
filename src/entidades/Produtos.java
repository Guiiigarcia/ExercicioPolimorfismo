package entidades;

public class Produtos {
    protected String nome;
    protected Double preco;

    public Produtos(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String etiquetaPreco(){
        return nome + " R$ "+String.format("%.2f",preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPrice(Double preco) {
        this.preco = preco;
    }
}
