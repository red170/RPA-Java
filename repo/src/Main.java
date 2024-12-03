//JAVA es un lenguaje orientado a Objetos por lo tanto la progrmamcion se basa en programar clases y objeto y dentro del archivo empezamos la programacion con una clase publica sobre la cual es la que iremos escribiendo el codigo


import java.util.Arrays;

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
    public static void main3(String[] args){
        //Almacenar Texto
             String texto = "Hola Mundo";

        //Metodos de String
            //Imprimir longitud de String
            int longitud = texto.length();
            System.out.println(longitud);
            //Reemplezar Texto
            String texto2 = texto.replace("Hola", "Chao");
            System.out.println(texto2);
            //Verificar si un String Termina de cierta forma
            System.out.println(texto.endsWith("undo"));
            //Verificar si un String Comienza de cierta forma
            System.out.println(texto.startsWith("H"));
            //Verificar si un String Contiene ciertos caracteres o cadena de texto
            System.out.println(texto.contains(" "));
            //Verificar la Posicion de un caracter dentro de el String padre
            System.out.println(texto.indexOf("o"));
            //Convertir la cadena a Minusculas
            System.out.println(texto.toLowerCase());
            //Convertir la cadena a Mayusculas
            System.out.println(texto.toUpperCase());
            //Eliminar los espacios al Inicio y al Final del String
            String malo = "    chancho feliz     ";
            System.out.println(malo.trim());

       //Secuencias de Escape
            //Al hacer uso del backslash "\" previo a un caracter este lo oculta de la secuencia de programacion y lo muestra como que fuese otro string mas

            String texto4 = "Hola \"Mundo\""; //Escapar Comillas
            System.out.println(texto4);

            String texto5 = "C:\\Hola \"Mundo\">";//Escapar Backslash
            System.out.println(texto5);

            String texto6 = "Hola \nMundo";//Insertar Salto de Linea dentro del String
            System.out.println(texto6);

            String texto7 = "Hola \tMundo";//Insertar Tabulacion de Texto (Sangria)
            System.out.println(texto7);

    }

    //ARRAYS
    public static void main(String[] args){
        int[] numeros = new int[5];
        numeros[0] = 5;
        numeros[1] = 50;
        numeros[2] = 500;
        numeros[3] = 5000;
        numeros[4] = 50000;
        System.out.println(Arrays.toString(numeros));

        System.out.println(numeros.length);
    }
}