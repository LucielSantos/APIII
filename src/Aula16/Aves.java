package Aula16;

public class Aves extends  Animal{


    public Aves(String  n){
        super(n);

    }

    public Aves(String  n, boolean pb){

        super(n);
        possuiBico=pb;

    }
    public boolean possuiBico;

}