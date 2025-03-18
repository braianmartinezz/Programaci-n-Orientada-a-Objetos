import java.time.LocalTime;

class VideoJuego{
    // atributos 
    private int cantidadDeVideoJuegosCreados = 0;
    private String nombre;
    private LocalTime fechaDeLanzamiento;
    private double precio = 0;

    //constructor
    VideoJuego(int cantidadDeVideoJuegosCreados, String nombre, LocalTime fechaDeLanzamiento, double precio){
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
}

class Categoria extends VideoJuego{
    // Cuando una clase hereda de otra (Categoria hereda de VideoJuego), debe inicializar los atributos de la superclase
    public Categoria(int cantidadDeVideoJuegosCreados, String nombre, LocalTime fechaDeLanzamiento, double precio){
        super(cantidadDeVideoJuegosCreados, nombre, fechaDeLanzamiento, precio);
    }

    private String nombre;
    private String descripcion;

    @Override
    void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    String getNombre(){
        return nombre;
    }

    void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    String getDescripcion(){
        return descripcion;
    }
}

public class Main{
    public static void main(String[] args){
        LocalTime fechaLanzamiento = LocalTime.of(14, 30); // 14:30 (2:30 PM)
        VideoJuego miJuego = new VideoJuego(1, "mi juego", fechaLanzamiento, 49.99);
        Categoria categoria = new Categoria(1, "mi juego", fechaLanzamiento, 49.99);

        System.out.println(miJuego.getNombre());
        System.out.println(categoria.getNombre());
        categoria.setNombre("mi juego modificado");
        System.out.println(categoria.getNombre());
    }
}
