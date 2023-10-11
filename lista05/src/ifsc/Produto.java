package ifsc;


public class Produto {
    private String nome;
    private long codBarras;
    private Double preço;
    private String fornecedor;

 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(long codBarras) {
        this.codBarras = codBarras;
    }

    public Double getPreco() {
        return preço;
    }

    public void setPreço(Double preco) {
        this.preço = preco;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}