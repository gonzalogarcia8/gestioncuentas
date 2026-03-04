package gestioncuentas;

public class CuentaAhorro extends Cuenta {

    public double interes;

    public CuentaAhorro() {
        interes = 1.5;
    }

    public void aplicarInteres() {
        saldo = saldo + (saldo * interes / 100);
    }
}