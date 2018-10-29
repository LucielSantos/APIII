package Aula13;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ContaCorrente conta= new ContaCorrente();

        ArrayList<ContaCorrente> lista= new ArrayList<>();

        String resposta="";
        boolean resp=false;
        while (!resp){
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
                    if (!verif) {
                        lista.add(aux);
                        System.out.println("Conta Criada");
                    }else {
                        System.out.println("Conta já criada");
                    }
                    System.out.println("-----");
                    break;

                case "2":
                    System.out.print("Número da Conta :");
                    int nConta= conta.tc.nextInt();
                    tam=lista.size()-1;
                    while (tam>=0){
                        verif=lista.get(tam).equalsNConta(nConta);
                        if (!verif){
                            System.out.println("Não há conta com este número");
                        }else {
                            lista.get(tam).mostraSaldo();
                        }
                        tam--;
                    }
                    break;

                case "3":
                    System.out.print("Número da Conta :");
                    nConta= conta.tc.nextInt();
                    tam=lista.size()-1;
                    while (tam>=0){
                        verif=lista.get(tam).equalsNConta(nConta);
                        if (!verif){
                            System.out.println("Não há conta com este número");
                        }else {
                            System.out.print("Digite o valor a ser sacado:");
                            int saque= conta.tc.nextInt();
                            verif=lista.get(tam).sacar(saque);
                            if (!verif){
                                System.out.println("Não foi possível fazer saque, Sem Limite!");
                            }else {
                                System.out.println("Saque realizado com sucesso!");
                            }
                        }
                        tam--;
                    }
                    break;

                case "4":
                    System.out.print("Número da Conta :");
                    nConta= conta.tc.nextInt();
                    tam=lista.size()-1;
                    while (tam>=0){
                        verif=lista.get(tam).equalsNConta(nConta);
                        if (!verif){
                            System.out.println("Não há conta com este número");
                        }else {
                            System.out.print("Digite o Valor: ");
                            int valor= conta.tc.nextInt();
                            lista.get(tam).deposito(valor);
                        }
                        tam--;
                    }
                    break;

                case "5":
                    System.out.print("Número da Conta de origem:");
                    int nConta1= conta.tc.nextInt();
                    System.out.print("Número da conta de destino: ");
                    int nConta2= conta.tc.nextInt();
                    tam=lista.size()-1;
                    while (tam>=0){
                        verif=lista.get(tam).equalsNConta(nConta1);
                        if (!verif){
                            System.out.println("Não há conta com este número");
                        }else {
                            System.out.print("Digite o valor a ser sacado:");
                            int saque= conta.tc.nextInt();
                            while (tam>=0){
                                verif=lista.get(tam).equalsNConta(nConta2);
                                if (!verif){
                                    System.out.println("Não há conta com este número");
                                }else {
                                    verif=lista.get(tam).sacar(saque);
                                    if (verif==true){
                                    lista.get(tam).deposito(saque);
                                        System.out.println("Saque realizado com sucesso!");
                                }else {
                                        System.out.println("Conta de origem sem Limite");
                                    }
                                tam--;
                            }
                            }
                        }
                        tam--;
                    }
                    break;
                case "0":
                    resp=true;
                    break;

                    default:
                        System.out.println("Comando não Encontrado!");
            }
        }

        System.out.println("Você saiu do programa!");

//        System.out.println(lista.toString());
//
//        System.out.println(lista.get(0).tansferecia(1000, lista.get(1)));
//
//        System.out.println(lista.toString());
//
//        for (int i=0;i<2;i++){
//            ContaCorrente aux= new ContaCorrente();
//            aux.ler();
//            int tam= lista.size()-1;
//            boolean coisa=true;
//            while (tam>=0){
//                coisa=aux.getTitular().equals(lista.get(tam).getTitular());
//                tam--;
//            }
//            if (!coisa) {
//                lista.add(aux);
//            }else {
//                System.out.println("ja criada");
//            }
//        }
//            System.out.println(lista.toString());


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
