public class Fila<T> extends EstruturaEstatica<T> {
    public Fila (int capacidade) {
        super(capacidade);
    }

    public Fila() {
        super();
    }

    public void enfilerar(T elemento) {
        this.adiciona(elemento);
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfilera() {
        if (this.estaVazia()) {
            return null;
        }

        final int POS = 0;

        T elementosRemovido = this.elementos[POS];
        this.remove(POS);
        return elementosRemovido;
    }

}
