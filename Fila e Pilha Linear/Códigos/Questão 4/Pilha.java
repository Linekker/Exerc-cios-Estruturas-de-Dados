public class Pilha {

    private int[] array;
    private int n;

    public Pilha() {
        this(6);
    }

    public Pilha(int tamanho) {
        array = new int[tamanho];
        n = 0;
    }

    public void inserirFim(int x) throws Exception {
        if (n >= array.length)
            throw new Exception("Erro!");
        array[n] = x;
        n++;
    }

    public int removerFim() throws Exception {
        if (n == 0)
            throw new Exception("Erro!");

        return array[--n];
    }

    public void mostrarPilhaInvertida() {

        for (int i = n-1; i >= 0 ; i--) {
            System.out.print(array[i] + "  ");
        }

    }

}

