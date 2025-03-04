import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {
        Scanner registrarTemp = new Scanner(System.in);

        System.out.print("Ingrese temperatura con su magnitud correspondiente (ej. '25 C'): ");
        String temp = registrarTemp.nextLine().trim(); // Eliminar espacios al inicio y final

        // Separar el valor de la escala
        String[] partes = temp.split("\\s+"); // Usar \\s+ para manejar uno o más espacios
        if (partes.length < 2) {
            System.out.println("Formato no válido. Debe ingresar algo como '25 C'.");
            registrarTemp.close();
            return;
        }

        double valor;
        try {
            valor = Double.parseDouble(partes[0]);
        } catch (NumberFormatException e) {
            System.out.println("El valor de la temperatura no es un número válido.");
            registrarTemp.close();
            return;
        }

        String escala = partes[1].toUpperCase();

        double celsius = 0, fahrenheit = 0, kelvin = 0;

        switch (escala) {
            case "C":
                celsius = valor;
                break;
            case "F":
                celsius = (valor - 32) * 5 / 9;
                break;
            case "K":
                celsius = valor - 273.15;
                break;
            default:
                System.out.println("Escala no válida. Use 'C', 'F' o 'K'.");
                registrarTemp.close();
                return; // Salir del programa si la escala no es válida
        }

        // Convertir a Fahrenheit y Kelvin
        fahrenheit = celsius * 9 / 5 + 32;
        kelvin = celsius + 273.15;

        // Imprimir el resultado
        System.out.printf("%.2f °F, %.2f K, %.2f °C%n", fahrenheit, kelvin, celsius);

        registrarTemp.close();
    }
}