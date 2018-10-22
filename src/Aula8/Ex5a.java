package Aula8;

import java.util.Scanner;

public class Ex5a {
    public static void main(String[] args) {

    Funcoes funcao= new Funcoes();
    Scanner read= new Scanner(System.in);

    int find=0;
    int tamVet1=0;
    int tamVet2=0;
    int n=0;

       System.out.print("Digite o Tamanho do Primeiro Vetor: ");
    tamVet1= read.nextInt();
    int vet1[]= new int[tamVet1];
       System.out.print("Digite o Tamanho do Segundo Vetor: ");
    tamVet2= read.nextInt();
    int vet2[]= new int[tamVet2];
       System.out.println("------------------------------------------");

       for (int i=0; i<vet1.length; i++){
        System.out.print("Digite o Valor do Primeiro Vetor na Posição "+i+": ");
        vet1[i]= read.nextInt();
    }
       System.out.println("------------------------------------------");
       for (int i=0; i<vet2.length; i++){
        System.out.print("Digite o Valor do Segundo Vetor na Posição "+i+": ");
        vet2[i]= read.nextInt();
    }

       System.out.println("------------------------------------------");

       System.out.print("Digite o Número que será procurado nos vetores: ");
    find= read.nextInt();

       System.out.println("------------------------------------------");

    n= funcao.retorno(vet1, vet2, find);
       System.out.println("Retorno: "+n);

}
}
