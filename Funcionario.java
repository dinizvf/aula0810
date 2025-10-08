package Atividade1;

public class Funcionario {

    private String nome;
    private String matricula;
    private double salario;
    private String telefone;
    private String endereco;
    private String dataNasc;
    
    public Funcionario(String nome, String matricula, double salario, String telefone, String endereco, String dataNasc) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }
public void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Matrícula: " + matricula);
    System.out.println("Salário: " + salario);
    System.out.println("Telefone: " + telefone);
    System.out.println("Endereço: " + endereco);
    System.out.println("Data de Nascimento: " + dataNasc);
}
}