package Teste;

import Dominio.Produto.Celular;
import Dominio.Produto.TipoProduto;
import Servico.ExibirInformacoes;

public class ProdutoTeste {
    public static void main(String[] args) {
        Celular celular = new Celular("Celular", 1500, TipoProduto.ELETRONICO, "Redmi note 12S");
        ExibirInformacoes.exibirInformacaoProduto(celular);
    }
}
