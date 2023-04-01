
public class Persona extends Thread {
    private char sesso;
    private Toilette toilette;

    Persona(String nome, char sesso, Toilette toilette) {
        super(nome);
        this.sesso = sesso;
        this.toilette = toilette;
        if (sesso == 'F') {
            this.setPriority(Thread.MAX_PRIORITY);
        } else {
            this.setPriority(Thread.MIN_PRIORITY);
        }
    }

    public char getSesso() {
        return this.sesso;
    }

    @Override
    public void run() {
        long tempoInBagno = (int) (Math.random() * 5000) + 1;
        toilette.entra();
        System.out.println(super.getName() + " ENTRA in bagno..." + this.getPriority());
        try {
            Thread.sleep(tempoInBagno);
        } catch (InterruptedException e) {
        }
        System.out.println(super.getName() + " ESCE dal bagno");
        toilette.esce();
    }

}
