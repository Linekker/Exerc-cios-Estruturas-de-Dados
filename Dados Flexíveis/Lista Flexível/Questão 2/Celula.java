public class Celula {
    public Site elemento;
    public Celula prox;

    public Celula() {
        this(null);
    }

    public Celula(Site x) {
        this.elemento = x;
        this.prox = null;
    }

}