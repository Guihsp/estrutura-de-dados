package test;

import fila.Fila;

public class TestFila {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		
		System.out.println(fila.estaVazia());
		
		fila.enfilerar(1);
		fila.enfilerar(5);
		fila.enfilerar(2);
		fila.enfilerar(3);
		fila.enfilerar(4);
		
		System.out.println(fila);
		
		
	}

}
