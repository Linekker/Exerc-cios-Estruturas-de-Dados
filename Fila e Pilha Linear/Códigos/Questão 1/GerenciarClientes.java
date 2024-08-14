import java.util.*;

public class GerenciarClientes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Fila fi = new Fila(6);
        Clientes cli = new Clientes("Eduardo", 123456789, "Rua Leona, Bairro Lurdes", 93356745);
        int op = 0;
        String nomes;

        do {

            System.out.println("\nMenu:");
            System.out.println("1) Inserir cliente na fila de espera");
            System.out.println("2) Remover um cliente da fila de espera");
            System.out.println("3) Listar os nomes dos clientes que estão na fila de espera");
            System.out.println("4) Pesquisar se o cliente está na fila de espera");
            System.out.println("5) Verificar se a fila está vazia");
            System.out.println("6) Encerrar o programa");
            System.out.print("Opção:");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nDigite o nome");
                    nomes = sc.next();
                    fi.inserir(nomes);
                    break;

                case 2:
                    fi.remover();
                    break;

                case 3:
                    fi.mostrar();
                    break;

                case 4:
                    System.out.println("Digite o nome a pesquisar");
                    nomes = sc.next();
                    fi.pesquisar(nomes);
                    if (fi.pesquisar(nomes)) {
                        System.out.println("Esse nome está na lista");
                    } else {
                        System.out.println("Esse nome não existe na lista");
                    }
                    break;

                case 5:

                    if (fi.isVazia()) {
                        System.out.println("Fila Vazia");
                    } else {
                        System.out.println("Fila contém elementos");
                    }
                    break;

                default:
                    System.out.println("opção Inválida");
                    break;
            }

        } while (op != 6);

    }
}
