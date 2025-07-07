import java.util.Scanner;

public class AccountTerminal {
    public static void main(String[] args)  {
   /**
         * To do:
         * - importar classe Scanner
         * - exibir mensagens para usuario
         * - obter pelo scanner os valores digitados no terminal
         * - exibir a mensagem 'conta criada com sucesso'.
         */

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Bem-vindo ao Banco Java!");

        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Digite o número da agência: ");
        agencia = scanner.next();

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.print("Digite o saldo da conta: ");
        saldo = scanner.nextFloat();

        scanner.close();
        
        System.out.println("-----------------------------------");
        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência e conta sãa respectivamente "
                + agencia + " e " + numero + ". Seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
