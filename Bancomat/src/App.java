public class App {
    public static void main(String[] args) throws Exception {
        ContoCorrente c = new ContoCorrente(100);

        Thread t1 = new Thread() {
            public void run() {
                ATM.prelievo(c, 10, "t1");
            }
        };

        Thread t2 = new Thread(() -> {
            ATM.prelievo(c, 110, "t2");
        });

        t1.start();
        t2.start();
    }
}
