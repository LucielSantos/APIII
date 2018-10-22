package Aula5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);

        double vetor[]= new double[5];
        double med=0;

        for (int i=0; i<5; i++){
            System.out.print("Digite a nota do aluno: ");
            vetor[i]=read.nextDouble();
            med=med+vetor[i];
        }

        for (int i=0; i<5; i++){
            for (int x=i+1; x<5; x++)
                if (vetor[i]<vetor[x]){
                    double temp= vetor[i];
                    vetor[i]=vetor[x];
                    vetor[x]=temp;
                }
        }

        System.out.println("-----------------");
        for (int k=0; k<5; k++){
            System.out.println(vetor[k]);
        }
        System.out.println("média: "+med/5);



    }
}
