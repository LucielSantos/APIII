package Aula5;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String palavra;
        String invertida="";

        System.out.print("Digite a Palavra: ");
        palavra= read.next();

        for (int i=palavra.length()-1; i>=0; i--){
            invertida= invertida + palavra.charAt(i);
        }

        if (invertida.equals(palavra)){
            System.out.println("esta palavra é um palíndromo");
        }else{
            System.out.println("esta palavra não é um palíndromo");
        }
        System.out.println(invertida);
    }
}