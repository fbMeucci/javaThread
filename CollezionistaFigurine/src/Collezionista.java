import java.util.Random;

public class Collezionista extends Thread {
    private Monitor m;
    private int offerta, richiesta, max;
    Random r = new Random();

    Collezionista(String name, int nfig, Monitor m) {
        super(name);
        this.m = m;
        this.max = nfig;
    }

    public void run() {
        try {
            System.out.println(this.getName() + ": creato!");
            while (true) {
                offerta = r.nextInt(max);
                do {
                    richiesta = r.nextInt(max);
                } while (offerta == richiesta); // così non genero la stessa figurina
                System.out.println(getName() + " vuole scambiare la figurina" +
                        offerta + " con la figurina " + richiesta);
                m.scambio(offerta, richiesta);
                Thread.sleep(250);
            }
        } catch (Exception e) {
        }
    }
}
