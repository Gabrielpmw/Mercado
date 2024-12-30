package Servico;

import Dominio.Funcionario.Funcionario;
import Dominio.Produto.Celular;
import Dominio.Produto.Notebook;
import Dominio.Produto.Produto;

public class ExibirInformacoes {
    public static void exibirInformacaoProduto(Produto produto){
        System.out.println("Informações sobre o produto");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Desconto ganho: " + produto.getTipoProduto().calcularDescontoProduto(produto.getPreco()));
        System.out.println("Categoria: " + produto.getTipoProduto());
        if (produto instanceof Celular){
            Celular celular = (Celular) produto;
            System.out.println("Modelo: " + celular.getModelo());
        }else if (produto instanceof Notebook){
            Notebook notebook = (Notebook) produto;
            System.out.println("Processador: " + notebook.getProcessador());
        }
    }

    public static void exibirInformacaoFuncionario(Funcionario funcionario){
        System.out.println("Relatorio de funcionario");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getTipoFuncionario().getCargo());
        System.out.println("Função: " + funcionario.getTipoFuncionario().getFuncao());
        System.out.println("Salário: " + funcionario.getTipoFuncionario().getSalario());
        System.out.println("Identificador: " + funcionario.getTipoFuncionario().getId());
    }

}
