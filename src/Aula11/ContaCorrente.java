package Aula11;

import java.util.Objects;

public class ContaCorrente {
    Titular titular= new Titular();
    private double saldo;
    private double limite;
    private int numeroConta;
    private String senha;

    public boolean sacar(double saque){
        if (this.saldo + limite >=saque){
            this.saldo -= saque;
            return true;
        }else {
            return false;
        }
    }

    public boolean deposito (double deposito){
        this.saldo+=deposito;
        return true;
    }
    public boolean transferir(ContaCorrente destino, double valor){
        if (this.sacar(valor)){
            return  destino.deposito(valor);
        }else {
            return false;
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite() {
        if (titular.getIdade()>60){
            limite=300;
        }else {
            limite=200;
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getSenha() {
        return senha;
    }

    public boolean setSenha(String senha) {
        if (senha.length()>10) {
            this.senha = senha;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente that = (ContaCorrente) o;
        return Objects.equals(titular.getCpf(), that.titular.getCpf());
    }
}