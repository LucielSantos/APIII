package Aula2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        double num=0;
        int senhaCorreta= 1234;

        while (num != senhaCorreta){
            System.out.println("Digite a Senha Correta: ");
            num= read.nextInt();
            if (num == senhaCorreta){
                System.out.println("ACESSO PERMITIDO");
            }
            else {
                System.out.println("ACESSO NEGADO");
            }
        }
    }
}
