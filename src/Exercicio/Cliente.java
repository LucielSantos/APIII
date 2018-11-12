package Exercicio;

public class Cliente extends Pessoa {


    public Cliente (){
        System.out.println("ADICIONANDO CLIENTE");
        System.out.print("Digite o nome: ");
        this.setNome(read.next());
        System.out.print("Digite o email: ");
        this.setEmail(read.next());
        System.out.print("Digite o Telefone");
        this.setTelefone(read.next());
        System.out.print("Digite o Login: ");
        this.setLogin(read.next());
        System.out.print("Digite a Senha: ");
        this.setSenha(read.next());
    }

}
