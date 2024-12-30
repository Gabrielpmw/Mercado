package Dominio.Funcionario;

public enum TipoFuncionario {
    DESENVOLVEDOR_SENIOR("Desenvolvedor sênior", "Desenvolver software", 7000, 1),
    DESENVOLVEDOR_PLENO("Desenvolvedor pleno", "Desenvolver software", 5000, 2),
    DESENVOLVEDOR_JUNIOR("Desenvolvedor junior", "Desenvolver software", 1500, 3),
    QA("Q.A", "Testar software", 3000, 4),
    ANALISTA_DADOS("Analista de dados", "Analisar dados", 6000, 5);

    private String cargo;
    private String funcao;
    private double salario;
    private int id;
    TipoFuncionario(String cargo, String funcao, double salario, int id) {
        this.cargo = cargo;
        this.funcao = funcao;
        this.salario = salario;
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }
}
