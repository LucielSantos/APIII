package Aula2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Digite o Número: ");
        num = teclado.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(i+ " X "+num+" = "+ i*num);
        }
    }
}