package Aula2;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        double preco= 0;
        String produto;
        double precoFinal= 0;

        System.out.println("Digite o Nome do produto: ");
        produto= read.next();

        System.out.println("Digite o Preço do Produto: R$");
        preco= read.nextDouble();

        System.out.println("Nome do Produto: "+produto);
        System.out.println("Preço original do Produto: R$ "+preco);

        if ((preco >= 50) && (preco <200)){
            precoFinal= preco - (preco*5/100);
            System.out.println("Preço do Produto com Desconto: R$ "+ precoFinal);
        }

        if ((preco >= 200) && (preco <500)){
            precoFinal= preco - (preco*6/100);
            System.out.println("Preço do Produto com Desconto: R$ "+ precoFinal);
        }

        if ((preco >= 500) && (preco <1000)){
            precoFinal= preco - (preco*7/100);
            System.out.println("Preço do Produto com Desconto: R$ "+ precoFinal);
        }

        if (preco >= 1000){
            precoFinal= preco - (preco*8/100);
            System.out.println("Preço do Produto com Desconto: R$ "+ precoFinal);
        }
        else {
            System.out.println("Valor do Produto menor que zero");
        }
    }
}