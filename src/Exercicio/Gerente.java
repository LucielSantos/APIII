package Exercicio;

import java.util.ArrayList;

public class Gerente extends Pessoa {
    public Gerente addGerente(){
        Gerente gerente= new Gerente();
        System.out.println("ADICIONANDO GERENTE");
        System.out.print("Digite o nome: ");
        gerente.setNome(read.next());
        System.out.print("Digite o email: ");
        gerente.setEmail(read.next());
        System.out.print("Digite o Telefone: ");
        gerente.setTelefone(read.next());
        System.out.print("Digite o Login: ");
        gerente.setLogin(read.next());
        System.out.print("Digite a Senha: ");
        gerente.setSenha(read.next());
        return gerente;
    }

    public Cliente addCliente(){
        Cliente cliente= new Cliente();
        return cliente;
    }

    public Tecnico addTecnico(){
        Tecnico tecnico= new Tecnico();
        return tecnico;
    }

    public boolean validarLogin(ArrayList <Pessoa> array, String login){
        if (array.size()==0){
            return false;
        }else {
            for (int i=0; i<array.size(); i++){
                if (array.get(i).getLogin().equals(login)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validarSenha(ArrayList <Pessoa> array, String senha){
        if (array.size()==0){
            return false;
        }else {
            for (int i=0; i<array.size(); i++){
                if (array.get(i).getSenha().equals(senha)){
                    return true;
                }
            }
        }
        return false;
    }
}
