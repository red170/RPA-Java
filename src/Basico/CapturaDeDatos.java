package Basico;

import java.util.Scanner;

public class CapturaDeDatos {
    public static void main(String[] args){
        //Captura de Texto
        Scanner scanner = new Scanner(System.in);

        String valor = scanner.nextLine();
        System.out.println(valor);

        //Captura de Numeros
        Scanner scanner1 = new Scanner(System.in);

        byte valor1 = scanner1.nextByte();
        System.out.println(valor1);
    }
}
