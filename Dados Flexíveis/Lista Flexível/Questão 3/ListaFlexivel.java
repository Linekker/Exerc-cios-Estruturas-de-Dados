public class ListaFlexivel {

    private Celula primeiro, ultimo;

    public ListaFlexivel() {
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public void inserirFim(int x) {
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }

    public boolean removerPeloID(int codigoAluno) {
        Celula anterior = primeiro;
        Celula atual = primeiro.prox;

        while (atual != null) {
            if (atual.elemento == codigoAluno) {
                anterior.prox = atual.prox;

                if (atual == ultimo) {
                    ultimo = anterior;
                }

                atual.prox = null;
                atual = null;

                return true;
            }

            anterior = atual;
            atual = atual.prox;
        }

        return false;
    }

    public void mostrar() {
        System.out.print("[");
        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            System.out.print(i.elemento + " ");

        }
        System.out.print("]");

    }

    public boolean pesquisar(int id) {

        boolean teste = false;

        for (Celula i = primeiro.prox; i != null; i = i.prox) {

            if (i.elemento == id) {
                teste = true;
            }
        }

        return teste;

    }

}