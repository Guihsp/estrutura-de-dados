package test;

import pilha.Pilha;

public class TestPilha {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia());
		System.out.println(pilha.topo());
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		pilha.empilha(4);
		pilha.empilha(5);
		pilha.empilha(6);
		pilha.empilha(7);
		pilha.empilha(8);
		pilha.empilha(9);
		pilha.empilha(10);
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		pilha.desempilha();
		pilha.desempilha();
		
		System.out.println(pilha);		
		System.out.println(pilha.estaVazia());

		System.out.println("Elemento no Topo " + pilha.topo());
		
	}

}
