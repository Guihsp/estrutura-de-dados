package pilha.exercicios;

import java.util.Scanner;

import pilha.Pilha;

public class Exer01 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um numero: ");
			int num = input.nextInt();

			if (num % 2 == 0) {
				pilha.empilha(num);
			}

			if (num % 2 != 0) {
				Integer desempilhado = pilha.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha esta vazia");
				} else {
					System.out.println("Numero impar, desempilhando elemento: " + desempilhado);
				}
			}
		}	
		
		input.close();

		System.out.println("Desempilhando numeros da pilha");

		while (!pilha.estaVazia()) {
			System.out.println("Numero impar, desempilhando elementos : " + pilha.desempilha());
		}

		System.out.println("Todos os elementos forma desempilhados!");
	}

}
