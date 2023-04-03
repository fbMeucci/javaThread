import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Toilette t = new Toilette();
        List<Persona> codaPersone = new ArrayList<>();
        codaPersone.add(new Persona("Erika", 'F', t));
        codaPersone.add(new Persona("Paolo", 'M', t));
        codaPersone.add(new Persona("Giorgio", 'M', t));
        codaPersone.add(new Persona("Sara", 'F', t));
        codaPersone.add(new Persona("Alice", 'F', t));
        codaPersone.add(new Persona("Giovanna", 'F', t));

        for (Persona p : codaPersone) {
            p.start();
        }

    }
}
