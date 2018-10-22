package Aula2;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);

        String usuarioCorreto= "java8";
        String senhaCorreto=  "java8";
        String usuario;
        String senha;
        int n=3;
        int x= 0;

        do {
            System.out.println("Digite o usuário Correta: ");
            usuario= read.next();
            System.out.println("Digite a senha Correta: ");
            senha= read.next();
            if (senha.equals(senhaCorreto) && (usuario.equals(usuarioCorreto))){
                System.out.println("Usuário e senha Corretos!");
                x++;
            }
            else {
                System.out.println("Usuário e senha Incorretos!");
                System.out.println("Tentativas Restantes: "+n);
                n--;
            }
        }while ((n>0)||(x>0));
        if (n==0){
            System.out.println("Acesso Negado! Usuário e senha incorretos");
        }
    }
}
