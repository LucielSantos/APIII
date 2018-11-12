package Exercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Pessoa> array= new ArrayList();

        Gerente gerente = new Gerente();

        array.add(gerente.addCliente());
        array.add(gerente.addTecnico());
        array.add(gerente);

        System.out.println(array.get(0).toString());
        System.out.println(array.get(1).toString());
        System.out.println(array.get(2).toString());

        System.out.println(array.get(0) instanceof Gerente);
        System.out.println(array.get(1) instanceof Gerente);
        System.out.println(array.get(2) instanceof Gerente);
    }
}
