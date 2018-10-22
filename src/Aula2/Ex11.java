package Aula2;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);

        double rTotal= 0;
        double resistencia[]= new double[4];

        System.out.println("Insira o valor da resistência 1: ");
        resistencia[0]= read.nextDouble();

        double memMenor= resistencia[0];
        double memMaior= resistencia[0];

        for (int i=1; i < resistencia.length; i++){
            int x=i+1;
            System.out.println("Insira o valor da resistência "+x+": ");
            resistencia[i]= read.nextDouble();
            rTotal= rTotal + resistencia[i];
            if (resistencia[i]>memMaior){
                memMaior=resistencia[i];
            }
        }


        for (int j= 1; j < resistencia.length; j++){
            if (resistencia[j]<memMenor);{
                memMenor = resistencia[j];
            }
        }

        System.out.println("Valor da menor Resistência: "+memMenor);
        System.out.println("Valor da maior Resistência: "+memMaior);
        System.out.println("Resistêncnia Total: "+rTotal);
    }
}
