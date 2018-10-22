package Aula8;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        Funcoes funcao= new Funcoes();
        System.out.println("---------------------");
        funcao.contar();

        System.out.println("---------------------");
        System.out.print("Digite o Fim: ");
        funcao.contar(read.nextInt());

        System.out.println("---------------------");
        System.out.print("Digite o inicio: ");
        int n= read.nextInt();
        System.out.print("Digite o Fim: ");
        funcao.contar(n, read.nextInt());

        System.out.println("---------------------");
        System.out.print("Digite o inicio: ");
        int a= read.nextInt();
        System.out.print("Digite o Fim: ");
        int b= read.nextInt();
        System.out.print("Digite a Pausa: ");
        long tempo= read.nextLong();
        funcao.contar(a, b, tempo);
    }
}
