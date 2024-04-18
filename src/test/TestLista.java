package test;

import lista.Lista;

public class TestLista {

	public static void main(String[] args) {
		Lista<String> list = new Lista<String>(5);
		list.adiciona("Elemento 1");
		list.adiciona("Elemento 2");
		list.adiciona("Elemento 3");
		list.adiciona("Elemento 4");
		list.adiciona("Elemento 5");

		System.out.println(list);
		

		list.limpar();
		
		System.out.println(list);
	}
}
