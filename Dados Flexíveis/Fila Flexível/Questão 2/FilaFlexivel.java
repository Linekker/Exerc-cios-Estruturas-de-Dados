
public class FilaFlexivel {
    private Celula primeiro, ultimo;

    public FilaFlexivel() {
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public void inserir(Cliente x) {
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }

    public Cliente remover() throws Exception {

        if (primeiro == ultimo) {
            throw new Exception("Erro! A Fila Está vazia");
        }

        Celula tmp = primeiro;
        primeiro = primeiro.prox;
        Cliente elemento = primeiro.elemento;
        tmp.prox = null;
        tmp = null;

        return elemento;
    }

    public void mostrarFila() {

        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            System.out.print(i.elemento + " ");
        }
        

    }

    public boolean pesquisar(String x) {
        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            if (i.elemento.getNome().equals(x)) {
                return true;
            }
        }
        return false;
    }

    public boolean isVazia() {
        return primeiro == ultimo;
    }

}
