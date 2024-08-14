public class Celula {

    public Aviao elemento;
    public Celula prox;

    public Celula() {

    }

    public Celula(Aviao x) {
        this.elemento = x;
        this.prox = null;
    }
}
