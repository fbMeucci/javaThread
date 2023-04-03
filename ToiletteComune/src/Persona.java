
public class Persona extends Thread {
    private char sesso;
    private Toilette toilette;

    Persona(String nome, char sesso, Toilette toilette) {
        super(nome);
        this.sesso = sesso;
        this.toilette = toilette;
    }

    public char getSesso() {
        return this.sesso;
    }

    @Override
    public void run() {
        long tempoInBagno = (int) (Math.random() * 3000) + 1;
        toilette.entra(getSesso());
        try {
            Thread.sleep(tempoInBagno);
        } catch (InterruptedException e) {
        }
        toilette.esce(getSesso());
    }

}
