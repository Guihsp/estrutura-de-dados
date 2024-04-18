package listaencadeada;

public class ListaEncadeada<T> {
	private No<T> inicio;
	private No<T> ultimo;
	private int tamanho;

	public void adiciona(T elemento) {
		No<T> celula = new No<T>(elemento);
		if (this.tamanho == 0) {
			this.inicio = celula;
		} else {
			this.ultimo.setProximo(celula);
		}
		this.ultimo = celula;
		this.tamanho++;
	}

	public void adicionaInicio(T elemento) {
		if (this.tamanho == 0) {
			No<T> novoNo = new No<>(elemento);
			this.inicio = novoNo;
			this.ultimo = novoNo;
		} else {
			No<T> novoNo = new No<T>(elemento, this.inicio);
			this.inicio = novoNo;
		}
		this.tamanho++;
	}

	public void adiciona(int posicao, T elemento) {
		if (posicao < 0 || posicao > this.tamanho) {
			throw new IllegalArgumentException("Posicao invalida");
		}

		if (posicao == 0) {
			this.adicionaInicio(elemento);
		} else if (posicao == this.tamanho) {
			this.adiciona(elemento);
		} else {
			No<T> noAnterior = this.buscaNo(posicao);
			No<T> proximoNo = noAnterior.getProximo();
			No<T> novoNo = new No<>(elemento, proximoNo);
			noAnterior.setProximo(novoNo);
			this.tamanho++;

		}
	}
	
	public T removeInicio () {
		if(this.tamanho == 0) {
			throw new RuntimeException("LIsta esta vazia");
		}
		 
		T removido = this.inicio.getElemento();
		this.inicio = this.inicio.getProximo();
		this.tamanho--;
		
		if (this.tamanho == 0) {
			this.ultimo = null;
		}
		return removido;
	}

	public T removeFinal() {
		if(this.tamanho == 0) {
			throw new RuntimeException("LIsta esta vazia");
		}
		
		if (this.tamanho == 1) {
			return this.removeInicio();
		}
		
		No<T> penultimoNo = this.buscaNo(this.tamanho -2);
		T removido = penultimoNo.getProximo().getElemento();
		
		penultimoNo.setProximo(null);
		this.ultimo =penultimoNo;
		this.tamanho--;
		
		return removido;
	}
	
	public void limpa() {
		for (No<T> atual = this.inicio; atual != null;) {
			No<T> proximo = atual.getProximo();
			atual.setProximo(null);
			atual.setElemento(null);
			atual = proximo;
		}

		this.inicio = null;
		this.ultimo = null;
		this.tamanho = 0;
	}

	public No<T> buscaNo(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}

		No<T> atual = this.inicio;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}

		return atual;
	}

	public int buscaPosicao(T elemento) {
		No<T> atual = this.inicio;
		int POS = 0;

		while (atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return POS;
			}
			POS++;
			atual = atual.getProximo();
		}

		return -1;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		if (this.tamanho == 0) {
			return "[]";
		}

		StringBuilder s = new StringBuilder();

		s.append("[");
		
		No<T> atual = this.inicio;

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(atual.getElemento()).append(", ");
			atual = atual.getProximo();
		}
		s.append(atual.getElemento());
		
		s.append("]");
		return s.toString();
	}

}
