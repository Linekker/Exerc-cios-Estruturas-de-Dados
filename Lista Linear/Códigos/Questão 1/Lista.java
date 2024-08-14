public class Lista {

    private int[] array;
    private int n;

    public Lista() {
        this(6);
    }

    public Lista(int tamanho) {
        array = new int[tamanho];
        n = 0;
    }

    public void inserirInicio(int x) throws Exception {
        if (n >= array.length)
            throw new Exception("Erro!");
        // levar elementos para o fim do array
        for (int i = n; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = x;
        n++;
    }

    public void inserirFim(int x) throws Exception {
        if (n >= array.length)
            throw new Exception("Erro!");
        array[n] = x;
        n++;
    }

    public void inserir(int x, int pos) throws Exception {
        if (n >= array.length || pos < 0 || pos > n)
            throw new Exception("Erro!");
        // levar elementos para o fim do array
        for (int i = n; i > pos; i--) {
            array[i] = array[i - 1];
        }
        array[pos] = x;
        n++;
    }

    public int removerInicio() throws Exception {
        if (n == 0)
            throw new Exception("Erro!");
        int resp = array[0];
        n--;
        for (int i = 0; i < n; i++) {
            array[i] = array[i + 1];
        }
        System.out.println("\n" + resp + " Foi removido!\n");
        return resp;
    }

    public int removerFim() throws Exception {
        if (n == 0)
            throw new Exception("Erro!");
        return array[--n];
    }

    public int remover(int pos) throws Exception {
        if (n == 0 || pos < 0 || pos >= n)
            throw new Exception("Erro!");
        int resp = array[pos];
        n--;
        for (int i = pos; i < n; i++) {
            array[i] = array[i + 1];
        }
        System.out.println("\n " + resp + " foi Removido");
        return resp;
    }

    public void mostrar() {

        System.out.print("\n[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ]\n");
    }

}
