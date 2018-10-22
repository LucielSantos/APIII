package Aula8;

public class Ex3 {
    public static void main(String[] args) {
    Funcoes funcao= new Funcoes();

    String data= funcao.lerString("Digite a data (dd/mm/aaaa): ");

    System.out.println(funcao.getDia(data));
    System.out.println(funcao.getMes(data));
    System.out.println(funcao.getAno(data));
    }
}
