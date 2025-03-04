import java.time.LocalDate;
import java.time.LocalTime;

public class ej7{
    
    public static void main(String[] args){
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();

        System.out.print("\nFecha actual: " + fechaActual + "\n");
        System.out.print("Hora actual: " + horaActual+ "\n\n");
    }

}
