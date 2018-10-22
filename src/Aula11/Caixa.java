package Aula11;

public class Caixa {
    public static void main(String[] args) {
        Banco banco = new Banco();

        System.out.println("Conta 1");
        ContaCorrente c1 = banco.setConta();
        System.out.println("----------------------------");
        System.out.println("Conta 2");
        ContaCorrente c2 = banco.setConta();

        System.out.println("----------------------------");

        System.out.println("Igual? ");
        System.out.println(c1.equals(c2));

        System.out.println("Limite: ");
        System.out.println(c1.getLimite());
        System.out.println(c2.getLimite());

        System.out.println("Sacou? ");
        System.out.println(c1.sacar(250));
        System.out.println(c2.sacar(250));

        System.out.println("Saldo: ");
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

        System.out.println("Sacou? ");
        System.out.println(c1.transferir(c2, 250));

        System.out.println("Saldo: ");
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}
