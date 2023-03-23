public class App {
    public static void main(String[] args) throws Exception {
        String nomi[] = { "Luca", "Giorgio", "Mirko" };
        System.out.println("Parte la gara...");
        for (String nome : nomi) {
            Corridore c = new Corridore(nome);
            c.start();
        }
    }
}
