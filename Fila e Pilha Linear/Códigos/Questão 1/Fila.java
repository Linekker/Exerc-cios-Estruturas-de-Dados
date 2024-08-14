public class Fila {

    private String[] array;
    private int ultimo, primeiro;

    public Fila() {
        this(6);

    }

    public Fila(int tamanho) {
        array = new String[tamanho + 1];
        primeiro = 0;
        ultimo = 0;
    }

    public void inserir(String x) throws Exception {
        if (((ultimo + 1) % array.length) == primeiro) {
            throw new Exception("Erro!");
        }
        array[ultimo] = x;
        ultimo = (ultimo + 1) % array.length;
    }

    public String remover() throws Exception {
        if (primeiro == ultimo) {
            throw new Exception("Erro!");
        }
        String resp = array[primeiro];
        primeiro = (primeiro + 1) % array.length;
        return resp;
    }

    public void mostrar() {
        int i = primeiro;
        System.out.print("\n[");
        while (i != ultimo) {
            System.out.print(array[i] + " ");
            i = (i + 1) % array.length;
        }

        System.out.println("]");
    }

    public boolean pesquisar(String cliente) {

        boolean testa = false;
        for (int j = 0; j < array.length; j++) {
            if (cliente.equals(array[j])) {
                testa = true;

            }
        }
        return testa;

    }

    public boolean isVazia() {
        boolean testa = false;
        if (primeiro == ultimo) {
            testa = true;
        }
        return testa;
    }

}
