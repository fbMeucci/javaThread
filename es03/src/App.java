public class App {
    public static void main(String[] args) throws Exception {
        Contatore c1 = new Contatore("c1");
        Contatore c2 = new Contatore("c2");
        c1.start();
        c2.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        c1.arresta();
        c2.arresta();
    }
}
