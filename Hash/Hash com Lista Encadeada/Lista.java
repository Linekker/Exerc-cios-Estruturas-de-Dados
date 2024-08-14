package src;

public class Lista {

    private Celula primeiro, ultimo;

    public Lista() {
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public boolean pesquisar(int x) {
        boolean resp = false;
        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            if (i.elemento == x) {
                resp = true;
                i = ultimo;

            }
        }
        return resp;

    }

    public void inserirFim(int x) {
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;

    }

    public void remover(int numero) throws Exception {
        Celula anterior = primeiro;
        Celula atual = primeiro.prox;

        while (atual != null) {
            if (atual.elemento == numero) {
                if (atual == ultimo) {
                    ultimo = anterior;
                }
                anterior.prox = atual.prox;
                atual.prox = null;
                atual = anterior.prox;
            } else {
                anterior = atual;
                atual = atual.prox;
            }
        }
    }

}
