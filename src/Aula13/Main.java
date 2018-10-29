package Aula13;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ContaCorrente conta= new ContaCorrente();

        ArrayList<ContaCorrente> lista= new ArrayList<>();

        String resposta="";

        while (!resposta.equals("0")){
            System.out.println("Menu do Programa: \n" +
                    "1- Criar Conta\n" +
                    "2- Mostrar Saldo\n" +
                    "3- Sacar\n" +
                    "4- Depositar\n" +
                    "5- Fazer Transferência\n" +
                    "0- Sair");

            System.out.print("Digite o número correspondente a operação: ");
            resposta=conta.tc.next();

            switch (resposta){
                case "1":
                    ContaCorrente aux= new ContaCorrente();
                    aux.ler();
                    int tam= lista.size()-1;
                    boolean verif=false;
                    while (tam>=0){
                        verif=aux.getTitular().equals(lista.get(tam).getTitular());
                        tam--;
                    }
                    if (verif==false) {
                        lista.add(aux);
                        System.out.println("Conta Criada");
                    }else {
                        System.out.println("ja criada");
                    }
                    System.out.println("-----");
                    break;
                case "2":
                    System.out.print("Número da Conta :");
                    int nConta= conta.tc.nextInt();
                    boolean verif2;
                    tam=lista.size()-1;
                    while (tam>=0){
                        verif2=lista.get(tam).equalsNConta(nConta);
                        if (!verif2){
                            System.out.println("Não há conta com este número");
                        }else {
                            lista.get(tam).mostraSaldo();
                        }
                        tam--;
                    }

            }

        }


        for (int i=0;i<2;i++){
            ContaCorrente aux= new ContaCorrente();
            aux.ler();
            lista.add(aux);
        }

        System.out.println(lista.toString());

        System.out.println(lista.get(0).tansferecia(1000, lista.get(1)));

        System.out.println(lista.toString());

        for (int i=0;i<2;i++){
            ContaCorrente aux= new ContaCorrente();
            aux.ler();
            int tam= lista.size()-1;
            boolean coisa=true;
            while (tam>=0){
                coisa=aux.getTitular().equals(lista.get(tam).getTitular());
                tam--;
            }
            if (!coisa) {
                lista.add(aux);
            }else {
                System.out.println("ja criada");
            }
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
