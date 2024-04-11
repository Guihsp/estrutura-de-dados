public class App {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        Contato c1 = new Contato("Contato 1", "contato1@gmail.com", "1234-5678");
        Contato c2 = new Contato("Contato 2", "contato2@gmail.com", "1234-5678");
        Contato c3 = new Contato("Contato 3", "contato3@gmail.com", "1234-5678");

        try {
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor);
    }
}
