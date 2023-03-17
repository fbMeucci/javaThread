public class App {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new MioRunnable(3, "Paolo"));
        Thread t2 = new Thread(new MioRunnable(4, "Sara"));
        Thread t3 = new Thread(new MioRunnable(5, "Luca"));

        System.out.println("INIZIO MAIN");
        try {
            Thread.sleep(2000); // Aspetta 2 secondi
        } catch (Exception e) {
        }
        System.out.println("Avvio dei Thread");
        // Avvio i thread t1, t2, t3 che vengono eseguiti in parallelo
        t1.start();
        t2.start();
        t3.start();

        // Intanto il main ( Thread principale ) continua la sua esecuzione
        try {
            Thread.sleep(2000); // Aspetta 2 secondi
        } catch (Exception e) {
        }
        // Poi termina
        System.out.println("Sono il main ed ho finito");
    }
}
