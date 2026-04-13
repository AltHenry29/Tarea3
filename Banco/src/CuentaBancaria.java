public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String nombreTitular, double saldoInicial) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular + " | Saldo: $" + saldo);
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de $" + monto + " exitoso.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " exitoso.");
        } else {
            System.out.println("Saldo insuficiente para retirar $" + monto);
        }
    }
}
