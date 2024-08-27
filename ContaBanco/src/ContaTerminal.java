import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.next();

        System.out.println("Por favor informe o seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor informe a agencia");
        String agencia = scanner.next();

        System.out.println("Por favor informe o numero da agencia");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor informe o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + " conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
