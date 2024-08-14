public class PilhaFlexivel {
    private Celula topo;

    public PilhaFlexivel() {
        topo = null;
    }

    public void inserir(char x) {
        Celula tmp = new Celula(x);
        tmp.prox = topo;
        topo = tmp;
        tmp = null;
    }

    public char remover() throws Exception {
        if (topo == null)
            throw new Exception("Pilha vazia!");
        char elemento = topo.elemento;
        Celula tmp = topo;
        topo = topo.prox;
        tmp.prox = null;
        tmp = null;
        return elemento;
    }

    public boolean vazia() {
        return topo == null;
    }
}
