package cuentas;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta(3);
    }

    public static void operativa_cuenta(float cantidad) {

        CCuenta cuenta1;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        System.out.println("El saldo actual es " + cuenta1.getSaldo());

        try {
            System.out.println("Retirar " + cantidad + " de cuenta");
            cuenta1.retirar(cantidad);
            System.out.println("Saldo actual: " + cuenta1.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingresar " + cantidad + " en cuenta");
            cuenta1.ingresar(cantidad);
            System.out.println("Saldo actual: " + cuenta1.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}


