public class ListaFlexivel {

    private Celula primeiro, ultimo;

    public ListaFlexivel() {
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public void inserirInicio(Site x) {
        Celula tmp = new Celula(x);
        tmp.prox = primeiro.prox;
        primeiro.prox = tmp;
        if (primeiro == ultimo) {
            ultimo = tmp;
        }
        tmp = null;
    }

    public void inserirFim(Site x) {
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }

    public Site removerInicio() throws Exception {
        if (primeiro == ultimo)
            throw new Exception("Erro!");
        Celula tmp = primeiro;
        primeiro = primeiro.prox;
        Site elemento = primeiro.elemento;
        tmp.prox = null;
        tmp = null;
        return elemento;
    }

    public Site removerFim() throws Exception {
        if (primeiro == ultimo)
            throw new Exception("Erro!");
        Celula i;
        for (i = primeiro; i.prox != ultimo; i = i.prox)
            ;
        Site elemento = ultimo.elemento;
        ultimo = i;
        ultimo.prox = null;
        i = null;
        return elemento;
    }

    public void inserir(Site x, int pos) throws Exception {
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

    public Site remover(double pos) throws Exception {
        Site elemento;
        int tamanho = tamanho();

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
            System.out.print(i.elemento + " ");

        }
        System.out.print("]");

    }

    public boolean isVazia() {
        return primeiro == ultimo;
    }

    public String pesquisarLink(String nomeSite) {

        Celula i = primeiro;
       
 while (i != ultimo) {
            if (i.elemento.getNome().equalsIgnoreCase(nomeSite)) {
                String link = i.elemento.getLink();
                inserirInicio(i.elemento);
                return link;
            }
            i = i.prox;
        }

        return "Site não encontrado na lista!";

    }

}