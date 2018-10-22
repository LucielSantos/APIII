package Aula4;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        Random rand= new Random();

        int soma=0;
        int n=0;

        for (int i=0; i<3; i++){
            n= rand.nextInt(6);
            n=n+1;
            System.out.println(n);
            soma= soma+n;
        }
        System.out.println("Soma: "+soma);
    }
}
