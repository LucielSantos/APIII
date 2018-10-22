package Aula4;

import java.text.DecimalFormat;

public class Teste {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.ceil(10.2)); //arredonda pra cima
        System.out.println(Math.ceil(10.7)); //arredonda pra cima
        System.out.println(Math.round(10.7)); //aredonta corretamente
        System.out.println(Math.round(10.2)); //aredonta corretamente
        System.out.println(Math.floor(10.2)); //arredonda pra biaxo
        System.out.println(Math.floor(10.7)); //arredonda pra baixo
        System.out.println(Math.max(10,20)); //mostra maior valor dentre os dois
        int sorteio= (int) (Math.random()*10); //numero randomico entre 0 e 10
        System.out.println(sorteio);// mostra o RANDOM
        System.out.println("-------");

    }
}
