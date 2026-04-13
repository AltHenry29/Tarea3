public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Laptop", 1200.50, 5);
        Producto p2 = new Producto();
        Producto p3 = new Producto("Mousepad");

        System.out.print("Objeto 1: ");
        p1.mostrarDatos();
        System.out.print("Objeto 2: ");
        p2.mostrarDatos();
        System.out.print("Objeto 3: ");
        p3.mostrarDatos();

    }
}
