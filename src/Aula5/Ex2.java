package Aula5;

public class Ex2 {
    public static void main(String[] args) {
        String frase= "I Like Java";

        for (int i=frase.length()-4; i<frase.length();i++){
            System.out.print(frase.charAt(i));
        }
    }
}
