public class PilhaChar {
    private int topo;
    private char[] dado;
    private int MAX;

    // Construtor
    public PilhaChar(int n) {
        this.MAX = n;
        this.dado = new char[MAX];
        this.topo = -1;
    }

    // Retorna o elemento no topo da pilha
    public char topo() {
        if (vazia() == 1) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return dado[topo];
    }

    // Verifica se a pilha está vazia
    public int vazia() {
        return topo == -1 ? 1 : 0;
    }

    // Verifica se a pilha está cheia
    public int cheia() {
        return topo == MAX - 1 ? 1 : 0;
    }

    // Empilha um elemento
    public void empilha(char elemento) {
        if (cheia() == 1) {
            throw new IllegalStateException("A pilha está cheia.");
        }
        dado[++topo] = elemento;
    }

    // Desempilha um elemento
    public char desempilha() {
        if (vazia() == 1) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return dado[topo--];
    }
}
