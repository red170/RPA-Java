package Operaciones;

public class ClaseMath {
    public static void main(String[] args){
        System.out.println(
                Math.abs(-15) //Devolver el Valor Absoluto de un Numero
        );
        System.out.println(
                Math.ceil(11.000001) //Aproxima al Numero Entero Proximo
        );
        System.out.println(
                Math.floor(11.999) //Aproxima al Numero Entero Anterior
        );
        System.out.println(
                Math.max(12,95) //Devuelve el Numero Mayor
        );
        System.out.println(
                Math.min(85,25) //Devuelve el Numero Menor
        );
        System.out.println(
                Math.round(15.5) //Redondea al Numero mas Cercano
        );


        //Numero Aleatorio entre 0-1
        double random = Math.random();
        System.out.println(random);

        //Numero Aleatorio entre 0-1 (con decimales)
        double random1= Math.random();
        System.out.println(random1*100);

        //Numero Aleatorio entre 0-1 (con decimales)
        double random2 = Math.random();
        System.out.println((int)(random2 *100));
    }
}
