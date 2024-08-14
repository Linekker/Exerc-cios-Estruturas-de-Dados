public class Lista {

    private String[] array;
    private int n;

    public Lista() {
        this(4);
    }

    public Lista(int tamanho) {
        array = new String[tamanho];
        n = 0;
    }

    public void inserirFim(String musica) throws Exception {
        if (n >= array.length)
            throw new Exception("Erro!");
        array[n] = musica;
        n++;
    }

    public String removerFim() throws Exception {
        if (n == 0)
            throw new Exception("Erro!");
        return array[--n];
    }

    public void mostrar() {

        System.out.print("\n[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ]\n");
    }

    public boolean pesquisar(String nomeMusica) {

        boolean existe = false;

        for (int i = 0; i < n; i++) {
            if (nomeMusica.equals(array[i])) {
                existe = true;
            }

        }
        return existe;

    }

}
