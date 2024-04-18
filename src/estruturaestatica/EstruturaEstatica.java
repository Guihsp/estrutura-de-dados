package estruturaestatica;

public class EstruturaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;
	
	public EstruturaEstatica (int capacidade) {
		this.elementos = (T[]) new Object [capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {
		this(10);
	}
	
	protected boolean adiciona (T elemento) {
		this.aumentaCapacidade();
		if ( this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	
	protected void adiciona(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("Posição invalida");
		}
		
		this.aumentaCapacidade();
		for (int i = this.tamanho-1; i >= posicao; i--) {
			elementos[1+i] = elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;	
	}
	
	private void aumentaCapacidade() {
		if ( this.tamanho == this.elementos.length ) {
			T[] novoArray = (T[]) new Object[this.elementos.length *2];
			for (int i = 0; i < elementos.length; i++) {
				novoArray[i] = this.elementos[i];
			}
			
			this.elementos = novoArray;
		}
	}     
	
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("Posição invalida");
		}
		
		for (int i = posicao; i < this.tamanho-1; i++) {
			elementos[i] = elementos[i+1];
		}
		this.tamanho--;
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		
		for (int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
}
