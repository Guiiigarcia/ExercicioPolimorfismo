package entidades;

public class ProdutosImportados extends Produtos {
    private Double taxasAdicionais;

    public ProdutosImportados(String nome, Double preco, Double taxasAdicionais) {
        super(nome, preco);
        this.taxasAdicionais = taxasAdicionais;
    }

    @Override
    public String etiquetaPreco() {
        return nome + " R$ "+String.format("%.2f",precoTotal())+" (Taxas Adicionais: "+String.format("%.2f",taxasAdicionais)+")";
    }

    public Double precoTotal(){
        return preco + taxasAdicionais;
    }

    public Double getTaxasAdicionais() {
        return taxasAdicionais;
    }

    public void setTaxasAdicionais(Double taxasAdicionais) {
        this.taxasAdicionais = taxasAdicionais;
    }
}
