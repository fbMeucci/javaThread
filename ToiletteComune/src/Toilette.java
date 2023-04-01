public class Toilette {
    private boolean occupata = false;

    public boolean IsOccupata() {
        return this.occupata;
    }

    public synchronized void entra() {
        while (occupata) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        occupata = true;
    }

    public synchronized void esce() {
        notifyAll();
        occupata = false;
    }

}
