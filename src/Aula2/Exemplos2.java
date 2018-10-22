package Aula2;
import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class Exemplos2 {

    public static void main(String[] args) {
        // Fazer um algoritmo que leia o percurso em
        // quilômetros, o tipo do carro e informe o
        // consumo estimado de combustível,
        // sabendo-se que um carro tipo C faz 12 Km
        // com um litro de gasolina, um tipo B faz 9 Km e o
        // tipo A, 8 Km por litro.

        float kmRodados;
        char tipoCarro;
        float total;
        Scanner teclado = new Scanner(System.in);

        try {


            System.out.println("Informe a km");
            kmRodados = teclado.nextFloat();
            System.out.println("Informe o tipo");
            tipoCarro = teclado.next().charAt(0);

            if (tipoCarro == 'c') {
                total = kmRodados / 12;
                System.out.println("O consumo estimado é " + total);

            } else if (tipoCarro == 'b') {
                total = kmRodados / 9;
                System.out.println("O consumo estimado é " + total);

            } else if (tipoCarro == 'a') {
                total = kmRodados / 8;
                System.out.println("O consumo estimado é " + total);

            } else {
                System.out.println("Impossivel calcular");
            }
        }catch (Exception e){
            System.out.println("O seu burro ");
        }

        String leitura=JOptionPane.showInputDialog("Digite o carro");
        tipoCarro=leitura.charAt(0);
        leitura=JOptionPane.showInputDialog("Digite o KM");
        kmRodados=Float.parseFloat(leitura);

        switch (tipoCarro){
            case 'c':{
                total=kmRodados/12;
                JOptionPane.showMessageDialog(null,"O consumo estimado é "+total);
            }
            case 'b':{
                total=kmRodados/9;
                JOptionPane.showMessageDialog(null,"O consumo estimado é "+total);
            }
            case 'a':{
                total=kmRodados/8;
                JOptionPane.showMessageDialog(null,"O consumo estimado é "+total);
            }
        }





    }
}
