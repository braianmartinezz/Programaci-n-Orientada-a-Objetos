import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ej4{

    public static void main(String [] args){
        Random generarNumeroAleatorio = new Random();
        Scanner leerNumero = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int cont = 7, numero = 0;
        boolean band = false;

        int numeroAleatorio = generarNumeroAleatorio.nextInt(101);

        while(cont!=0 && band==false){
            System.out.print("Ingrese un número entero: ");
            numero = leerNumero.nextInt();

            lista.add(numero);

            if(numero<numeroAleatorio){
                System.out.println("El número es más alto, te quedan "+ cont-- +" intentos");
            }else if(numero>numeroAleatorio){
                System.out.println("El número es más bajo, te quedan "+ cont-- + " intentos");
            }else{
                System.out.println("¡ACERTASTE!");
                if(cont>2) System.out.println("Recibiste el título 'Maestro de la Adivinanza'");
                band=true;
            }
        }

        System.out.println("Los números que ingresaste fueron:");
        for (Integer integer : lista) {
            System.out.println(integer);
        }

        leerNumero.close();
    }

}
