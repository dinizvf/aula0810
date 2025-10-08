package Atividade1;

public class Engenheiro extends Funcionario {
    private int numCrea;

    public Engenheiro(String nome, String matricula, double salario, String telefone, String endereco, String dataNasc, int numCrea) {
        super(nome, matricula, salario, telefone, endereco, dataNasc);
        this.numCrea = numCrea;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();    
        System.out.println("CREA: " + numCrea);
    }
}
