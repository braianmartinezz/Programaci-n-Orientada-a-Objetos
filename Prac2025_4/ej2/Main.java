
class PruebaIncompleta{

    void texto1(){
        System.out.println("Esta es una");
    }

    void texto2(){
        System.out.println("prueba");
    }

    void texto3(){
        System.out.println("incompleta");
    }

    void texto4(){
        System.out.println("en Java");
    }

    void mensaje(){
        texto1();
        texto2();
        texto3();
        texto4();
    }

}

class Prueba extends PruebaIncompleta{
    @Override
    void texto2(){
        System.out.println("prueba de");
    }

    @Override
    void texto3(){
        System.out.println("redefinición de texto");
    }

    @Override
    void mensaje(){
        texto1();
        texto2();
        texto3();
    }
}

public class Main{
    public static void main(String[] args){
        PruebaIncompleta prueba = new PruebaIncompleta();
        Prueba prueba2 = new Prueba();
        prueba.mensaje();
        System.out.println("");
        prueba2.mensaje();
    }
}