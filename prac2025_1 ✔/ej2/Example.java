import java.util.Scanner; 

public class Example {
     
   public static void main(String[] args) { 
       Scanner comando = new Scanner(System.in); 
       System.out.println("Ingresar comando: "); 
       boolean running = true; 
       while(running){ 
           switch(comando.nextLine()){ 
               case "empezar": 
                   System.out.println("¡Empezado!"); 
                   break; 
               case "salir": 
                   System.out.println("¡Adios!"); 
                   running = false; 
                   break; 
               default: 
                   System.out.println("Comando invalido"); 
                   break; 
           } 
       } 
       comando.close(); 
   } 
} 

/*
La clase java.util.Scanner es una de las clases más utilizadas en Java para leer la entrada del usuario
 desde diferentes fuentes, como la consola, archivos o cadenas de texto

 ¿Qué es java.util.Scanner?
 Proposito: leer y analizar datos de entrada
 Fuentes de entrada: puede leer hasta
    * La consola (System.in)
    * Archivos
    * Cadenas de texto (String)
 Funcionalidad: Proporciona métodos para leer diferentes tipos de datos (números, palabras, líneas completas, etc.)

 Características Principales
Fácil de usar: Proporciona métodos simples para leer datos.
Flexible: Puede leer desde múltiples fuentes.
Tokenización: Divide la entrada en "tokens" (palabras o valores separados por espacios o delimitadores personalizados).
Conversión automática: Convierte la entrada en tipos de datos específicos (por ejemplo, int, double, String, etc.).
*/