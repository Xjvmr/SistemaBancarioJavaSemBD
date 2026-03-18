import java.util.Scanner;

public class Cadastro {
    public int senha;
    String cpf;
    double saldo = 0;

    public void cadastrarUsuario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        cpf = scanner.nextLine();
        System.out.print("Senha (número): ");
        senha = Integer.parseInt(scanner.nextLine());
        System.out.println("confirme a senha: ");
        int confirmacaoSenha = Integer.parseInt(scanner.nextLine());
        if (senha != confirmacaoSenha) {
            System.out.println("Cadastro realizado. Bem-vindo, " + nome + "!");
        }else {
            System.out.println("As senhas não coincidem. Cadastro falhou.");
        }
    }
dsaadsawdsaw
    public void loginUsuario(Scanner scanner) {
        System.out.print("CPF: ");
        String lcpf = scanner.nextLine();
        System.out.print("Senha: ");
        int lsenha = Integer.parseInt(scanner.nextLine());
        if (lsenha == senha && lcpf.equals(cpf)) {
            System.out.println("Login realizado com sucesso!");
            saldoDaConta(scanner);
        } else {
            System.out.println("CPF ou senha incorretos.");
        }
    }

    public void saldoDaConta(Scanner scanner) {
        int escolha = -1;
        while (escolha != 0) {
            System.out.println();
            System.out.println("1-Ver saldo  2-Depositar  3-Sacar  0-Sair");
            System.out.print("Opção: ");
            escolha = Integer.parseInt(scanner.nextLine());
            if (escolha == 1) {
                System.out.print("Saldo: " + saldo);
            } else if (escolha == 2) {
                System.out.print("Valor para depositar: ");
                double v = Double.parseDouble(scanner.nextLine());
                if (v > 0) {
                    saldo += v;
                    System.out.print("Deposito OK. Saldo: " + saldo);
                } else {
                    System.out.println("Valor inválido.");
                }
            } else if (escolha == 3) {
                System.out.print("Valor para sacar: ");
                double v = Double.parseDouble(scanner.nextLine());
                if (v > 0 && v <= saldo) {
                    saldo -= v;
                    System.out.print("Saque OK. Saldo: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido.");
                }
            } else if (escolha == 0) {
                System.out.println("Voltando ao menu principal...");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
