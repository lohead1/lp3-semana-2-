package Banco;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;  // tasa de interés anual
    private double saldoMinimoMensual;

    public CuentaAhorros(String numeroCuenta, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
        this.saldoMinimoMensual = saldoInicial;
    }

    
    public boolean retirar(double monto) {
        boolean resultado = super.retirar(monto);
        if (resultado && saldo < saldoMinimoMensual) {
            saldoMinimoMensual = saldo;
        }
        return resultado;
    }

    
    public void procesarMes() {
        double interesMensual = (saldoMinimoMensual * (tasaInteres / 100)) / 12;
        saldo += interesMensual;
        saldoMinimoMensual = saldo;
    }
}