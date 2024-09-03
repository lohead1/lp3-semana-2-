package Banco;


import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public CuentaBancaria buscarCuenta(String numeroCuenta) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
    }

    public void procesarCuentas() {
        for (CuentaBancaria cuenta : cuentas) {
            cuenta.procesarMes();
        }
    }

    public void mostrarCuentas() {
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println("Cuenta: " + cuenta.getNumeroCuenta() + " | Saldo: " + cuenta.getSaldo());
        }
    }
}