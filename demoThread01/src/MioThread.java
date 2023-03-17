public class MioThread extends Thread {
    private int n; // numero di stampe da effettuare

    public MioThread(int n, String nome) {
        super(nome); // nome del Thread
        this.n = n;
    }

    @Override
    public void run() { // ridefinisce il metodo run già presente nella classe Thread
        // Codice del Thread
        String nome = Thread.currentThread().getName();
        for (int i = 0; i < n; i++) {
            System.out.println(i + " sono " + nome); // Stampa il nome del Thread
            try {
                sleep(800); // aspetta 800 msec
            } catch (InterruptedException e) {
                System.out.println("Errore Thread: " + nome);
            }
        }
        System.out.println("Fine Thread: " + nome);
    }
}
