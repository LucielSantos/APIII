package Aula13;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ContaCorrente conta= new ContaCorrente();

        ArrayList<ContaCorrente> lista= new ArrayList<>();

        for (int i=0;i<2;i++){
            ContaCorrente aux= new ContaCorrente();
            aux.ler();
            lista.add(aux);
        }
            System.out.println(lista.toString());


//        lista.add(douglas);
//        lista.add(0,julia);
//        lista.remove(douglas);
//        lista.remove(0);
//        lista.size();
//        lista.contains(julia);
//        lista.get(0).getTitular().equals(julia.getTitular());
//        lista.indexOf(julia);
//        lista.isEmpty();

    }
}
