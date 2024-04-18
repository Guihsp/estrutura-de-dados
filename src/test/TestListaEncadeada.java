package test;

import listaencadeada.ListaEncadeada;

public class TestListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(4);
		
		System.out.println(lista);

		
		lista.adiciona(0, 0);
		System.out.println(lista);
 
		lista.adiciona(2, 3);
		lista.adiciona(4, 5);
		System.out.println(lista);
		
		lista.removeInicio();
		System.out.println(lista);
		
		lista.removeFinal();
		System.out.println(lista);

	}

}
