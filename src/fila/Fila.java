package fila;

import estruturaestatica.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
	
	public Fila () {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfilerar(T elemento) {
		super.adiciona(elemento);
	}
	
	public T desenfilera() {
		final int POS = 0;
		
		if(estaVazia()) {
			return null;
		}
		
		T elementoInicio = this.elementos[POS];
		super.remove(POS);
		
		return elementoInicio;
	}
	
	public T espiar () {
		return this.elementos[0];
	}
	

}
