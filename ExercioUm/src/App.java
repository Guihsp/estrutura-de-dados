import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        int temp[] = new int[7], media = 0;

        for (int i = 0; i < temp.length; i++) {
            System.out.print("Digite a temperatura do dia " + (i+1) + ": ");
            temp[i] = input.nextInt();
            media += temp[i];
        }

        media /= temp.length;

        System.out.println("A média das temperaturas foi de " + media + "°C.");
        int acimaMedia = 0, abaixoMedia = 0;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > media) {
                acimaMedia++;
            } 
            
            if (temp[i] < media) {
                abaixoMedia++;
            }
        }

        System.out.println("Dias com temperatura acima da média: " + acimaMedia);
        System.out.println("Dias com temperatura abaixo da média: " + abaixoMedia);

    }
}
