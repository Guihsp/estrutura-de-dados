public class App {
    public static void main(String[] args) throws Exception {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());

        for (int i = 1; i <= 15; i++) {
            pilha.empilar(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());    
    }
}
