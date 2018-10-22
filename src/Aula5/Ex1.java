package Aula5;

public class Ex1 {
    public static void main(String[] args) {


        int data[]= new int[4];
        String saida="";

        for (int i=0; i<data.length;i++){
            data[i]=i;
            saida=saida+data[i];
            if (i<3){
                saida=saida+", ";
            }
        }
        System.out.println("{"+saida+"}");
    }
}
