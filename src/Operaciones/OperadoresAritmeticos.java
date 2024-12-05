package Operaciones;

public class OperadoresAritmeticos {
    public static void main(String[] args){
        int suma = 2+2;                             System.out.println(suma);
        int resta = 2-3;                            System.out.println(resta);
        int multiplicacion = 3/8;                   System.out.println(multiplicacion);
        int division = 10/3;                        System.out.println(division);
        float divisionDecimales = 10f/3f;           System.out.println(divisionDecimales);
        double divisionDecimalesBouble = 10.0/3.0;  System.out.println(divisionDecimalesBouble);
        int modulo = 7%4;                           System.out.println(modulo);

        int cont = 5; cont++;
        System.out.println(cont);

        int cont1 = 5; cont1--;
        System.out.println(cont1);

        int cont2 = 5; cont2+=5;
        System.out.println(cont2);

        int cont3 = 5; cont3-=5;
        System.out.println(cont3);

        int cont4 = 5; cont4/=5;
        System.out.println(cont4);

        int cont5 = 5; cont5 *=5;
        System.out.println(cont5);

    }
}
/*
 * Orden de las Operaciones Matematicas PEMDAS
 * 1. Parentesis        P = Parenthesis
 * 2. Potencia          E = Exponential
 * 3. Multiplicacion    M = Multiplication
 * 4. Division          D = Division
 * 5. Suma              A = Adition
 * 6. Resta             S = Substraction
 */