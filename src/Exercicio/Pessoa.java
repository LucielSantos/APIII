package Exercicio;

import java.util.Scanner;

public class Pessoa {
    private String nome, telefone, email, login, senha;
    Scanner read = new Scanner(System.in);

    public Pessoa(){
       /*System.out.println("Nome: ");
       this.nome = read.next();
       System.out.println("Telefone: ");
       this.telefone = read.next();
       System.out.println("E-mail: ");
       this.email = read.next();*/
//        System.out.println("Login: ");
//        this.login = read.next();
//        System.out.println("Senha: ");
//        this.senha = read.next();
    }

    //-----------------------------------------------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cliente:" + "\n" +
                "-------------------" + "\n" +
                "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "E-mail: " + email + "\n" +
                "Login: " + login + "\n" +
                "Senha: " + senha;
    }
}
