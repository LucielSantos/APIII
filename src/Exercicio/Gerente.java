package Exercicio;

import java.util.ArrayList;

public class Gerente extends Pessoa {

    public void ler(){
        System.out.println("ADICIONANDO GERENTE");
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
        cliente.ler();
        return cliente;
    }

    public Tecnico addTecnico(){
        Tecnico tecnico= new Tecnico();
        tecnico.ler();
        return tecnico;
    }

    public void editarCliente(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                if (array.get(i) instanceof Cliente){
                    menuEdicao();
                }
            }else{
                System.out.println("Nome não encontrado.");
            }
        }
    }
    public void editarTecnico(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                if (array.get(i) instanceof Tecnico){
                    menuEdicao();
                }
            }else{
                System.out.println("Nome não encontrado.");
            }
        }
    }
    public void editarGerente(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                if (array.get(i) instanceof Gerente){
                    menuEdicao();
                }
            }else{
                System.out.println("Nome não encontrado.");
            }
        }
    }

    private void menuEdicao(){
        String resposta;

        System.out.println("1- Editar nome");
        System.out.println("2- Editar telefone");
        System.out.println("3- Editar e-mail");
        System.out.println("4- Editar login");
        System.out.println("5- Editar senha");
        resposta = read.next();

        switch (resposta){
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

    public void listarCliente(String nome, ArrayList<Pessoa> array){
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
    public void listarTecnico(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                if (array.get(i) instanceof Tecnico) {
                    System.out.println(array.get(i).toString());
                }
            }else{
                System.out.println("Nome não encontrado.");
            }
        }
    }
    public void listarGerente(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                if (array.get(i) instanceof Gerente) {
                    System.out.println(array.get(i).toString());
                }
            }else{
                System.out.println("Nome não encontrado.");
            }
        }
    }

    public boolean removerCliente(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                array.remove(i);
                return true;
            }else{
                System.out.println("Nome não encontrado.");
                return false;
            }
        }
        return false;
    }
    public boolean removerTecnico(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                array.remove(i);
                return true;
            }else{
                System.out.println("Nome não encontrado.");
                return false;
            }
        }
        return false;
    }
    public boolean removerGerente(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                array.remove(i);
                return true;
            }else{
                System.out.println("Nome não encontrado.");
                return false;
            }
        }
        return false;
    }


    public int validaAcesso(String senha, String login, ArrayList<Pessoa> array){
        if (validaLogin(login, array)){
            return validaSenha(senha, array);
        }
        return -1;
    }
    private boolean validaLogin(String login, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getLogin().equals(login)){
                return true;
            }
        }
        return false;
    }

    private int validaSenha(String senha, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getSenha().equals(senha)){
                return i;
            }
        }
        return -1;
    }

}

//    public boolean validarLogin(ArrayList <Pessoa> array, String login){
//        if (array.size()==0){
//            return false;
//        }else {
//            for (int i=0; i<array.size(); i++){
//                if (array.get(i).getLogin().equals(login)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//
//    public boolean validarSenha(ArrayList <Pessoa> array, String senha){
//        if (array.size()==0){
//            return false;
//        }else {
//            for (int i=0; i<array.size(); i++){
//                if (array.get(i).getSenha().equals(senha)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    

