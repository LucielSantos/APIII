package Aula4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);

        String palavra;
        System.out.print("Palavra: ");
        palavra= read.next();

        System.out.println("Palavra Invertida: ");
        for (int i=palavra.length() -1; i>=0; i--){
            System.out.print(palavra.charAt(i));
        }
    }
}
