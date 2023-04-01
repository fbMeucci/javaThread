public class ProduttoreBuffer extends Thread {
    private BufferCircolare bc;
    private boolean running = true;

    ProduttoreBuffer(String nome, BufferCircolare bc) {
        super(nome);
        this.bc = bc;
    }

    public void arresta() {
        running = false;
    }

    public void run() {
        while (running) {
            // genera intero fra 1 e 100
            int val = (int) (Math.random() * 100) + 1;
            bc.produci(val);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
    }
}
