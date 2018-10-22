package Aula4;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        String frase;
        String substring;

        System.out.print("Insira a frase: ");
        frase= read.nextLine();

        for (int i=0; i<frase.length()-1; i++){
            System.out.print(frase.charAt(i));
        }
    }
}
