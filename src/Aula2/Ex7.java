package Aula2;

import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {

        double valorTransacao;
        double valorVenal;
        double percentual;
        double valorImposto;

        String leitura= JOptionPane.showInputDialog("Insira o Valor da Transação em R$");
        valorTransacao= Double.parseDouble(leitura);

        String leitura2= JOptionPane.showInputDialog("Insira o Valor Venal em R$");
        valorVenal= Double.parseDouble(leitura2);

        String leitura3= JOptionPane.showInputDialog("Insira o Percentual de imposto");
        percentual= Double.parseDouble(leitura3);

        if (valorTransacao>valorVenal) {
            valorImposto = valorTransacao*percentual/100;
        }
        else {
            valorImposto = valorVenal*percentual/100;
        }

        JOptionPane.showMessageDialog(null, "Valor do Imposto: R$"+valorImposto);
    }
}