class Animal { 
    String nombre; 
    Animal(String nombre) { 
      this.nombre = nombre; 
    } 
    void hacerSonido() { 
      System.out.println("El animal hace un sonido."); 
    } 
   } 
    
   class Perro extends Animal { 
    Perro(String nombre) { 
      super(nombre); 
    } 
    @Override 
    void hacerSonido() { 
      super.hacerSonido(); 
      System.out.println(nombre + " dice: ¡Guau!"); 
    } 
   } 
    
   class Gato extends Animal { 
    Gato(String nombre) { 
      super(nombre); 
    } 
    @Override 
    void hacerSonido() { 
      System.out.println(nombre + " dice: ¡Miau!"); 
    } 
   } 
    
   class Medusa extends Animal { 
    Medusa(String nombre) { 
      super(nombre); 
    } 
    @Override 
    void hacerSonido() { 
      // la medusa no emite sonidos 
    } 
}

public class EjemploSuper{ 
    public static void main(String[] args){ 
    Animal animalito = new Animal("Raul"); 
    Animal perro = new Perro("Firulais"); 
    Animal gato = new Gato("Misu"); 
    Animal medusa = new Medusa("Lola"); 
    animalito.hacerSonido(); 
    perro.hacerSonido(); // Firulais dice: ¡Guau! 
    gato.hacerSonido();  // Misu dice: ¡Miau! 
    medusa.hacerSonido();  // Lola  no dice nada 
  }
}