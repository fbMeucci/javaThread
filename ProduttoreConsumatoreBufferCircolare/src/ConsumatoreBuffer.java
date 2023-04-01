public class ConsumatoreBuffer extends Thread {
    private BufferCircolare bc;
    private boolean running = true;

    ConsumatoreBuffer(String nome, BufferCircolare bc) {
        super(nome);
        this.bc = bc;
    }

    public void arresta() {
        running = false;
    }

    public void run() {
        while (running) {
            bc.consuma();
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
    }
}
