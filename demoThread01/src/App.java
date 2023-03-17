public class App {
    public static void main(String[] args) throws Exception {
        // Creo i thread t1, t2, t3
        MioThread t1 = new MioThread(3, "Paolo");
        MioThread t2 = new MioThread(4, "Sara");
        MioThread t3 = new MioThread(5, "Luca");

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
