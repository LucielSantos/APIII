package Exercicio;

import java.util.ArrayList;

public class Cliente extends Pessoa {


    public void ler (){
        System.out.println("ADICIONANDO CLIENTE");
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

    public Chamado addChamado(Cliente cliente, ArrayList <Pessoa> array){
        Chamado chamado=new Chamado();
        chamado.ler();
        chamado.cliente=cliente;
        for (int i=0; i<array.size()-1; i++){
            if (array.get(i) instanceof Tecnico){
                chamado.tecnico = array.get(i);
                break;
            }
        }
        return chamado;
    }

}
