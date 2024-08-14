public class Fila {

    private Clientes[] array;
    private int ultimo, primeiro;

    public Fila() {
        this(6);

    }

    public Fila(int tamanho) {
        array = new Clientes[tamanho + 1];
        primeiro = 0;
        ultimo = 0;
    }

    public void inserir(Clientes x) throws Exception {
        if (((ultimo + 1) % array.length) == primeiro) {
            throw new Exception("Erro!");
        }
        array[ultimo] = x;
        ultimo = (ultimo + 1) % array.length;
    }

    public Clientes remover() throws Exception {
        if (primeiro == ultimo) {
            throw new Exception("Erro!");
        }
        Clientes resp = array[primeiro];
        primeiro = (primeiro + 1) % array.length;
        return resp;
    }

    public void mostrar() {
        int i = primeiro;
        System.out.print("\n");
        while (i != ultimo) {
            System.out.print(array[i].toString() + " \n");
            i = (i + 1) % array.length;
        }

    }

    public boolean pesquisar(String cliente) {

        boolean testar = false;
        for (int j = primeiro; j != ultimo; j = (j + 1) % array.length) {
            if (cliente.equals(array[j].getNome())) {
                testar = true;

            }
        }
        return testar;

    }

    public boolean isVazia() {
        boolean testa = false;
        if (primeiro == ultimo) {
            testa = true;
        }
        return testa;
    }

}
