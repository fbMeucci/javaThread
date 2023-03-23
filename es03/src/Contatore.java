public class Contatore extends Thread {
    private int conta;

    public Contatore(String nome) {
        super(nome);
        conta = 0;
    }

    public void arresta() {
        this.interrupt();
    }

    public int getConta() {
        return conta;
    }

    public void run() {
        while (!this.isInterrupted()) {
            conta++;
        }
        System.out.println(super.getName() + " termina con " + getConta());
    }
}
