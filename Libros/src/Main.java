public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();

        libro1.autor="Henry";
        libro1.titulo="Software";
        libro1.anioPublicacion=2026;

        libro1.mostrarInformacion();

        Libro libro2 = new Libro();

        libro2.autor="Paul";
        libro2.titulo="Bombero";
        libro2.anioPublicacion=2030;

        libro2.mostrarInformacion();

    }
}
