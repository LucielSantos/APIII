package Aula8;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        Funcoes meses= new Funcoes();

        int numero=0;
        int opcao=0;

        System.out.print("Digite o Número Referente ao mês: ");
        numero= read.nextInt();

        System.out.print("Digite o Idioma(1- Portugês ou 2- Inglês): ");
        opcao= read.nextInt();
        if (opcao==1) {
            System.out.println(meses.mesPt(numero - 1));
        }
        if (opcao==2){
            System.out.println(meses.mesEn(numero-1));
        }
    }
}