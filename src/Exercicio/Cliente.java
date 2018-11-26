package Exercicio;

import java.util.ArrayList;

public class Cliente extends Pessoa{

    public Cliente(){
        //super();
        System.out.println("Cadastrando Cliente");
        System.out.println("Login: ");
        this.setLogin( read.next());
        System.out.println("Senha: ");
        this.setSenha(read.next());
        System.out.println("Cliente criado!");
    }
    public Chamado abrirChamado(Pessoa cliente, Pessoa tecnico){
        Chamado chamado = new Chamado(cliente, tecnico);
        return chamado;
    }

    public boolean editarChamado(int idChamado, ArrayList<Chamado> chamados){
        for (int i = 0; i < chamados.size(); i++){
            if (chamados.get(i).getIdChamado() == idChamado){
                chamados.get(i).menuEdicaoChamado();
                return true;
            }
        }
        return false;
    }

}
