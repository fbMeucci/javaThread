public class App {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 5; i > 0; i--) {
                    System.out.println(getName() + " -> " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
                System.out.println("Thread t1 terminato");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() + " -> " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
                System.out.println("Thread t2 terminato");
            }
        };
        System.out.println("Thread MAIN ha finito. Ora lancio i dur thread");
        t1.start();
        t2.start();
    }
}
