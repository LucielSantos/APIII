package Aula11;

import java.util.Scanner;

public class Banco {
    Scanner read = new Scanner(System.in);

    public ContaCorrente setConta() {

        ContaCorrente conta = new ContaCorrente();

        Titular titular = new Titular();

        System.out.print("Nome do titular: ");
        titular.setNome (read.next().toUpperCase());

        System.out.print("CPF: ");
        titular.setCpf(read.nextInt());

        System.out.print("Idade: ");
        titular.setIdade(read.nextInt());

        conta.setTitular(titular);
        conta.setLimite();

        System.out.print("Saldo: R$ ");
        conta.setSaldo(read.nextDouble());

        System.out.print("Numero da Conta: ");
        conta.setNumeroConta(read.nextInt());

        System.out.print("Senha da conta: ");
        conta.setSenha(read.next());

        return conta;
    }
}
