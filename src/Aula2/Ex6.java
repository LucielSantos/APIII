package Aula2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        double valProduto= 0;
        double porcentagem= 0;
        double valDesconto= 0;
        double valFinal= 0;

        System.out.println("Digite o valor do poduto: R$ ");
        valProduto= read.nextDouble();

        System.out.println("Digite a porcentagem de desconto: ");
        porcentagem= read.nextDouble();

        valDesconto= valProduto*porcentagem/100;
        System.out.println("Valor do deconto: R$ "+valDesconto);

        valFinal= valProduto-valDesconto;
        System.out.println("Valor do Produto com desconto: R$"+valFinal);
    }
}


