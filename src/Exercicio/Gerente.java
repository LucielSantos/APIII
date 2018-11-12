package Exercicio;

public class Gerente extends Pessoa {
    public Gerente(){
        System.out.println("ADICIONANDO GERENTE");
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

    public Cliente addCliente(){
        Cliente cliente= new Cliente();
        return cliente;
    }

    public Tecnico addTecnico(){
        Tecnico tecnico= new Tecnico();
        return tecnico;
    }
}
