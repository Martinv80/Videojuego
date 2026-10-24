public class Videojuego {

    // Atributos públicos
    public String nombre;
    public String genero;

    // Atributos con acceso por defecto (sin modificador de acceso)
    String version;
    boolean activo;

    // Métodos públicos
    public void mostrarInformacion() {
        System.out.println("Videojuego: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Versión: " + version);
        System.out.println("Estado: " + (activo ? "En ejecución (Activo)" : "Detenido (Inactivo)"));
        System.out.println("------------------------------------");
    }

    public void iniciar() {
        activo = true;
    }

    // Métodos con acceso por defecto
    void cerrar() {
        activo = false;
    }

    void mostrarVersion() {
        System.out.println("Versión de " + nombre + ": " + version);
    }
}