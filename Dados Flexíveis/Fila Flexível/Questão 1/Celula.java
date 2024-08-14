public class Celula {
    public String elemento;
    public Celula prox;

    public Celula() {
        this(" ");
    }

    public Celula(String x) {
        this.elemento = x;
        this.prox = null;
    }

}
