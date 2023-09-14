import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //importando scanner
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Por favor, agora digite o número da agência: ");
        agencia = scanner.next();
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
