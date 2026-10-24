public class Main {
    public static void main(String[] args) {

        // 1. Crear el primer videojuego
        Videojuego juego1 = new Videojuego();
        juego1.nombre = "The Legend of Zelda";
        juego1.genero = "Aventura / RPG";
        juego1.version = "1.3.0";
        juego1.activo = false;

        // 2. Crear el segundo videojuego
        Videojuego juego2 = new Videojuego();
        juego2.nombre = "Minecraft";
        juego2.genero = "Sandbox / Supervivencia";
        juego2.version = "1.20.4";
        juego2.activo = false;

        // 3. Crear el tercer videojuego
        Videojuego juego3 = new Videojuego();
        juego3.nombre = "Elden Ring";
        juego3.genero = "Acción / Soulslike";
        juego3.version = "1.10.1";
        juego3.activo = false;

        // Iniciar únicamente el segundo juego
        juego2.iniciar();

        // Mostrar la información de cada uno para comprobar la independencia de sus valores
        System.out.println("=== INFORMACIÓN DE LOS VIDEOJUEGOS ===");
        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();

        // Probar el método de acceso por defecto para mostrar versión
        System.out.println("=== CONSULTA DE VERSIONES ===");
        juego1.mostrarVersion();
        juego2.mostrarVersion();
        juego3.mostrarVersion();
    }
}