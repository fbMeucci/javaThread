public class App {
    public static void main(String[] args) throws Exception {
        // Ogni programma Java possiede almeno un Thread: il Thread main
        System.out.println("Sono il main");
        System.out.println("Il mio Thread e': " + Thread.currentThread());
    }
}
