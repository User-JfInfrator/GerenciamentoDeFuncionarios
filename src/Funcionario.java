import javax.management.relation.RelationSupportMBean;

public class Funcionario {

    private String nome;
    private int idade;
    private double salario;
    private String funcao;

    public Funcionario(String nome, int idade, double salario, String funcao){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Idade: %d | Salário: %.2f | Função: %s", nome, idade, salario, funcao);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
