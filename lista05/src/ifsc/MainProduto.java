package ifsc;

import java.util.ArrayList;

public class MainProduto {
	
    public static void main(String[] args) {
    	
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto();
        
        produto1.setFornecedor("Americanas");
        produto1.setNome("Bala Fini");
        produto1.setPreço(5.99);
        produto1.setCodBarras(652345787l);
        
        Produto produto2 = new Produto();
        
        produto2.setFornecedor("Archer");
        produto2.setNome("unha");
        produto2.setPreço(30.00);
        produto2.setCodBarras(446557382l);

        Produto produto3 = new Produto();
        
        produto3.setFornecedor("renner");
        produto3.setNome("saia");
        produto3.setPreço(100.00);
        produto3.setCodBarras(378747487l);
        
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        
        for (Produto produto:listaProdutos){
        	
        	System.out.println("Fornecedor: "+produto.getFornecedor());
        	System.out.println("O Nome do produto é: "+produto.getNome());
        	System.out.println("Cod de Barras: "+produto.getCodBarras());
        	System.out.println("O preço é: R$"+produto.getPreco());
        	System.out.println();
        }
    }
}
