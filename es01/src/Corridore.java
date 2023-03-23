public class Corridore extends Thread {
    private String nome;
    private int metri_percorsi;

    public Corridore(String nome) {
        this.nome = nome;
        this.metri_percorsi = 0;
    }

    public void run() {
        while (metri_percorsi < 1000) {
            metri_percorsi += (int) (Math.random() * 100);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(nome + " arrivato al traguardo");
    }
}
