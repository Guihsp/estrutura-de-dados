public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha (){
        super();
    }

    public void empilar(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        if (this.estaVazia()) {
            return null;
        } else {
            return this.elementos[tamanho-1];
        }
    }

    public T desempilar() {
        if (this.estaVazia()) {
            return null;
        }
        T elemento = this.elementos[tamanho-1];
        tamanho--;
        return elemento;
    }
}
