package Aula11;

import java.util.Scanner;

public class Livro {
    public String titulo;
    public int paginas;
    public String isbn;
    public double preco;
    //// metodos

    void lerDados(){
        Scanner tc= new Scanner(System.in);
        System.out.println("Digite Titulo");
        this.titulo= tc.nextLine();
        System.out.println("Digite Pagians");
        System.out.println("Digite isbn");
        System.out.println("Digite preco");
    }
    public void mostraLivro(){
        System.out.println("--------");
        System.out.println("Titulo: "+this.titulo);
    }
}
