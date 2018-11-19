package Exercicio;

import java.util.Scanner;

public class Chamado {
    Scanner read= new Scanner(System.in);

    Cliente cliente;
    Pessoa tecnico;
    String prioridade;
    String problema;
    String situacao;

    public void ler(){
        System.out.println("Digite a prioridade: ");
        this.prioridade=read.next();
        System.out.print("Digite o problema: ");
        this.problema= read.nextLine();
        situacao="pendente";
    }
}
