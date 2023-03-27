public class ContoCorrente {
    private float saldo;

    public ContoCorrente(float saldo) {
        this.saldo = saldo;
    }

    public void versa(float importo) {
        this.saldo += importo;
    }

    public boolean preleva(float importo) {
        if (this.saldo < importo)
            return false;
        this.saldo -= importo;
        return true;
    }

    public float getSaldo() {
        return this.saldo;
    }
}
