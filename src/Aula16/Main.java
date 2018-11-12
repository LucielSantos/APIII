package Aula16;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Animal a= new Animal("Porco");
        Mamifero m= new Mamifero("Gato",6);
        Aves av = new Aves("Quero-Quero",true);
        Cachorro c= new Cachorro("Boris",6);

        c.comer("Ração");
        c.latir();
        System.out.println(c.toString());

    }
}
