package Aula11;

import java.util.Objects;

public class Titular {
    private int cpf;
    private String nome;
    private int idade;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

}
