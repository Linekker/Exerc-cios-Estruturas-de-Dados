import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ListaFlexivel lista = new ListaFlexivel();

        int op = 0;

        do {

            System.out.println("Menu de Opções:");
            System.out.println("1. Inserir um Site no início da lista");
            System.out.println("2. Inserir um Site no final da lista");
            System.out.println("3. Inserir um Site numa posição específica da lista");
            System.out.println("4. Remover o primeiro Site da lista (Imprimir o nome do site removido)");
            System.out.println("5. Remover o último Site da lista (Imprimir o nome do site removido)");
            System.out.println("6. Remover um Site de uma posição específica da lista (Imprimir o nome do site removido)");
            System.out.println("7. Mostrar o nome e o link de todos os sites da lista");
            System.out.println("8. Pesquisar o link de um site");
            System.out.println("9. Encerrar o programa");
            System.out.print("Opção:");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do site:");
                    String nome = sc.next();
                    System.out.println("Digite o link do site:");
                    String link = sc.next();
                    Site siteInicio = new Site(nome, link);
                    lista.inserirInicio(siteInicio);
                    break;
                case 2:
                    System.out.println("Digite o nome do site:");
                    String nome2 = sc.next();
                    System.out.println("Digite o link do site:");
                    String link2 = sc.next();
                    Site siteFim = new Site(nome2, link2);
                    lista.inserirFim(siteFim);
                    break;
                case 3:
                    System.out.println("Digite o nome do site:");
                    String nome3 = sc.next();
                    System.out.println("Digite o link do site:");
                    String link3 = sc.next();
                    System.out.println("Digite a posição onde deseja inserir o site:");
                    int posicao = sc.nextInt();
                    Site sitePosicao = new Site(nome3, link3);
                    lista.inserir(sitePosicao, posicao);
                    break;
                case 4:
                    try {
                        Site removidoInicio = lista.removerInicio();
                        System.out.println("Site removido: " + removidoInicio.getNome());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        Site removidoFim = lista.removerFim();
                        System.out.println("Site removido: " + removidoFim.getNome());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Digite a posição do site que deseja remover:");
                    int posicaoRemover = sc.nextInt();
                    try {
                        Site removidoPosicao = lista.remover(posicaoRemover);
                        System.out.println("Site removido: " + removidoPosicao.getNome());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Lista de Sites:");
                    lista.mostrar();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Digite o nome do site que deseja pesquisar:");
                    String nomePesquisa = sc.next();
                    String linkPesquisa = lista.pesquisarLink(nomePesquisa);
                    System.out.println(linkPesquisa);
                    break;
                case 9:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (op != 9);

    }
}
