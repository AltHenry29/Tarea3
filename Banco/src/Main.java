public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);

        System.out.println("--- Estado Inicial ---");
        cuenta.mostrarInformacion();

        System.out.println("\n--- Realizando Operaciones ---");
        cuenta.depositar(500.0);
        cuenta.retirar(200.0);

        System.out.println("\n--- Estado Final ---");
        cuenta.mostrarInformacion();
    }
}