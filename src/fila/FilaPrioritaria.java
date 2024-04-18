package fila;

public class FilaPrioritaria<T> extends Fila<T> {

	public void enfilerar(T elemento) {
		Comparable<T> chave = (Comparable<T>) elemento;
		int i;
		for ( i =0; i < this.tamanho; i++) {
			if(chave.compareTo(this.elementos[i]) < 0) {
				break;
			}
		}
		
		this.adiciona(i, elemento);
	}
}
