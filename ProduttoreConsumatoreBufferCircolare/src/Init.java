public class Init {
    public static void main(String[] args) throws Exception {
        BufferCircolare bc = new BufferCircolare(10);
        ProduttoreBuffer p1 = new ProduttoreBuffer("Prod 1", bc);
        ConsumatoreBuffer c1 = new ConsumatoreBuffer("  Cons 1", bc);
        // Avvio dei thread
        p1.start();
        c1.start();
        // Aspetto 3 secondi poi li arresto
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        c1.arresta();
        p1.arresta();
    }
}
