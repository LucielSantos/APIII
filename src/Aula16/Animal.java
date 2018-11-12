package Aula16;

public class Animal  {
    protected String nome;
    public float peso;
    private float altura;

    public Animal(String n){
        this.nome=n;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void comer(){
        System.out.println("Animal comer");
    }
    public void movimentar(){
        System.out.println("Animal movimentou-se");
    }




}