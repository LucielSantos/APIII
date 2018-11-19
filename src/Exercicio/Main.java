package Exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        ArrayList <Pessoa> arrayPessoa= new ArrayList();

        ArrayList <Chamado> chamados= new ArrayList();



        Gerente admin = new Gerente();
        admin.ler();

        arrayPessoa.add(admin.addGerente());
        //arrayPessoa.add(gerente.addCliente());
        //arrayPessoa.add(gerente.addTecnico());

        do {
            System.out.print("Digite o login: ");
            String login= read.nextLine();
            System.out.print("Digite a senha: ");
            String senha= read.nextLine();
            int n=admin.validaAcesso(senha, login, arrayPessoa);
            Pessoa usuario= arrayPessoa.get(n);

        }





        System.out.println(arrayPessoa.get(0).toString());
//        System.out.println(arrayPessoa.get(1).toString());
//        System.out.println(arrayPessoa.get(2).toString());

        System.out.println(arrayPessoa.get(0) instanceof Gerente);
//        System.out.println(arrayPessoa.get(1) instanceof Gerente);
//        System.out.println(arrayPessoa.get(2) instanceof Gerente);
        System.out.println("---");
        System.out.println(admin.validaAcesso("senha", "login", arrayPessoa));

    }
}
