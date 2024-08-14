
public class FilaFlexivel {
    private Celula primeiro, ultimo;

    public FilaFlexivel() {
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public void inserir(String x) {
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }

    public String remover() throws Exception {

        if (primeiro == ultimo) {
            throw new Exception("Erro! A Fila Está vazia");
        }

        Celula tmp = primeiro;
        primeiro = primeiro.prox;
        String elemento = primeiro.elemento;
        tmp.prox = null;
        tmp = null;

        return elemento;
    }

    public void mostrar() {
        System.out.print("[");
        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            System.out.print(i.elemento + " ");
        }
        System.out.print("]");
    }

    public boolean pesquisar(String x) {
        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            if (i.elemento.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public boolean isVazia() {
        return primeiro == ultimo;
    }

}
