import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Solicitação de dados
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor didite o numero da conta !");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor digite o nome e o sobrenome");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o saldo inicial para a abertura da conta");
        double saldo = scanner.nextDouble();

        //imprimindo os dados 
        String mensagem = String.format("Olá %s, obrigada por criar uma conta no nosso banco, abaixo estão seus dados bancarios.\n " + "agência: %s\n id: %d\n saldo disponivel para saque: R$ %.2f )", nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);
        
        scanner.close();
        
        
    }

}
