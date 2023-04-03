public class Toilette {
    private boolean occupata = false;
    private int numFemmineAttesa = 0;

    public boolean IsOccupata() {
        return this.occupata;
    }

    public synchronized void entra(char sesso) {
        String name = Thread.currentThread().getName();
        if (sesso == 'F')
            numFemmineAttesa++;
        try {
            while (occupata || (sesso == 'M' && numFemmineAttesa > 0)) {
                wait();
            }
            System.out.println(name + " ENTRA in bagno...");
            occupata = true;
        } catch (InterruptedException e) {
        }
    }

    public synchronized void esce(char sesso) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " ESCE dal bagno.");
        if (sesso == 'F')
            numFemmineAttesa--;
        occupata = false;
        notifyAll();
    }

}
