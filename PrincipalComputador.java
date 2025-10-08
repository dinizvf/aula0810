package AtividadesInterface;

public class PrincipalComputador {
	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		Home home = new Home();
		System.out.println("Computador Gamer: ");
		gamer.ligar();
		gamer.desligar();
		gamer.reniciar();
		gamer.carregandoSistema();
		System.out.println("");
		home.ligar();
		home.desligar();
		home.reniciar();
		home.carregandoSistema();
	}
}
