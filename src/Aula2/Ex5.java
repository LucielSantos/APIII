package Aula2;


import java.text.DecimalFormat;

public class Ex5 {
    public static void main(String[] args) {

        DecimalFormat df= new DecimalFormat();
        df.applyPattern("#,##0.00");

        double an=1.50;
        double fe=1.10;
        int ano=0;

        while (fe<an){
            an= an+0.20;
            fe= fe+0.30;
            ano= ano+1;
        }

        System.out.println("Levará "+ano+" anos até Felisberto ser maior que Anacleto\n " +
                "Felisberto terá "+df.format(fe)+"m de altura e Anacleto terá "+df.format(an)+"m de altura.");
    }
}
