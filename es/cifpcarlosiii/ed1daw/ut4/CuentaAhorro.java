package gestioncuentas.es.cifpcarlosiii.ed1daw.ut4;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(String titular, double interes) {
        super(titular);
        this.interes = interes;
    }

    public double interes;

    public CuentaAhorro() {
        interes = 1.5;
    }

    public void aplicarInteres() {
        setSaldo(getSaldo() + (getSaldo() * interes / 100));
    }
}