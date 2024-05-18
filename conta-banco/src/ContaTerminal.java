import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da conta!");
        //Obter pela scanner os valores digitados no terminal
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        scanner.nextLine(); // consome a linha restante após ler o número da conta
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.nextLine();

        double saldo = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Por favor, digite o saldo inicial!");
                saldo = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido para o saldo inicial!");
                scanner.next(); // descarta a entrada inválida
            }
        }

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
