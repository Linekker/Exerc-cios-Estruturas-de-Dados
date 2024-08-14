public class CelulaDupla {
    public String elemento;
    public CelulaDupla prox;
    public CelulaDupla ant;

    public CelulaDupla() {
        this("");
    }

    public CelulaDupla(String x) {
        this.elemento = x;
        this.prox = null;
        this.ant = null;
    }
}
