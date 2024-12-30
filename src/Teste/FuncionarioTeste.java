package Teste;

import Dominio.Funcionario.Funcionario;
import Dominio.Funcionario.TipoFuncionario;
import Servico.ExibirInformacoes;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gabriel Vieira Ribeiro", TipoFuncionario.DESENVOLVEDOR_PLENO);
        ExibirInformacoes.exibirInformacaoFuncionario(funcionario);
    }
}
