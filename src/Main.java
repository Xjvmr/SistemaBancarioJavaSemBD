import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadastro c = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo");
        int escolha = -1;
        while (escolha != 0) {
            System.out.println();
            System.out.println("1 - Cadastrar\n2 - Login\n0 - Sair");
            System.out.print("Escolha: ");
            escolha = Integer.parseInt(scanner.nextLine());
            if (escolha == 1) {
                c.cadastrarUsuario(scanner);
            } else if (escolha == 2) {
                c.loginUsuario(scanner);
            } else if (escolha == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
