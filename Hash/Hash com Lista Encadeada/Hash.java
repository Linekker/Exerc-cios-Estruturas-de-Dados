package src;

public class Hash {

    public Lista[] tabela;

    public Hash(int m) {
        tabela = new Lista[m];

        for (int i = 0; i < m; i++) {
            tabela[i] = new Lista();
        }
    }

    public int hash(int x) {
        return x % tabela.length;
    }

    public void inserir(int x) throws Exception {
        if (pesquisar(x) == true) {
            throw new Exception("Erro ao inserir!");
        } else {
            tabela[hash(x)].inserirFim(x);

        }
    }

    public void remover(int x) throws Exception {
        if (pesquisar(x) == false) {
            throw new Exception("Erro ao remover!");
        } else {
            tabela[hash(x)].remover(x);
        }
    }

    public boolean pesquisar(int x) {
        return tabela[hash(x)].pesquisar(x);
    }

}
