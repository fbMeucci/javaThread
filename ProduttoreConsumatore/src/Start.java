public class Start {
    public static void main(String[] args) throws Exception {
        Risorsa r = new Risorsa();
        ProduttoreBuffer p = new ProduttoreBuffer("Prod1", r);
        ConsumatoreBuffer c = new ConsumatoreBuffer("Cons1", r);

        p.start();
        c.start();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        c.arresta();
        p.arresta();

        System.out.println("THread MAIN FINE");
    }
}
