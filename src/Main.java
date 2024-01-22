import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int selecionarOpcao = 0;
        double saldo = 0;

        System.out.println("Dados iniciais do cliente: ");

        System.out.print("\nNome:              ");
        String nome = sc.nextLine();
        System.out.print("\nTipo conta:        ");
        String tipoConta = sc.nextLine();
        System.out.print("\nSaldo inicial:  R$ ");
        saldo = sc.nextDouble();

        System.out.println("\n************************");
        System.out.println("\n \n");
        String menu = """
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opcao desejada:
                """;


        while (selecionarOpcao != 4) {
            System.out.println(menu);
            selecionarOpcao = sc.nextInt();
            if (selecionarOpcao == 1 ) {
                System.out.println("Saldo atual: " + saldo);
                System.out.println("\n");
            }
            else if (selecionarOpcao == 2) {
                System.out.print("Informe o valor a ser recebido: ");
                double valorRecebido = sc.nextDouble();
                saldo += valorRecebido;
                System.out.println("Saldo atual: " + saldo);
                System.out.println("\n");
            }
            else if (selecionarOpcao == 3) {
                System.out.println("Informe o valor a ser transferido: ");
                double valorRetirado = sc.nextDouble();
                if (valorRetirado > saldo) {
                    System.out.println("Saldo insuficiente!");
                    System.out.println("\n");
                }
                else {
                    saldo -= valorRetirado;
                    System.out.println("Saldo atual: " + saldo);
                    System.out.println("\n");
                }
            }
        }
        System.out.println("Atendimento encerrado!");
    }

}