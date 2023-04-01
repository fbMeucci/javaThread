public class ATM {

    public static synchronized void prelievo(ContoCorrente c, float importo, String tName) {
        System.out.println(tName + " tenta di prelevare..." + importo + " euro");
        if (c.preleva(importo)) {
            System.out.println(tName + " preleva " + importo + " euro");
        } else {
            System.out.println(tName + ": Transazione negata: saldo insufficiente");
        }
        System.out.println("Saldo attuale: " + c.getSaldo());
    }
}
