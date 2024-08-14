
public class ListaFlexivel {

    private Celula primeiro, ultimo;

    public ListaFlexivel() {
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public void inserirInicio(double x) {
        Celula tmp = new Celula(x);
        tmp.prox = primeiro.prox;
        primeiro.prox = tmp;
        if (primeiro == ultimo) {
            ultimo = tmp;
        }
        tmp = null;
    }

    public void inserirFim(double x) {
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }

    public double removerInicio() throws Exception {
        if (primeiro == ultimo)
            throw new Exception("Erro!");
        Celula tmp = primeiro;
        primeiro = primeiro.prox;
        double elemento = primeiro.elemento;
        tmp.prox = null;
        tmp = null;
        return elemento;
    }

    public double removerFim() throws Exception {
        if (primeiro == ultimo)
            throw new Exception("Erro!");
        Celula i;
        for (i = primeiro; i.prox != ultimo; i = i.prox)
            ;
        double elemento = ultimo.elemento;
        ultimo = i;
        ultimo.prox = null;
        i = null;
        return elemento;
    }

    public void inserir(double x, int pos) throws Exception {
        int tamanho = tamanho();
        if (pos < 0 || pos > tamanho) {
            throw new Exception("Erro!");
        } else if (pos == 0) {
            inserirInicio(x);
        } else if (pos == tamanho) {
            inserirFim(x);
        } else {
            Celula i = primeiro;
            for (int j = 0; j < pos; j++, i = i.prox)
                ;
            Celula tmp = new Celula(x);
            tmp.prox = i.prox;
            i.prox = tmp;
            tmp = null;
            i = null;
        }
    }

    public double remover(double pos) throws Exception {
        double elemento, tamanho = tamanho();
        if (primeiro == ultimo || pos < 0 || pos >= tamanho) {
            throw new Exception("Erro!");
        } else if (pos == 0) {
            elemento = removerInicio();
        } else if (pos == tamanho - 1) {
            elemento = removerFim();
        } else {
            Celula i = primeiro;
            for (int j = 0; j < pos; j++, i = i.prox)
                ;
            Celula tmp = i.prox;
            elemento = tmp.elemento;
            i.prox = tmp.prox;
            tmp.prox = null;
            tmp = null;
            i = null;
        }
        return elemento;
    }

    public int tamanho() {

        int tamanho = 0;
        for (Celula i = primeiro; i != ultimo; i = i.prox)
            tamanho++;
        return tamanho;
    }

    public void mostrar() {
        System.out.print("[");
        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            System.out.print(i.elemento + " - ");

        }
        System.out.print("]");

    }

    public int pesquisar(double temperatura) {
        int quantidade = 0;
        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            if (i.elemento == temperatura) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public boolean isVazia() {
        return primeiro == ultimo;
    }

}