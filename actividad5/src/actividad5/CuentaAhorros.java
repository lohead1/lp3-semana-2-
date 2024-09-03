package actividad5;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres; 
    private double saldoMinimoMensual;

    public CuentaAhorros(String numeroCuenta, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
        this.saldoMinimoMensual = saldoInicial;
    }

    @Override
    public boolean retirar(double monto) {
        boolean resultado = super.retirar(monto);
        if (resultado && saldo < saldoMinimoMensual) {
            saldoMinimoMensual = saldo;
        }
        return resultado;
    }

    @Override
    public void procesarMes() {
        double interesMensual = (saldoMinimoMensual * (tasaInteres / 100)) / 12;
        saldo += interesMensual;
        saldoMinimoMensual = saldo;
    }
}

