package Aula16;

public class Cachorro extends Mamifero{


    public Cachorro(String n, int qtd){
        super(n,qtd);
    }

    public void comer(){
        super.comer();

        System.out.println("Cachorro comendo");
    }

    public void comer(String algumacoisa){
        super.comer();
        System.out.println("Cachorro comendo"+ algumacoisa);
    }


    public void latir(){

        System.out.println("au au");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "glandulasMamarias=" + glandulasMamarias +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}
