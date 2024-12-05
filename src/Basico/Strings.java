package Basico;

public class Strings {
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
}
