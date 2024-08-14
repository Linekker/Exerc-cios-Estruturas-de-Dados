public class Celula {
    public Cliente elemento;
    public Celula prox;

    public Celula() {
        this(null);
    }

    public Celula(Cliente x) {
        this.elemento = x;
        this.prox = null;
    }

}
