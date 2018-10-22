package Aula2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        double km=0;
        char carro=0;
        double med=0;

        Scanner read = new Scanner(System.in);

        System.out.println("Insira o percurso em quilômetros: ");
        km = read.nextDouble();

        System.out.println("Tipo do Carro(A, B ou C): ");
        carro = read.next().charAt(0);

        if (carro=='a'){
            med = km / 8;
        }
        if (carro == 'b') {
            med = km / 9;
        }

        if (carro == 'c') {
            med = km / 12;
        }

        System.out.println(med);
    }
}