import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma expressão para verificar se os delimitadores são válidos:");
        String expressao = scanner.nextLine();

        int resultado = Expressao.verificaExpressao(expressao);

        if (resultado == 1) {
            System.out.println("A expressão é válida.");
        } else {
            System.out.println("A expressão é inválida.");
        }

        scanner.close();
    }
}