package Aula5;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);

        DecimalFormat formatar= new DecimalFormat();
        formatar.applyPattern("0.00");

        Random rand= new Random();

        double vetor []= new double[12];

        for (int i=0; i<vetor.length; i++){
            vetor [i]= rand.nextDouble()*10;
        }
        for (int x=0; x<vetor.length;x++){
            System.out.println(formatar.format(vetor[x]));
        }

        System.out.println("------------------------------------");

        for (int y=0; y<vetor.length; y++){
            System.out.println("insira o valor do vetor na posição "+y+": ");
            vetor[y]=read.nextDouble();
        }
        for (int a=0; a<vetor.length; a++){
            System.out.println(vetor[a]);
        }
    }
}
