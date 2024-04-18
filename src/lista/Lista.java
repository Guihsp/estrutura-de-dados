package lista;

import estruturaestatica.EstruturaEstatica;

public class Lista<T> extends EstruturaEstatica<T>  {
	public Lista() {
		super();
	}
	
	public Lista(int capacidade) {
		super(capacidade);
	}
	
	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}
	
	public void adiciona(int posicao, T elemento) {
		super.adiciona(posicao, elemento);
	}
	
	public void limpar() {
		this.elementos = (T[]) new Object[this.elementos.length];
		this.tamanho =0;
	}
	
	public void remove(T elemento) {
		int POS = this.busca(elemento);
		if(POS > -1) {
			this.remove(POS);
		}
	}

	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("Possição invalida");
		}

		return this.elementos[posicao];
	}
	
	public int busca(T elemento) {
		for(int i = 0; i < tamanho; i++) {
			if(elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean contem(T elemento) {
		return busca(elemento) > -1 ;
	}
	
	public int ultimoIndice (T elemento) {
		int ultimaPos = -1;
		
		for(int i = 0; i < this.tamanho ; i++) {
			if(elementos[i].equals(elemento)) {
				ultimaPos=i;
			}
		}
		return ultimaPos;
	}
}
