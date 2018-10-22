package Aula8;

import java.util.Scanner;

public class Ex5b {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        Funcoes funcao= new Funcoes();

        int n=0;

        System.out.print("Insira o número de elementos que o vetor terá: ");
        n= read.nextInt();

        funcao.randomVet(n, 1000);
    }
}
