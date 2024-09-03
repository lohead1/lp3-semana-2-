import java.util.Scanner;

import Banco.Banco;
import Banco.CuentaAhorros;
import Banco.CuentaBancaria;
import Banco.CuentaCorriente;
public class TestAppBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        CuentaAhorros cuentaAhorros = new CuentaAhorros("001", 1000.0, 1.5);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("002", 2000.0, 3);
        banco.agregarCuenta(new CuentaAhorros("001", 1000.0, 1.5));
        banco.agregarCuenta(new CuentaCorriente("002", 2000.0, 3));

        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú de opciones:");
            System.out.println("D) Depositar");
            System.out.println("R) Retirar");
            System.out.println("C) Consultar");
            System.out.println("S) Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine().toUpperCase();

            switch (opcion) {
                case "D":
                    System.out.print("Ingrese el número de cuenta: ");
                    String numeroCuentaDep = scanner.nextLine();
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDep = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    CuentaBancaria cuentaDep = banco.buscarCuenta(numeroCuentaDep);
                    if (cuentaDep != null) {
                        cuentaDep.depositar(montoDep);
                        System.out.println("Nuevo saldo: " + cuentaDep.getSaldo());
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case "R":
                    System.out.print("Ingrese el número de cuenta: ");
                    String numeroCuentaRet = scanner.nextLine();
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRet = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    CuentaBancaria cuentaRet = banco.buscarCuenta(numeroCuentaRet);
                    if (cuentaRet != null) {
                        if (cuentaRet.retirar(montoRet)) {
                            System.out.println("Retiro exitoso. Nuevo saldo: " + cuentaRet.getSaldo());
                        } else {
                            System.out.println("Fondos insuficientes.");
                        }
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case "C":
                    banco.procesarCuentas();
                    banco.mostrarCuentas();
                    break;

                case "S":
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Gracias por usar el sistema bancario.");
    }
}
