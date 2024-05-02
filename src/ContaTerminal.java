import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, insira o nome do cliente: ");
        String nomeCliente = scan.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = scan.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.print("Por favor, insira o saldo: ");
        Double saldoConta = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldoConta);
    }
}