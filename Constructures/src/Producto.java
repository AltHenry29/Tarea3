public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {
        this.nombre = "Sin nombre";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 10.0; // Precio fijo
        this.cantidad = 1;  // Cantidad fija
    }

    void mostrarDatos(){
        System.out.println("\nNombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("================\n");
    }

}
