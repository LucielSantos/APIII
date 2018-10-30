package Aula13;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    Scanner tc = new Scanner(System.in);

    private String CPF;
    private String nome;
    private int idade;
    private String dataNascimento;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isCPF(String CPF) {
        if (CPF.equals("00000000000") ||
                CPF.equals("11111111111") ||
                CPF.equals("22222222222") || CPF.equals("33333333333") ||
                CPF.equals("44444444444") || CPF.equals("55555555555") ||
                CPF.equals("66666666666") || CPF.equals("77777777777") ||
                CPF.equals("88888888888") || CPF.equals("99999999999") ||
                (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48);
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else dig11 = (char)(r + 48);
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                return(true);
            else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }

    public String imprimeCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
                CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(CPF, cliente.CPF);
    }

    public boolean verifCpf(ContaCorrente conta, ArrayList<ContaCorrente> array){
        System.out.println("tamanho: "+array.size());
        boolean verif=false;
        int tam= array.size()-1;
        while (tam>=0){
            verif=conta.getTitular().equals(array.get(tam).getTitular());
            tam --;
        }
        return verif;
    }

    public void ler() {
        boolean verif = false;
        while (!verif){
            System.out.print("Digite o seu CPF (sem caracteres especiais): ");
            String cpf = tc.next();
             if (this.isCPF(cpf)) {
                this.setCPF(imprimeCPF(cpf));
                verif= true;
            } else {
                System.out.println("CPF Inválido!");
                verif=false;
            }
        }

        System.out.print("Digite o seu Nome: ");
        this.setNome(tc.next());

        verif=false;
        while (!verif){
            System.out.print("Digite a seua Idade: ");
            int num=tc.nextInt();
            if (num>=16){
                this.setIdade(num);
                verif=true;
            }else {
                System.out.println("Só é possivel criar conta para maiores de 16 anos");
            }
        }

        System.out.print("Digite a sua Data de Nascimento: ");
        this.setDataNascimento(tc.next());
    }

    public void mostrar(){
        System.out.println(this.nome);
        System.out.println(this.CPF);
        System.out.println(this.idade);
    }

    @Override
    public String toString() {
        return "{" +
                "CPF='" + CPF + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
