import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int op, id;

        String nome;

        FilaFlexivel f = new FilaFlexivel();

        do {
            System.out.println("Menu de opções");
            System.out.println("1) Listar quantidade de aviões que estão aguardando na fila de decolagem");
            System.out.println("2) Autorizar a decolagem do primeiro avião da fila de decolagem");
            System.out.println("3) Adicionar um avião à fila de decolagem");
            System.out.println("4) Listar o identificador de todos os aviões da fila de decolagem");
            System.out.println("5) Lista o nome e o identificador do primeiro avião da fila de colagem");
            System.out.println("6) Encerrar o programa");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println(f.length());
                    break;

                case 2:
                    f.remover();
                    System.out.println("Avião autorizado para decolar!");
                    break;

                case 3:
                    System.out.println("Digite o nome do avião: ");
                    nome = sc.nextLine();

                    System.out.println("Digite o id do avião: ");
                    id = sc.nextInt();

                    Aviao a = new Aviao(nome, id);
                    f.inserir(a);
                    break;

                case 4:
                    f.listarTodos();
                    break;

                case 5:
                    f.listarPrimeiro();
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (op != 6);

        sc.close();
    }
}
