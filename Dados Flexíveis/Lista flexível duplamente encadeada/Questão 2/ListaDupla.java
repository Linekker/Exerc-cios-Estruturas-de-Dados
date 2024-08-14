public class ListaDupla {

    private CelulaDupla primeiro, ultimo;

    public ListaDupla() {
        primeiro = new CelulaDupla();
        ultimo = primeiro;
    }

    public void inserirInicio(String x) {
        CelulaDupla tmp = new CelulaDupla(x);
        tmp.ant = primeiro;
        tmp.prox = primeiro.prox;
        primeiro.prox = tmp;
        if (primeiro == ultimo) {
            ultimo = tmp;
        } else {
            tmp.prox.ant = tmp;
        }
        tmp = null;
    }

    public void inserirFim(String x) {
        ultimo.prox = new CelulaDupla(x);
        ultimo.prox.ant = ultimo;
        ultimo = ultimo.prox;
    }

    public String removerInicio() throws Exception {
        if (primeiro == ultimo)
            throw new Exception("Erro!");
        CelulaDupla tmp = primeiro;
        primeiro = primeiro.prox;
        String elemento = primeiro.elemento;
        tmp.prox = null;
        primeiro.ant = null;
        tmp = null;
        return elemento;
    }

    public String removerFim() throws Exception {
        if (primeiro == ultimo)
            throw new Exception("Erro");

        String elemento = ultimo.elemento;
        ultimo = ultimo.ant;
        ultimo.prox.ant = null;
        ultimo.prox = null;
        return elemento;
    }

    public void inserir(String x, int pos) throws Exception {
        int tamanho = tamanho();
        if (pos < 0 || pos > tamanho) {
            throw new Exception("Erro!");
        } else if (pos == 0) {
            inserirInicio(x);
        } else if (pos == tamanho) {
            inserirFim(x);
        } else {
            CelulaDupla i = primeiro;
            for (int j = 0; j < pos; j++, i = i.prox)
                ;
            CelulaDupla tmp = new CelulaDupla(x);
            tmp.ant = i;
            tmp.prox = i.prox;
            tmp.ant.prox = tmp;
            tmp.prox.ant = tmp;
            tmp = i = null;
        }
    }

    public int tamanho() {
        int tamanho = 0;
        CelulaDupla i = primeiro.prox;
        while (i != null) {
            tamanho++;
            i = i.prox;
        }
        return tamanho;
    }

    public String removerPorPosicao(int pos) throws Exception {
        String elemento;
        int tamanho = tamanho();
        if (primeiro == ultimo) {
            throw new Exception("Erro!");
        } else if (pos < 0 || pos >= tamanho) {
            throw new Exception("Erro!");
        } else if (pos == 0) {
            elemento = removerInicio();
        } else if (pos == tamanho - 1) {
            elemento = removerFim();
        } else {
            CelulaDupla i = primeiro.prox;
            for (int j = 0; j < pos; j++, i = i.prox)
                ;
            i.ant.prox = i.prox;
            i.prox.ant = i.ant;
            elemento = i.elemento;
            i.prox = null;
            i.ant = null;
            i = null;
        }
        return elemento;
    }

    public void mostrar() {
        System.out.print("[ ");
        for (CelulaDupla i = primeiro.prox; i != null; i = i.prox) {
            System.out.print(i.elemento + " ");
        }
        System.out.println("] ");

    }

    public boolean removerMusicaPorNome(String musica) {
        CelulaDupla i = primeiro.prox;
        while (i != null) {
            if (i.elemento.equals(musica)) {
                i.ant.prox = i.prox;
                if (i.prox != null) {
                    i.prox.ant = i.ant;
                } else {
                    ultimo = i.ant;
                }
                i = null;
                return true;
            }
            i = i.prox;
        }
        return false;
    }

    public void mostrarInverso() {
        System.out.print("[ ");
        for (CelulaDupla i = ultimo; i != primeiro; i = i.ant) {
            System.out.print(i.elemento + " ");
        }
        System.out.println("] ");
    }

    public boolean pesquisarMusica(String musica) {
        CelulaDupla i = primeiro.prox;
        while (i != null) {
            if (i.elemento.equals(musica)) {
                return true;
            }
            i = i.prox;
        }
        return false;
    }

    public String pesquisarAnterior(String musica) {
        CelulaDupla i = primeiro.prox;
        while (i != null) {
            if (i.elemento.equals(musica)) {
                if (i.ant == primeiro) {
                    return "";
                } else {
                    return i.ant.elemento;
                }
            }
            i = i.prox;
        }
        return "";
    }

    public String pesquisarPosterior(String musica) {
        CelulaDupla i = primeiro.prox;
        while (i != null) {
            if (i.elemento.equals(musica)) {
                if (i.prox == null) {
                    return "";
                } else {
                    return i.prox.elemento;
                }
            }
            i = i.prox;
        }
        return "";
    }

}
