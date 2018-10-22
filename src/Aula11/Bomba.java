package Aula11;

public class Bomba {
    public static void main(String[] args) {
        UsaBomba bomba= new UsaBomba();
        int tempo=5;


        bomba.liga();
        System.out.println("Bomba Ligada");

        do {
            System.out.println(tempo);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Algo deu Errado");
            }
            tempo--;
        }while (tempo>0);
        bomba.desliga();
        System.out.println("Bomba Desligada");
    }
}
