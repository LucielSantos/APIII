package Aula4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        DecimalFormat foramatar= new DecimalFormat();

        float preco;
        float precoFinal;

        foramatar.applyPattern("R$ #,###.00");
        do {
            System.out.println("Insira o preço original do produto: R$ ");
            preco= read.nextFloat();
            if (preco!=0){
                precoFinal= preco-(preco*12/100);
                System.out.println("Preço final do produto: "+foramatar.format(precoFinal));
            }
        }while (preco!=0);
    }
}