package Dominio.Produto;

public class Celular extends Produto {
    private String modelo;

    public Celular(String nome, double preco, TipoProduto tipoProduto, String modelo) {
        super(nome, preco, tipoProduto);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
