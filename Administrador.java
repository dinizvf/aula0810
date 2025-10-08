package Atividade1;

public class Administrador extends Funcionario {
    private int cra;

    public Administrador(String nome, String matricula, double salario, String telefone, String endereco, String dataNasc, int cra) {
        super(nome, matricula, salario, telefone, endereco, dataNasc);
        this.cra = cra;
    }

    public int getCra() {
        return cra;
    }

    public void setCra(int cra) {
        this.cra = cra;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CRA: " + cra);
    }
}
