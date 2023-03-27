public class ATM {

    public static synchronized void prelievo(ContoCorrente c, float importo, String tName) {
        System.out.println(tName + " tenta di prelevare...");
        if (c.preleva(importo)) {
            System.out.println(importo + " euro correttamente prelevati");
        } else {
            System.out.println("Transazione negata: saldo insufficiente");
        }
        System.out.println("Saldo attuale: " + c.getSaldo());
    }

}
