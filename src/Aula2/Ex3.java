package Aula2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        double  um;
        double  cinco;
        double  dez;
        double  vinteFive;
        double  cinquenta;
        double  total;

        System.out.println("Insira a quantidade de moedas de 5 Centavos: ");
        cinco= read.nextInt();
        cinco= (cinco*5)/100;

        System.out.println("Insira a quantidade de moedas de 10 Centavos: ");
        dez= read.nextInt();
        dez= (dez*10)/100;

        System.out.println("Insira a quantidade de moedas de 25 Centavos: ");
        vinteFive= read.nextInt();
        vinteFive= (vinteFive*25)/100;

        System.out.println("Insira a quantidade de moedas de 50 Centavos: ");
        cinquenta= read.nextInt();
        cinquenta= (cinquenta*50)/100;

        System.out.println("Insira a quantidade de moedas de 1 real: ");
        um= read.nextInt();

        total= cinco+dez+vinteFive+cinquenta+um;

        System.out.println("Seu cofrinho contém: R$ "+total);
    }
}