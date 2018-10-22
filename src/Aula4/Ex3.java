package Aula4;

public class Ex3 {
    public static void main(String[] args) {

        int sorteio= (int) ((Math.random() *5)+5);
        System.out.println(sorteio);

        System.out.print("senha: ");
        for (int i=0; i<sorteio; i++){
            int senha= (int) ((Math.random() *5)+5);
            System.out.print(senha);
        }
    }
}
