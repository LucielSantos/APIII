package Aula8;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Funcoes {
    Random rand= new Random();
    Scanner read= new Scanner(System.in);
    DecimalFormat formatarDia= new DecimalFormat("00");
    DecimalFormat formatarMes= new DecimalFormat("00");

    public String mesPt (int n){

        String mes []= {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return mes[n];
    }
    public String mesEn (int n){
        String mes []= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return mes[n];
    }
    public void contar(){
        for (int n=1; n<11; n++){
            System.out.print("|"+n+"|");
        }
        System.out.println("");
    }
    public void contar (int fim){
        for (int n= 1; n<=fim; n++){
            System.out.print("|"+n+"|");
        }
        System.out.println("");
    }
    public void contar (int inicio, int fim){
        for (int n= inicio; n<=fim; n++){
            System.out.print("|"+n+"|");
        }
        System.out.println("");
    }
    public void contar (int inicio, int fim, long tempo){
        for (int n= 1; n<=fim; n++){
            System.out.print("|"+n+"|");
            try {
                Thread.sleep(tempo*1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public int getDia (String data){
        char a, b;
        String diaString;
        int dia=0;

        a = (data.charAt(0));
        b = (data.charAt(1));

        diaString= a +""+ b;
        dia= Integer.parseInt(diaString);
        return dia;
    }
    public int getMes (String data){
        char a, b;
        String mesString;
        int mes=0;

        a = (data.charAt(3));
        b = (data.charAt(4));

        mesString= a +""+ b;
        mes= Integer.parseInt(mesString);
        return mes;
    }
    public int getAno (String data){
        char a, b,c,d;
        String anoString;
        int ano=0;

        a = (data.charAt(6));
        b = (data.charAt(7));
        c = (data.charAt(8));
        d = (data.charAt(9));

        anoString= a +""+ b+""+c+""+d;
        ano= Integer.parseInt(anoString);
        return ano;
    }
    public void randomVet (int tam, int limite){
        int vetor[]= new int[tam];
        Random rand= new Random();
        for (int i=0; i<tam; i++){
            vetor[i]=rand.nextInt(limite);
        }
        for (int i=0; i<tam; i++){
            System.out.print("| "+vetor[i]+" | ");
        }
    }
    public int retorno (int vet1[], int vet2[], int n){
        int resp=0;
        boolean verifVet1= false;
        boolean verifVet2= false;
        for (int i=0; i<vet1.length; i++){
            if (vet1[i]==n){
                verifVet1=true;
            }
        }
        for (int i=0; i<vet2.length; i++){
            if (vet2[i]==n){
                verifVet2=true;
            }
        }
        if (verifVet1==true){
            resp= 1;
        }
        if(verifVet2 == true){
            resp= resp+1;
        }
        return resp;
    }
    public String senha (int tamanho, int limite){
        Random rand= new Random();

        String n= "";
        int temp=0;
        for (int i=0; i<tamanho; i++){
            temp= rand.nextInt(limite);
            n= n + temp;
        }

        return n;
    }

//EX. DUPLAS
    public String lerString(String frase){
        System.out.print(frase);
        String resposta= read.nextLine();
        return resposta;
    }
    public int lerInt(String frase){
        System.out.print(frase);
        int resposta= read.nextInt();
        return resposta;
    }
    public float lerFloat(String frase){
        System.out.print(frase);
        float resposta= read.nextFloat();
        return resposta;
    }
    public double lerDouble(String frase){
        System.out.print(frase);
        double resposta= read.nextDouble();
        return resposta;
    }
    public char lerChar(String frase){
        System.out.print(frase);
        char resposta= read.next().charAt(0);
        return resposta;
    }
    public void validarEmail(){
        System.out.println("Digite seu E-mail: ");
        String email= read.nextLine();

        int resp= email.indexOf('@');
        if (resp > 0){
            System.out.println("E-mail Válido");
        }else {
            System.out.println("E-mail Inválido");
        }
    }
    public String validarData(String data){
        String resp;
        Date dataa = null;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            format.setLenient(false);
            dataa = format.parse(data);
            resp=data;
        } catch (ParseException e) {
            resp=null;
        }
        return resp;
    }
    public void formatData(String data){

        String temp[]= new String[3];

        try {
            temp=data.split("/");
            System.out.println(temp[1]+"/"+temp[0]+"/"+temp[2]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    public String validTelefone (){
        System.out.println("Digite seu Número de Telefone: ");
        String telefone= read.nextLine();
        int n= telefone.indexOf('-');
        int letras= telefone.length();
        String resp="";
        if (n >0){
            if (letras==13) {
                resp = telefone;
            }
        }else {
            resp= null;
        }
        return resp;
    }

    public void validarNumerico(String x){
        for (int i = 0; i < x.length(); i++) {
            if (Character.isDigit(x.charAt(i)))
            {
                System.out.println("Possui digito numérico");
                break;
            } else{
                System.out.println("Não possui digitos numéricos!!");
                break;
            }
        }
    }
}