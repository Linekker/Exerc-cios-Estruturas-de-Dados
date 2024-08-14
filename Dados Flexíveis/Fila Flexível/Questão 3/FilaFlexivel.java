class FilaFlexivel {
    private Celula primeiro, ultimo;


    public FilaFlexivel() {
        primeiro = new Celula();
        ultimo = primeiro;
    }


    public void inserir(Aviao x) {
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }


    public Aviao remover() throws Exception {
        if (primeiro == ultimo)
            throw new Exception("Erro!");


        Celula tmp = primeiro;
        primeiro = primeiro.prox;
        Aviao elemento = primeiro.elemento;
        tmp.prox = null;
        tmp = null;
        return elemento;
    }


    public void listarTodos() {
        System.out.print("[ ");


        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            System.out.print("Nome: " + i.elemento.getNome() + " Id: " + i.elemento.getId() + ", ");
        }


        System.out.println("]");
    }


    public void listarPrimeiro() {
        System.out.println("[Nome: " + primeiro.elemento.getNome() + " Id: " + primeiro.elemento.getId() + "]");
    }


    public int length() {
        int t = 0;


        for (Celula i = primeiro; i != ultimo; i = i.prox) {
            t++;
        }
        return t;
    }
}
