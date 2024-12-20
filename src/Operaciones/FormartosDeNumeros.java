package Operaciones;

import java.text.NumberFormat;
import java.util.Locale;

public class FormartosDeNumeros {
    public static void main(String[] args){
        //Formato de Moneda
        Locale locale = Locale.forLanguageTag("es-CL");;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String result = numberFormat.format(1099.90);
        System.out.println(result);

        //Foormato de Porcentaje
        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        System.out.println(porcentaje.format(0.15));
    }
}
