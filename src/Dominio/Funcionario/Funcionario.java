package Dominio.Funcionario;

public class Funcionario {
    private String nome;
    private TipoFuncionario tipoFuncionario;

    public Funcionario(String nome, TipoFuncionario tipoFuncionario) {
        this.nome = nome;
        this.tipoFuncionario = tipoFuncionario;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
