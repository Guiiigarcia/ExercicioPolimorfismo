package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutosUsados extends Produtos{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataFabricacao;

    public ProdutosUsados(String nome, Double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaPreco() {
        return nome + " (usado)"+ " R$ "+String.format("%.2f",preco)+ " (Data de fabricação: "+sdf.format(dataFabricacao)+")";
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}
