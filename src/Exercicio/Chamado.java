package Exercicio;

import java.util.Scanner;

public class Chamado {
    Scanner read= new Scanner(System.in);

    String nomeCliente;
    String prioridade;
    String problema;
    int id;

    public Chamado(String nomeCliente){
        this.nomeCliente=nomeCliente;
        System.out.println("Digite a prioridade: ");
        this.prioridade=read.next();
        System.out.print("Digite o problema: ");
        this.problema= read.nextLine();
        id= (int) (Math.random()*101);
    }
}
