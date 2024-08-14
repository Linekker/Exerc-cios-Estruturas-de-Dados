public class Celula {
    public double elemento;
    public Celula prox;

    public Celula() {
        this(0);
    }

    public Celula(double x) {
        this.elemento = x;
        this.prox = null;
    }

}
