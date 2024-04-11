public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor =  new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        int aux, k;

        // for (int i = 0; i < vetor.length; i++) {
        //     for (int j = i + 1; j < vetor.length; j++) {
        //         if (vetor[i] > vetor[j]) {
        //             aux = vetor[j];
        //             vetor[j] = vetor[i];
        //             vetor[i] = aux;
        //         }
        //     }
        // }

        for (int i = 0; i < vetor.length; i++) {
            aux =vetor[i];
            k = i - 1;
            while (k >= 0 && vetor[k] > aux ) {
                vetor[k + 1] = vetor[k];
                k--;
            }

            vetor[k-1] = aux;
        }


        

    }
}
