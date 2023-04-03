public class Monitor {
    private int[] figurine;
    private int codaRichieste[];

    public Monitor(int numFig) {
        figurine = new int[numFig];
        codaRichieste = new int[numFig];
        for (int i = 0; i < numFig; i++) {
            figurine[i] = 1; // 1 = quantità disponibile di ogni figurina
            codaRichieste[i] = 0;
        }
    }

    synchronized public void scambio(int offerta, int richiesta) throws InterruptedException {
        try {
            figurine[offerta]++;
            if (codaRichieste[offerta] > 0) {
                notifyAll();
            }
            while (figurine[richiesta] == 0) {
                codaRichieste[richiesta]++;
                System.out.println(Thread.currentThread().getName() +
                        ": offerta figurina " + offerta
                        + " in attesa della figurina " + richiesta);
                wait();
                codaRichieste[richiesta]--;
            }
            figurine[richiesta]--;
            System.out.println(Thread.currentThread().getName() +
                    ": scambio terminato: offerta figurina " + offerta +
                    ", ricevuta figurina " + richiesta);
            System.out.println(this);

        } catch (InterruptedException e) {
        }
    }

    public String toString() {
        String nomi = "", val = "";
        for (int i = 0; i < figurine.length; i++) {
            nomi += i + "\t";
            val += figurine[i] + "\t";
        }
        return "Deposito:\n" + nomi + "\n" + val;
    }

}
