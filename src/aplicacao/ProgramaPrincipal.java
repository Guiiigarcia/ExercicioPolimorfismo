package aplicacao;

import entidades.Produtos;
import entidades.ProdutosImportados;
import entidades.ProdutosUsados;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List <Produtos> lista = new ArrayList<>();

        System.out.println("Entre com os números do produto: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Produto: #" + (i + 1));
            System.out.print("Comum, usado ou importado? (C/U/I)");
            char p = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preco: ");
            double preco = sc.nextDouble();

            if (p == 'I'){
                System.out.print("Taxas adicionais: ");
                double taxas = sc.nextDouble();
                Produtos produtos = new ProdutosImportados(nome,preco,taxas);
                lista.add(produtos);
            }else if(p == 'U'){
                System.out.print("Data de fabricação: (00/00/0000): ");
                Date data = sdf.parse(sc.next());
                Produtos produtos = new ProdutosUsados(nome,preco,data);
                lista.add(produtos);
            }else {
                Produtos produtos = new Produtos(nome,preco);
                lista.add(produtos);
            }
        }

        System.out.println();
        System.out.println("Etiqueta de preços: ");

        for (Produtos c: lista){
            System.out.println(c.etiquetaPreco());
        }

        sc.close();
    }
}
