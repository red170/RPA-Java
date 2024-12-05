package Basico;

public class Arrays {
    //ARRAYS
    public static void main1(String[] args){
        //Array Unidimensionales (Vectores)

        //Declaracion e Inicializacion de un ARRAY de forma Compleja
        int[] numeros = new int[5];
        //Asignacion de valores al ARRAY
        numeros[0] = 5;
        numeros[1] = 50;
        numeros[2] = 500;
        numeros[3] = 5000;
        numeros[4] = 50000;
        System.out.println(java.util.Arrays.toString(numeros));

        //Declaracion Simplificada
        int[] num = {0,1,2,3,4};
        System.out.println(java.util.Arrays.toString(num));

    }

    public static void main(String[] args){
        //Array Multidimensionales (Matrices)

        //Declaracion e Inicializacion
        int[][] num = new int[2][2];
        num[0][0] = 1;
        num[0][1] = 1;
        num[1][0] = 1;
        num[1][1] = 1;
        System.out.println(java.util.Arrays.deepToString(num));

        //Declaracion e Inializacioon Simplificada
        int[][] numeros = {{0,1},{2,3}};
        System.out.println(java.util.Arrays.deepToString(numeros));
    }


}
