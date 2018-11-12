package Aula16;

public class Mamifero extends Animal{
    public int glandulasMamarias;


    public Mamifero(String n,int gm){
        super(n);
        glandulasMamarias = gm;

    }

    public void comer(){
        System.out.println("Mamifero comendo");
    }
    public void mamar(){
        System.out.println("Beber leite");
    }

}
