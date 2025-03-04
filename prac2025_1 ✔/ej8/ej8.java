// supongamos que al tirar una moneda tengo 50% de probabilidad de que caiga en cada cara
import java.util.Random;

public class ej8{
    
    public static void main(String[] args){
        Random tirarMoneda = new Random();
        int moneda = 0, cara = 0, seca = 0;

        for(int i=0; i<1000; i++){
            moneda = tirarMoneda.nextInt(101);
            if(moneda>50){
                System.out.println("Cara");
                cara++;
            }else{
                System.out.println("Seca");
                seca++;
            }
        }

        System.out.println("Cantidad de Cara: " + cara + "\ncantidad de Seca: " + seca);
    }
}
