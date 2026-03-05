package gestioncuentas.es.cifpcarlosiii.ed1daw.ut4;

/**
 * Clase para hacr calculos
 * @author Gonzalo Garcia
 * @version 1.0
 */
public class Cuenta {

    public Cuenta(String titular) {
        this.titular = titular;
    }

    private String titular;
    private double saldo;

    public Cuenta() {
        setSaldo(0);
    }

    /**
     * Para mostrar datos
     */
    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    /**
     * Metodo para tener control del dinero que sacas
     * @param cantidad (double) cantidad de dinero
     * @return (boolean) si puede retirar dinero o no
     */
    public boolean retirarConControl(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            return true;
        } else {
            return false;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
