package Teste;

import Dominio.Funcionario.Desenvolvedor;
import Dominio.Funcionario.TipoFuncionario;
import Servico.ExibirInformacoes;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gabriel Vieira Ribeiro", 9000, TipoFuncionario.DESENVOLVEDOR_PLENO);
        ExibirInformacoes.exibirInformacaoFuncionario(desenvolvedor);
    }
}
