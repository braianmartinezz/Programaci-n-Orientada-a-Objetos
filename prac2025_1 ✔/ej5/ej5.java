import java.util.Scanner;

public class ej5 {

    public static long contarVocales(String texto) {
        return texto.toLowerCase().chars()
                    .filter(c -> "aeiou".indexOf(c) != -1)
                    .count();
    }

    private static String vocalRepetida(String nombre) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        char vocalMasRepetida = ' ';
        int maxRepeticiones = 0;
        
        nombre = nombre.replaceAll("\\s+", ""); // Eliminar espacios
        
        for (char vocal : vocales) {
            int count = 0;
            for (char c : nombre.toLowerCase().toCharArray()) {
                if (c == vocal) count++;
            }
            if (count > maxRepeticiones) {
                maxRepeticiones = count;
                vocalMasRepetida = vocal;
            }
        }
        return maxRepeticiones > 1 ? String.valueOf(vocalMasRepetida) : "";
    }

    private static int contarEspacios(String texto) {
        int count = 0;
        for (char c : texto.toCharArray()) {
            if (c == ' ') count++;
        }
        return count;
    }

    private static int contarNumeros(String texto) {
        int count = 0;
        for (char c : texto.toCharArray()) {
            if (Character.isDigit(c)) count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner recibirFrase = new Scanner(System.in);

        System.out.print("Introduzca una frase: ");
        String frase = recibirFrase.nextLine();

        System.out.print("\nFrase: " + frase + "\n\n");

        String[] palabras = frase.split("\\s+"); // \\s+ es una expresión regular que captura uno o más espacios
        int cantPalabras = palabras.length;
        System.out.print("Cantidad de palabras: " + cantPalabras + "\n\n");

        int numVocales = (int) contarVocales(frase);
        System.out.print("Cantidad de vocales: " + numVocales + "\n\n");

        System.out.print("Vocal con más frecuencia: " + vocalRepetida(frase) + "\n\n");
        System.out.print("Cantidad de espacios en blanco: " + contarEspacios(frase) + "\n\n");
        System.out.print("Cantidad de caracteres numéricos: " + contarNumeros(frase));

        
        recibirFrase.close();
    }

}
