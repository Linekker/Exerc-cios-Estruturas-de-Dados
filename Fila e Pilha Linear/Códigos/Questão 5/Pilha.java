public class Pilha {

    private double[] array;
    private int n;

    public Pilha() {
        this(6);
    }

    public Pilha(int tamanho) {
        array = new double[tamanho];
        n = 0;
    }

    public void inserirFim(double x) throws Exception {
        if (n >= array.length)
            throw new Exception("Erro!");
        array[n] = x;
        n++;
    }

    public double removerFim() throws Exception {
        if (n == 0)
            throw new Exception("Erro!");

        return array[--n];
    }

    public void mostrarPilha() {

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "  ");
        }

    }

}
