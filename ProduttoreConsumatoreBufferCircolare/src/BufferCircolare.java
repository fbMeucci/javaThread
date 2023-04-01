public class BufferCircolare {
    private int[] buffer;
    private int togli, metti;

    BufferCircolare(int size) {
        buffer = new int[size];
        togli = metti = 0;
    }

    synchronized public void produci(int val) {
        if ((metti + 1) % buffer.length == togli) {
            // Ancora il dato non è stato consumato:
            // aspetta a produrne uno nuovo
            try {
                wait();
            } catch (Exception e) {
            }
        }
        buffer[metti] = val; // Adesso il produttore mette il dato
        metti = (metti + 1) % buffer.length; // sposta il puntatore metti a destra
        System.out.println(Thread.currentThread().getName() + " ha prodotto " + val);
        notify(); // notifica al consumatore che può prelevarlo
    }

    synchronized public int consuma() {
        if (metti == togli) {
            // Ancora il dato non è stato prodotto:
            // aspetta a prelevarlo
            try {
                wait();
            } catch (Exception e) {
            }
        }
        int val = buffer[togli]; // Adesso il produttore mette il dato
        togli = (togli + 1) % buffer.length; // sposta il puntatore togli a destra
        System.out.println(Thread.currentThread().getName() + " ha consumato " + val);
        notify(); // notifica al produttore che può produrne un altro
        return val;
    }
}
