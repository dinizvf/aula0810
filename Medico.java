package Atividade1;

public class Medico extends Funcionario {
    private int crm;

    public Medico(String nome, String matricula, double salario, String telefone, String endereco, String dataNasc, int crm) {
        super(nome, matricula, salario, telefone, endereco, dataNasc);
        this.crm = crm;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CRM: " + crm);
    }
}
