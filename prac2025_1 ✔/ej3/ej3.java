import java.util.Scanner;

public class ej3 {

    public static long contarVocales(String texto) {
        return texto.toLowerCase().chars()
                    .filter(c -> "aeiou".indexOf(c) != -1)
                    .count();
    }

    private static String obtenerAdjetivoExtra(String nombre) {
        String[] adjetivos = {" Feroz", " Misterioso", " Legendario", " Cósmico", " Fantástico"};
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        
        for (int i = 0; i < vocales.length; i++) {
            char vocal = vocales[i];
            int count = 0;
            for (char c : nombre.toLowerCase().toCharArray()) {
                if (c == vocal) count++;
            }
            if (count > 2) return adjetivos[i];
        }
        return "";
    }
    
    public static void main(String[] args){

        Scanner nombre = new Scanner(System.in);
        System.out.print("Ingrese su nombre: " );
        String nombreUsuario = nombre.nextLine();
        nombreUsuario = nombreUsuario.toLowerCase();
        String resultado = "";

        switch (nombreUsuario.charAt(0)) { // Switch simplificado
            case 'a', 'b', 'c', 'd', 'e' -> resultado = "Mega";
            case 'f', 'g', 'h', 'i', 'j' -> resultado = "Súper";
            case 'k', 'l', 'm', 'n', 'o' -> resultado = "Electro";
            case 'p', 'q', 'r', 's', 't' -> resultado = "Turbo";
            case 'u', 'v', 'w', 'x', 'y', 'z' -> resultado = "Ultra";
        }

        int numVocales = (int) contarVocales(nombreUsuario);

        switch (numVocales) { 
            case 0, 1 -> resultado = resultado.concat(" Destructor");
            case 2, 3 -> resultado = resultado.concat(" Veloz");
            case 4, 5 -> resultado = resultado.concat(" Imparable");
            case 6, 7 -> resultado = resultado.concat(" Indomable");
            default -> resultado = resultado.concat(" Increíble");
        }

        switch (nombreUsuario.length()) { 
            case 3, 4, 5-> resultado = resultado.concat(" Ninja");
            case 6, 7 , 8 -> resultado = resultado.concat(" Titán");
            default -> resultado = resultado.concat(" Guardián");
        }
            
        resultado = resultado.concat(obtenerAdjetivoExtra(nombreUsuario));

        System.out.println(resultado);

        nombre.close();
    }  
}
