package Dominio.Funcionario;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private TipoFuncionario tipoFuncionario;

    public Funcionario(String nome, double salario, TipoFuncionario tipoFuncionario) {
        this.nome = nome;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
