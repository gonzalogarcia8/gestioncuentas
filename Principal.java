package gestioncuentas;

public class Principal {

    public static void main(String[] args) {

        Cuenta c = new Cuenta();
        c.titular = "Laura Martínez";
        c.saldo = 500;

        CuentaAhorro ca = new CuentaAhorro();
        ca.titular = "Pedro Gómez";
        ca.saldo = 1000;

        CuentaCorriente cc = new CuentaCorriente();
        cc.titular = "Ana López";
        cc.saldo = 800;

        // Operaciones hechas directamente sobre el saldo (mal diseño intencionado)
        c.saldo = c.saldo + 200 - 50;

        ca.saldo = ca.saldo + 300;
        ca.aplicarInteres();

        cc.saldo = cc.saldo - 100;
        cc.aplicarComision();

        System.out.println("---- Cuenta normal ----");
        c.mostrarDatos();

        System.out.println("---- Cuenta ahorro ----");
        ca.mostrarDatos();

        System.out.println("---- Cuenta corriente ----");
        cc.mostrarDatos();
    }
}