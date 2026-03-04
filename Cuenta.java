package gestioncuentas;

public class Cuenta {

    public String titular;
    public double saldo;

    public Cuenta() {
        saldo = 0;
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
