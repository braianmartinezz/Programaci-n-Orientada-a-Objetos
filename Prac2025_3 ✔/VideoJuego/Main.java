import java.time.LocalTime;

class VideoJuego{
    // atributos 
    private int cantidadDeVideoJuegosCreados = 0;
    private static int cantidadDeVideoJuegosCreadosEst = 5;
    private String nombre;
    private LocalTime fechaDeLanzamiento;
    private double precio = 0;

    //constructor
    VideoJuego(int cantidadDeVideoJuegosCreados, String nombre, LocalTime fechaDeLanzamiento, double precio ){
        this.cantidadDeVideoJuegosCreados = cantidadDeVideoJuegosCreados;
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.precio = precio;
    }

    //setters & getters
    void setCantidadDeVideoJuegosCreados(int cantidadDeVideoJuegosCreados){
        this.cantidadDeVideoJuegosCreados = cantidadDeVideoJuegosCreados;
    }

    int getCantidadDeVideoJuegosCreados(){
        return cantidadDeVideoJuegosCreados;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    String getNombre(){
        return nombre;
    }

    void setFechaLanzamiento(LocalTime fechaDeLanzamiento){
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    LocalTime getFechaDeLanzamiento(){
        return fechaDeLanzamiento;
    }

    void setPrecio(int precio){
        this.precio = (double) precio;
    }

    void setPrecio(double precio){
        this.precio = precio;
    }

    void setPrecio(String precio){
        try {
            this.precio = Double.parseDouble(precio);
        } catch (NumberFormatException e) {
            System.out.println("Error: El precio ingresado no es un número válido.");
        }
    }

    double getPrecio(){
        return precio;
    }

    //métodos
    void jugar(){
        System.out.println("Jugando...");
    }

    //método estático
    public static int getCantidadDeVideoJuegosCreadosEst() {
        return cantidadDeVideoJuegosCreadosEst;
    }

    // No se puede modificar un atributo no estático desde un método estático
    /*public static void setNombre(){
        this.nombre = nombre;
    }*/
}

public class Main{
    public static void main(String[] args){
        // Llamar al método estático antes de crear objetos
        System.out.println("Videojuegos creados: " + VideoJuego.getCantidadDeVideoJuegosCreadosEst());
        
        // Creo una instacia de VideoJuego usando el constructor
        LocalTime fechaLanzamiento = LocalTime.of(14, 30); // 14:30 (2:30 PM)
        VideoJuego miVideoJuego = new VideoJuego(1, "mi juego", fechaLanzamiento, 49.99);

        miVideoJuego.jugar();
        System.out.println(miVideoJuego.getNombre());
        miVideoJuego.setPrecio("39.99");
        System.out.println(miVideoJuego.getPrecio());

    }

}