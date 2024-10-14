public class Expressao {
    public static int verificaExpressao(String expressao) {
        PilhaChar pilha = new PilhaChar(expressao.length());

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(' || caractere == '{' || caractere == '[') {
                pilha.empilha(caractere);
            } else if (caractere == ')' || caractere == '}' || caractere == ']') {
                if (pilha.vazia() == 1) {
                    return 0; // Inválida
                }
                char topo = pilha.desempilha();
                if (!correspondem(topo, caractere)) {
                    return 0; // Inválida
                }
            }
        }

        return pilha.vazia() == 1 ? 1 : 0; // Válida se a pilha está vazia no final
    }

    private static boolean correspondem(char abre, char fecha) {
        return (abre == '(' && fecha == ')') ||
                (abre == '{' && fecha == '}') ||
                (abre == '[' && fecha == ']');
    }

    public static void main(String[] args) {
        System.out.println(verificaExpressao("(1+5)*(56+12)")); // Válida => 1
        System.out.println(verificaExpressao("(1+5)*)56+12)")); // Inválida => 0
        System.out.println(verificaExpressao("(1+5)*[56+12)")); // Inválida => 0
        System.out.println(verificaExpressao("(((1+2) - 3 )* 6)")); // Válida => 1
    }
}
