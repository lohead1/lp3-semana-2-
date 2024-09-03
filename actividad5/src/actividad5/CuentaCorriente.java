package actividad5;

public class CuentaCorriente extends CuentaBancaria {
    private int retirosGratis;
    private int retirosActuales;
    private static final double TARIFA_RETIRO_EXTRA = 3.0;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, int retirosGratis) {
        super(numeroCuenta, saldoInicial);
        this.retirosGratis = retirosGratis;
        this.retirosActuales = 0;
    }

    @Override
    public boolean retirar(double monto) {
        if (super.retirar(monto)) {
            retirosActuales++;
            if (retirosActuales > retirosGratis) {
                saldo -= TARIFA_RETIRO_EXTRA;
            }
            return true;
        }
        return false;
    }

    @Override
    public void procesarMes() {
        retirosActuales = 0;
    }
}
