package AtividadesInterface;

public class PrincipalSalarios {
    public static void main(String[] args) {
        Funcionario jornada = new Jornada(1, "João", "12345", 1001, "Rua A", 20.5, 40);
        Funcionario horista = new Horista(2, "Maria", "67890", 1002, "Rua B", 18.0, 35);
        Funcionario pessoaJuridica = new PessoaJuridica(3, "Carlos", "11223", 1003, "Rua C", 5000.0, 800.0);

        jornada.calculaSalario();
        horista.calculaSalario();
        pessoaJuridica.calculaSalario();
    }
}