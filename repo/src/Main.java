//JAVA es un lenguaje orientado a Objetos por lo tanto la progrmamcion se basa en programar clases y objeto y dentro del archivo empezamos la programacion con una clase publica sobre la cual es la que iremos escribiendo el codigo


public class Main {

    //HOLA MUNDO
    public static void main1(String[] args){
        System.out.println("Hola Ernesto");
    }

    //VARIABLES PRIMITIVAS
    public static void main2(String[] args){

        //Numeros Enteros
        byte numeroPequeno = 18; //Tamaño de 8 Bits (numeros desde -128 hasta 128)
        short numeroMediano = 100; //Tamaño de 16 Bits (numeros desde -32767 hasta 32767)
        int numeroGrande = 1000; //Tamaño de 32 Bits (numeros desde -2147483647 hasta 2147483647)
        long numeroMuyGrande = 10000; //Tamaño de 64 Bits (numeros desde -9223372036854775807 hasta 9223372036854775807
        System.out.println(numeroGrande);

        //Numeros Decimales
        float decimal = 17.5f; //Siempre se Coloca la F al final del numero
        double decimal1 = 19.5;
        System.out.println(decimal);

        //Boolenaos
        boolean verdad = true;
        boolean falso = false;
        System.out.println(verdad);

        //Caracter
        char caracter = 'a'; //Siempre se usan comillas simples en Char
        System.out.println(caracter);
    }

    //STRING
    public static void main(String[] args){
        String texto = "Hola Mundo";

        int longitud = texto.length();
        System.out.println(longitud);

        String texto2 = texto.replace("Hola", "Chao");
        System.out.println(texto2);

        System.out.println(texto.endsWith("undo"));
        System.out.println(texto.startsWith("H"));
        System.out.println(texto.contains(" "));
        System.out.println(texto.indexOf("o"));

        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());


        String malo = "    chancho feliz     ";
        System.out.println(malo.trim());
    }
}