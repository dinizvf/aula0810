package Atividade1;

public class MainPrincipal {
    public static void main(String[] args) {
        Administrador adm = new Administrador("Ana", "A123", 5000.0, "99999-9999", "Rua das Flores", "10/10/1990", 12345);
        Engenheiro eng = new Engenheiro("Lucas", "E456", 8000.0, "98888-8888", "Av. Brasil", "05/06/1985", 67890);
        Medico med = new Medico("Clara", "M789", 10000.0, "97777-7777", "Rua Central", "22/03/1980", 24680);

        System.out.println("=== DADOS DO ADMINISTRADOR ===");
        adm.exibirDados();

        System.out.println("\n=== DADOS DO ENGENHEIRO ===");
        eng.exibirDados();

        System.out.println("\n=== DADOS DO MÉDICO ===");
        med.exibirDados();
    }
}
