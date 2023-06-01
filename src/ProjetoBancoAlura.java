import java.util.Scanner;

public class ProjetoBancoAlura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nome = "Denner Matheus";
        String conta = "Corrente";
        double saldoEmConta = 2500.00;
        int attSaldo = 0;
        int opcao = 0;
        boolean loop = true;

        //Print da tela inicial informando alguns dados sobre a conta
        System.out.println("*****************************");
        System.out.println("Dados Iniciais do cliente");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo da conta: R$" + saldoEmConta);
        System.out.println("*****************************");

        while (loop) {
            //opções de operações na conta
            System.out.println("\nOperações");
            System.out.println("\n1- Consultar saldo");
            System.out.println("2- Receber depósito");
            System.out.println("3- Efetuar Transferência");
            System.out.println("4- Sair");
            System.out.println("\nDigite a opção desejada");
            opcao = leitura.nextInt();
            if (opcao < 1 || opcao > 4 ){
                System.out.println("Opção inexistente, tente novamente");
            }else{
            switch (opcao) {
                case 1:
                    System.out.println("O seu Saldo atual é de: R$" + saldoEmConta);
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito");
                    saldoEmConta += leitura.nextInt();
                    System.out.println("Novo saldo em conta: R$" + saldoEmConta);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido");
                    attSaldo = leitura.nextInt();
                    if (attSaldo > saldoEmConta){
                        System.out.println("Valor de transferência maior que o saldo da conta, não é possível finalziar a transferência");
                    } else {
                        saldoEmConta -= attSaldo;
                        System.out.println("Novo saldo em conta: R$" + saldoEmConta);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado pela preferência, tenha um Bom Dia!");
                    loop = false;
                    break;
                }
            }
        }
    }
}
