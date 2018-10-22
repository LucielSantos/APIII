package Aula2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        double prova1= 0;
        double prova2= 0;
        double trabalho= 0;
        double med= 0;

        System.out.println("Insira a nota da primeira prova: ");
        prova1= read.nextInt();

        System.out.println("Insira a nota da segunda prova: ");
        prova2= read.nextInt();

        System.out.println("Insira a nota do trabalho: ");
        trabalho= read.nextInt();

        med= (prova1+prova2+trabalho)/3;

        System.out.println("Média: "+med);

        if (med>6){
            System.out.println("Aluno Aprovado!");
        }
        else {
            System.out.println("Aluno Reprovado");
        }
    }
}
