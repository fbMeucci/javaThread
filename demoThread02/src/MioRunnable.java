public class MioRunnable implements Runnable {
    String nome; // nome del Thread
    private int n; // numero di stampe da effettuare

    public MioRunnable(int n, String nome) {
        this.nome = nome;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println(i + " sono " + nome); // Stampa il nome del Thread
            try {
                Thread.sleep(800); // aspetta 800 msec
            } catch (InterruptedException e) {
                System.out.println("Errore Thread: " + nome);
            }
        }
        System.out.println("Fine Thread: " + nome);
    }
}
