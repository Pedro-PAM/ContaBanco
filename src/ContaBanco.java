import java.util.Scanner;

public class ContaBanco {
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;

    // Construtor da classe ContaBanco
    public ContaBanco(int numero, String agencia, String nomeCliente, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Por favor, digite o número da agência:");
        Scanner scanner = new Scanner(System.in);
        String numeroAgencia = scanner.nextLine();        
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();         
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();        
        System.out.println("Por favor, digite o saldo inicial da conta:");
        float saldoInicial = scanner.nextFloat();        
        ContaBanco conta = new ContaBanco(numeroConta, numeroAgencia, nomeCliente, saldoInicial);
        
        System.out.println("\nConta bancária criada com sucesso:");
        System.out.println("Número da conta: " + conta.numero);
        System.out.println("Agência: " + conta.agencia);
        System.out.println("Nome do cliente: " + conta.nomeCliente);
        System.out.println("Saldo inicial: " + conta.saldo);
    }
}
