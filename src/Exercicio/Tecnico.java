package Exercicio;

public class Tecnico extends Pessoa{

    public static int idTecnico = 0;
    private int qtdChamados;

    public Tecnico(){
        //super();
        System.out.println("Cadastrando tecnico");
        System.out.println("Login: ");
        this.setLogin( read.next());
        System.out.println("Senha: ");
        this.setSenha(read.next());

        setIdTecnico(+1);

        System.out.println("Técnico criado!");
    }
    public int getQtdChamados() {
        return qtdChamados;
    }

    public void addQtdChamados() {
        this.qtdChamados++;
    }



    public boolean tarefasPendentes(){

        return false;
    }

    public boolean tarefasRealizadas(){

        return false;
    }

    public boolean finalizarTarefas(){

        return false;
    }

    //-----------------------------------------------------------------------------------------------------------------


    public static int getIdTecnico() {
        return idTecnico;
    }

    public static void setIdTecnico(int idTecnico) {
        Tecnico.idTecnico = idTecnico;
    }
}
