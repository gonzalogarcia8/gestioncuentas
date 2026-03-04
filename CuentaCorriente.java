package gestioncuentas;

public class CuentaCorriente extends Cuenta {

    public double comision;

    public CuentaCorriente() {
        comision = 2.0;
    }

    public void aplicarComision() {
        saldo = saldo - comision;
    }
}