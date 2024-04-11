import java.util.Arrays;
public class VetorObjeto {
    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento) throws Exception {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            tamanho++;
        } else {
            throw new Exception("O vetor esta cheio");
        }
    }

    public void remove(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            for(int i=0; i < this.tamanho-1; i++){
                this.elementos[i] =this.elementos[i+1];
            }
            this.tamanho--;
        } else {
            throw new Exception("Posicao invalida");
        }
    }

    public boolean adicionaInicio(int posicao, Object elemento) throws Exception {
        this.aumentaCapacidade();
        if (posicao >= 0 && posicao < tamanho) {
            for(int i=this.tamanho-1; i>posicao; i--) {
                this.elementos[i+1] = this.elementos[i];
            }

            this.elementos[posicao] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Posicao invalida");
        }

        return true;
    }
    
    public int tamanho() {
        return this.tamanho;
    }

    public int buscar(Object elemento) throws Exception {
        for (int i =0; i < tamanho; i++ ){
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    private void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            Object[] novosElementos = new Object[this.elementos.length *2];
            for (int i=0; i < this.elementos.length; i++ ) {
                novosElementos[i] = this.elementos[i];
            }   
            this.elementos = novosElementos;
        }
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }

        if (this.tamanho> 0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }



}