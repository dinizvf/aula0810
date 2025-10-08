package AtividadesInterface;

public class Home implements Computador {
    public void ligar() {
        System.out.println("O computador de casa está ligando");
    }

    public void desligar() {
        System.out.println("O computador de casa está desligando");
    }

    public void reniciar() {
        System.out.println("O computador de casa está reiniciando");
    }

    public void carregandoSistema() {
        System.out.println("O computador de casa está carregando o sistema");
    }
}