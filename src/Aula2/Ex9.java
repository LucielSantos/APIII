package Aula2;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        String sexo;
        int idade=0;
        int restante=0;

        System.out.println("Insira o seu sexo (M/F): ");
        sexo= read.next();

        System.out.println("Insira a sua Idade: ");
        idade= read.nextInt();

        if (sexo.equals("M")){
            restante= 35 - idade;
        }

        if (sexo.equals("F")){
            restante= 30 - idade;
        }

        if (restante>0) {
            System.out.println("Faltam "+restante+" anos para você se aposentar");
        }
        else
            System.out.println("Você já tem o direito a aposentadoria");
    }
}