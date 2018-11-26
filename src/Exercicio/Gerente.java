package Exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Pessoa {

    Scanner read = new Scanner(System.in);

    //crud cliente, tecnico, gerente ok

    public Gerente() {
        //super();
        System.out.println("Cadastrando Gerente");
        System.out.println("Login: ");
        this.setLogin(read.next());
        System.out.println("Senha: ");
        this.setSenha(read.next());

        System.out.println("Gerente criado!");
    }

    public Cliente cadastrarCliente() {
        Cliente cliente = new Cliente();
        return cliente;
    }

    public Tecnico cadastrarTecnico() {
        Tecnico tecnico = new Tecnico();
        return tecnico;
    }

    public Gerente cadastrarGerente() {
        Gerente gerente = new Gerente();
        return gerente;
    }


    public void listarCliente(String nome, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNome().equalsIgnoreCase(nome)) {
                if (array.get(i) instanceof Cliente) {
                    System.out.println(array.get(i).toString());
                }
            } else {
                System.out.println("Nome não encontrado.");
            }
        }
    }

    public void listarTecnico(String nome, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNome().equalsIgnoreCase(nome)) {
                if (array.get(i) instanceof Tecnico) {
                    System.out.println(array.get(i).toString());
                }
            } else {
                System.out.println("Nome não encontrado.");
            }
        }
    }

    public void listarGerente(String nome, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNome().equalsIgnoreCase(nome)) {
                if (array.get(i) instanceof Gerente) {
                    System.out.println(array.get(i).toString());
                }
            } else {
                System.out.println("Nome não encontrado.");
            }
        }
    }


    public void editarCliente(String nome, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNome().equalsIgnoreCase(nome)) {
                if (array.get(i) instanceof Cliente) {
                    menuEdicao();
                }
            } else {
                System.out.println("Nome não encontrado.");
            }
        }
    }

    public void editarTecnico(String nome, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNome().equalsIgnoreCase(nome)) {
                if (array.get(i) instanceof Tecnico) {
                    menuEdicao();
                }
            } else {
                System.out.println("Nome não encontrado.");
            }
        }
    }

    public void editarGerente(String nome, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNome().equalsIgnoreCase(nome)) {
                if (array.get(i) instanceof Gerente) {
                    menuEdicao();
                }
            } else {
                System.out.println("Nome não encontrado.");
            }
        }
    }

    private void menuEdicao() {
        String resposta;

        System.out.println("1- Editar nome");
        System.out.println("2- Editar telefone");
        System.out.println("3- Editar e-mail");
        System.out.println("4- Editar login");
        System.out.println("5- Editar senha");
        resposta = read.next();

        switch (resposta) {
            case ("1"):
                System.out.println("Novo nome: ");
                this.setNome(read.next());
                System.out.println("Nome alterado!");
                break;

            case ("2"):
                System.out.println("Novo telefone: ");
                this.setTelefone(read.next());
                System.out.println("Telefone alterado!");
                break;

            case ("3"):
                System.out.println("Novo e-mail: ");
                this.setEmail(read.next());
                System.out.println("E-mail alterado!");
                break;

            case ("4"):
                System.out.println("Novo login: ");
                this.setLogin(read.next());
                System.out.println("Login alterado!");
                break;

            case ("5"):
                System.out.println("Nova senha: ");
                this.setSenha(read.next());
                System.out.println("Senha alterada!");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    public boolean removerCliente(String nome, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNome().equalsIgnoreCase(nome)) {
                array.remove(i);
                return true;
            } else {
                System.out.println("Nome não encontrado.");
                return false;
            }
        }
        return false;
    }

    public boolean removerTecnico(String nome, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNome().equalsIgnoreCase(nome)) {
                array.remove(i);
                return true;
            } else {
                System.out.println("Nome não encontrado.");
                return false;
            }
        }
        return false;
    }

    public boolean removerGerente(String nome, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNome().equalsIgnoreCase(nome)) {
                array.remove(i);
                return true;
            } else {
                System.out.println("Nome não encontrado.");
                return false;
            }
        }
        return false;
    }

    //crud chamados ok

    public Chamado abrirChamado(Pessoa cliente, Pessoa tecnico) {
        Chamado chamado = new Chamado(cliente, tecnico);
        return chamado;
    }

    public boolean editarChamado(int idChamado, ArrayList<Chamado> chamados) {
        for (int i = 0; i < chamados.size(); i++) {
            if (chamados.get(i).getIdChamado() == idChamado) {
                chamados.get(i).menuEdicaoChamado();
                return true;
            }
        }
        return false;
    }

    public boolean cancelarChamado(int idchamado, ArrayList<Chamado> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getIdChamado() == idchamado) {
                array.get(i).setProblema("Cancelado!");
                array.get(i).setPrioridade("Cancelado!");
                System.out.println("Chamado cancelado!");
                return true;
            }
        }
        return false;
    }

    public boolean consultarChamado(int idChamado, ArrayList<Chamado> chamados) {
        for (int i = 0; i < chamados.size(); i++) {
            if (chamados.get(i).getIdChamado() == idChamado) {
                System.out.println(chamados.get(i).toString());
                return true;
            }
        }
        return false;
    }

    //login ok

    public boolean validaAcesso(String senha, String login, ArrayList<Pessoa> array) {
        if (validaLogin(login, array) && validaSenha(senha, array)) {
            return true;
        }
        return false;
    }

    private boolean validaLogin(String login, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }

    private boolean validaSenha(String senha, ArrayList<Pessoa> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public Pessoa acharTecnicoMenosChamados(ArrayList<Pessoa> array) {
        Pessoa tecnico = new Pessoa();
        for (int a=0; a<array.size(); a++){
            if (array.get(a) instanceof Tecnico){
                for (int b=a+1; b<array.size();b++){
                    if (array.get(b) instanceof Tecnico){
                        if (((Tecnico) array.get(a)).getQtdChamados() <= ((Tecnico) array.get(b)).getQtdChamados()){
                            tecnico=array.get(a);
                        }else {
                            tecnico= array.get(b);
                        }
                    }
                }
            }
        }
//        for (int i = 0; i < array.size(); i++) {
//            if (array.get(i) instanceof Tecnico) {
//                for (int x = 0; x < array.size(); x++) {
//                    if (array.get(x) instanceof Tecnico) {
//                        if (((Tecnico) array.get(i)).getQtdChamados() <= ((Tecnico) array.get(x)).getQtdChamados()) {
//                            tecnico = array.get(i);
//                        } else {
//                            tecnico = array.get(x);
//                        }
//
//                    }
//                }
//            }
//        }
        if (tecnico instanceof Tecnico) {
            return tecnico;
        } else {
            return null;
        }

//    public Pessoa acharTecnicoMenosChamados(ArrayList<Pessoa> array){
//        for (int i = 0; i< array.size(); i++){
//            if (array.get(i) instanceof Tecnico){
//                return array.get(i);
//            }
//        }
//        return null;
//    }

    }
}
