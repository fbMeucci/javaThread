public class App {
    public static void main(String[] args) throws Exception {
        // Se un Thread CRASHA, gli altri continuano a funzionare !!
        // Lancio "al volo" un thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i + " :) Ciao dal thread t1");
                    try {
                        Thread.sleep(1000); // aspetta 1 sec
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("Fine Thread t1");
            }
        });
        t1.start(); // AVVIO DEL THREAD t1
        System.out.println("INIZIO MAIN");
        try {
            Thread.sleep(2000); // Aspetta 2 secondi
        } catch (Exception e) {
        }
        System.out.println("OOPS il Thread Main CRASHA");
        System.out.println(5 / 0);
    }
}
