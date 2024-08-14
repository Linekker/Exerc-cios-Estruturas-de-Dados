public class PilhaFlexivel {
    private Celula topo;

    public PilhaFlexivel() {
        topo = null;
    }

    public void inserir(double x) { // Inserir(5)
        Celula tmp = new Celula(x);
        tmp.prox = topo;
        topo = tmp;
        tmp = null;
    }

    public double remover() throws Exception {
        if (topo == null)
            throw new Exception("Erro!");
        double elemento = topo.elemento;
        Celula tmp = topo;
        topo = topo.prox;
        tmp.prox = null;
        tmp = null;
        return elemento;

    }

    public void mostrar() {
        System.out.print("[ ");
        for (Celula i = topo; i != null; i = i.prox) {
            System.out.print(i.elemento + " ");
        }
        System.out.println("]");
    }

}
