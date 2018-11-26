package Exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean valida=false;
        int chances = 3;
        String senha, login, resposta;
        Pessoa userLogado= new Pessoa();
        Scanner read = new Scanner(System.in);

        Gerente gerente = new Gerente();

        ArrayList<Pessoa> agenda = new ArrayList<>();
        ArrayList<Chamado> chamados = new ArrayList<>();


        agenda.add(gerente);
        agenda.add(gerente.cadastrarCliente());
        agenda.add(gerente.cadastrarTecnico());
        agenda.add(gerente.cadastrarGerente());

        for (int i=0; i<agenda.size(); i++){
            System.out.println(agenda.get(i).toString());
        }

        System.out.println("***************************");
        System.out.println("Deseja logar como:");
        System.out.println("1- Gerente");
        System.out.println("2- Tecnico");
        System.out.println("3- Cliente");
        resposta = read.next();



        do {

            switch (resposta) {
                case ("1"):
                    System.out.println("Logando como Gerente");
                    for (chances=3; chances>0; chances--) {
                        System.out.println("Login: ");
                        login = read.next();
                        for (int i = 0; i < agenda.size(); i++) {
                            if (agenda.get(i).getLogin().equals(login) && agenda.get(i) instanceof Gerente) {
                                System.out.println("Senha: ");
                                senha = read.next();
                                if (agenda.get(i).getSenha().equals(senha)) {
                                    valida = true;
                                    userLogado = agenda.get(i);
                                    chances=0;
                                    break;
                                }
                            }
                        }
                    }
                    if (valida==true){
                        System.out.println("Usuário logado");
                    }else {
                        System.out.println("Acesso Negado");
                    }


//                    for (int i = 0; i < agenda.size(); i++) {
//                        if (agenda.get(i).getLogin().equals(login) && agenda.get(i) instanceof Gerente) {
//                            System.out.println("Senha: ");
//                            senha = read.next();
//                            if (agenda.get(i).getSenha().equals(senha)) {
//                                System.out.println("Acesso permitido.");
//                                validaGerente = true;
//                            } else {
//                                System.out.println("Acesso negado.");
//                            }
//                        }else{
//                            System.out.println("Não é um gerente");
//                            chances--;
//                            System.out.println("Você tem " + chances + " chances restantes.");
//                        }
//                    }
//
                    break;

                case ("2"):
                    System.out.println("Logando como Tecnico");
                    for (chances=3; chances>0; chances--) {
                        System.out.println("Login: ");
                        login = read.next();
                        for (int i = 0; i < agenda.size(); i++) {
                            if (agenda.get(i).getLogin().equals(login) && agenda.get(i) instanceof Tecnico) {
                                System.out.println("Senha: ");
                                senha = read.next();
                                if (agenda.get(i).getSenha().equals(senha)) {
                                    valida = true;
                                    userLogado = agenda.get(i);
                                    chances=0;
                                    break;
                                }
                            }
                        }
                    }
                    if (valida==true){
                        System.out.println("Usuário logado");
                    }else {
                        System.out.println("Acesso Negado");
                    }

//                    System.out.println("Login: ");
//                    login = read.next();
//
//                    for (int i = 0; i < agenda.size(); i++) {
//                        if (agenda.get(i).getLogin().equals(login) && agenda.get(i) instanceof Tecnico) {
//                            System.out.println("Senha: ");
//                            senha = read.next();
//                            if (agenda.get(i).getSenha().equals(senha)) {
//                                System.out.println("Acesso permitido.");
//                                validaTecnico = true;
//                            } else {
//                                System.out.println("Acesso negado.");
//                            }
//                        }else{
//                            System.out.println("Não é um técnico");
//                            chances--;
//                            System.out.println("Você tem " + chances + " chances restantes.");
//                        }
//                    }
                    break;

                case ("3"):
                    System.out.println("Logando como Cliente");
                    for (chances=3; chances>0; chances--) {
                        System.out.println("Login: ");
                        login = read.next();
                        for (int i = 0; i < agenda.size(); i++) {
                            if (agenda.get(i).getLogin().equals(login) && agenda.get(i) instanceof Cliente) {
                                System.out.println("Senha: ");
                                senha = read.next();
                                if (agenda.get(i).getSenha().equals(senha)) {
                                    valida = true;
                                    userLogado = agenda.get(i);
                                    chances=0;
                                    break;
                                }
                            }
                        }
                    }
                    if (valida==true){
                        System.out.println("Usuário logado");
                    }else {
                        System.out.println("Acesso Negado");
                    }

//                    System.out.println("Login: ");
//                    login = read.next();
//
//                    for (int i = 0; i < agenda.size(); i++) {
//                        if (agenda.get(i).getLogin().equals(login) && agenda.get(i) instanceof Cliente) {
//                            System.out.println("Senha: ");
//                            senha = read.next();
//                            if (agenda.get(i).getSenha().equals(senha)) {
//                                System.out.println("Acesso permitido.");
//                                validaCliente = true;
//                            } else {
//                                System.out.println("Acesso negado.");
//                            }
//                        }else{
//                            System.out.println("Não é um cliente");
//                            chances--;
//                            System.out.println("Você tem " + chances + " chances restantes.");
//                        }
//                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (valida != true && chances >= 1);

        if (userLogado instanceof Cliente){
            System.out.println("Abrindo Chamado como cliente");
            chamados.add(((Cliente) userLogado).abrirChamado(userLogado, gerente.acharTecnicoMenosChamados(agenda)));
            System.out.println("Added");
        }else if (userLogado instanceof Gerente){
            System.out.println("Abrindo Chamado como Gerente");
            chamados.add(((Gerente) userLogado).abrirChamado(userLogado, gerente.acharTecnicoMenosChamados(agenda)));
            System.out.println("added");
        }else {
            System.out.println("Error");
        }


    }
}




       /*do {
           System.out.println("Login de acesso: ");
           login = read.next();
           System.out.println("Senha de acesso: ");
           senha = read.next();
           if (gerente.validaAcesso(senha, login, agenda)) {
               validaAcesso = true;
           } else {
               System.out.println("Acesso negado!");
               validaAcesso = false;
           }
       }while (validaAcesso != true);*/
