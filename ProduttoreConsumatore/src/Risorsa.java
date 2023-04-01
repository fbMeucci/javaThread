public class Risorsa {
    private int val;
    private boolean disponibile = false;

    public synchronized int consuma() {
        while (!disponibile) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        disponibile = false;
        notify();
        return val;
    }

    public synchronized void produci(int val) {
        while (disponibile) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.val = val;
        disponibile = true;
        notify();
    }

}
