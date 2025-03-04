public class Eco{
    public static void main(String[] args){
        int cant=0;
        if(args.length>0){
            for(int i=0; i<args.length; i++){
                System.out.println(args[i]);
                cant++;
            }
        }

        System.out.println("cantidad de parametros ingresados:" + cant);
    }
    
}

