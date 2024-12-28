package Dominio.Produto;

public class Notebook extends Produto {
    private String processador;

    public Notebook(String nome, double preco, TipoProduto tipoProduto, String processador) {
        super(nome, preco, tipoProduto);
        this.processador = processador;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
