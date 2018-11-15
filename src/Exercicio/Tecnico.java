package Exercicio;

public class Tecnico extends Pessoa {


    public Tecnico (){
        System.out.println("ADICIONANDO TÉCNICO");
        System.out.print("Digite o nome: ");
        this.setNome(read.next());
        System.out.print("Digite o email: ");
        this.setEmail(read.next());
        System.out.print("Digite o Telefone: ");
        this.setTelefone(read.next());
        System.out.print("Digite o Login: ");
        this.setLogin(read.next());
        System.out.print("Digite a Senha: ");
        this.setSenha(read.next());
    }
}
