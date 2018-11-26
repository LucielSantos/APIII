package Exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Chamado {
    Scanner read = new Scanner(System.in);
    public static int idChamado = 0;
    private String problema, prioridade;

    private Pessoa cliente;
    private Pessoa tecnico;


    public Chamado(Pessoa cliente, Pessoa tecnico) {
        this.setIdChamado(+1);
        System.out.println("Problema: ");
        this.setProblema(read.next());
        this.setCliente(cliente);
        this.setTecnico(tecnico);
        if (this.getTecnico() instanceof Tecnico){
            ((Tecnico) this.getTecnico()).addQtdChamados();
        }
        System.out.println("Prioridade: ");
        System.out.println("1-Urgente");
        System.out.println("2-Alta");
        System.out.println("3-Moderada");
        System.out.println("4-Baixa");
        this.setPrioridade(read.next());

        switch (getPrioridade()) {
            case ("1"):
                this.setPrioridade("Urgente.");
                break;

            case ("2"):
                this.setPrioridade("Alta.");
                break;

            case ("3"):
                this.setPrioridade("Moderada.");
                break;

            case ("4"):
                this.setPrioridade("Baixa.");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getTecnico() {
        return tecnico;
    }

    public void setTecnico(Pessoa tecnico) {
        this.tecnico = tecnico;
    }



    public boolean alterarTecnico(int idchamado, ArrayList<Chamado> array) {

        return false;
    }

    public boolean menuEdicaoChamado() {
        String resposta;

        System.out.println("1- Editar problema");
        System.out.println("2- Editar prioridade");
        resposta = read.next();

        switch (resposta) {
            case ("1"):
                System.out.println("Novo problema: ");
                this.setProblema(read.next());
                System.out.println("Problema alterado!");
                return true;

            case ("2"):
                String auxiliar;

                System.out.println("Nova prioridade");
                System.out.println("1-Urgente");
                System.out.println("2-Alta");
                System.out.println("3-Moderada");
                System.out.println("4-Baixa");
                auxiliar = read.next();

                switch (auxiliar) {
                    case ("1"):
                        this.setPrioridade("Urgente.");
                        return true;

                    case ("2"):
                        this.setPrioridade("Alta.");
                        return true;

                    case ("3"):
                        this.setPrioridade("Moderada.");
                        return true;

                    case ("4"):
                        this.setPrioridade("Baixa.");
                        return true;

                    default:
                        System.out.println("Opção inválida.");
                        return true;


                }

            default:
                System.out.println("Opção inválida.");
                return false;
        }
    }

    //-----------------------------------------------------------------------------------------------------------------

    public String getProblema () {
        return problema;
    }

    public void setProblema (String problema){
        this.problema = problema;
    }

    public String getPrioridade () {
        return prioridade;
    }

    public void setPrioridade (String prioridade){
        this.prioridade = prioridade;
    }

    public int getIdChamado () {
        return idChamado;
    }

    private void setIdChamado ( int idChamado){
        idChamado = idChamado;
    }

    @Override
    public String toString() {
        return  "Problema: " + problema + "\n" +
                "Prioridade: " + prioridade + "\n" +
                "Id: " + idChamado;
    }
}
