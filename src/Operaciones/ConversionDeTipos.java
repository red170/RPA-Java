package Operaciones;

public class ConversionDeTipos {
    public static void main(String[] args){
        //Conversion Implicita (Entre Tipos de Datos Numericos)
        byte a = 1;
        int b = 15;

        int c = a+b;
        System.out.println(c);

        byte aa = 1;
        double bb = 15.15;

        double cc = aa+bb;
        System.out.println(cc);

        //Conversion Explicita (Entre Tipos de Datos Numericos)
        int x = 15;
        double y = 15.015;

        int z = (int)(x+y);
        System.out.println(z);

        int xx = 15;
        double yy = 15.015;

        int zz = xx + (int) yy;
        System.out.println(zz);

        //String a Dato Numerico
        String j = "1.1";
        int k = 2;
        double l = Double.parseDouble(j)+k;
        System.out.println(l);

        String jj = "1";
        int kk = 2;
        int ll = Integer.parseInt(jj)+ kk;
        System.out.println(ll);

    }
}
