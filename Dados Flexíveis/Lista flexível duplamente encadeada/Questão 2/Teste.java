import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        ListaDupla liDupla = new ListaDupla();
        Scanner sc = new Scanner(System.in);
        int op = 0;

        do {

            System.out.println("Menu:");
            System.out.println("1. Inserir uma música no final da lista");
            System.out.println("2. Inserir uma música no início da lista");
            System.out.println("3. Inserir uma música numa posição específica da lista");
            System.out.println("4. Remover a música do início da lista");
            System.out.println("5. Remover a música do final da lista");
            System.out.println("6. Remover uma música de uma posição específica da lista");
            System.out.println("7. Remover uma música específica");
            System.out.println("8. Listar todas as músicas da lista");
            System.out.println("9. Listar todas as músicas da lista na ordem inversa");
            System.out.println("10. Pesquisar uma música na lista");
            System.out.println("11. Pesquisar música anterior");
            System.out.println("12. Pesquisar música posterior");
            System.out.println("13. Encerrar o programa");

            System.out.print("\nDigite sua opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\nDigite o nome da música: ");
                    String nomeMusica = sc.next();
                    liDupla.inserirFim(nomeMusica);
                    break;
                case 2:
                    System.out.print("\nDigite o nome da música: ");
                    nomeMusica = sc.next();
                    liDupla.inserirInicio(nomeMusica);
                    break;
                case 3:
                    System.out.print("\nDigite o nome da música: ");
                    nomeMusica = sc.next();
                    System.out.print("\nDigite a posição: ");
                    int pos = sc.nextInt();
                    try {
                        liDupla.inserir(nomeMusica, pos);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        String nomeMusicaRemovida = liDupla.removerInicio();
                        System.out.println("\nMúsica removida: " + nomeMusicaRemovida);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        String nomeMusicaRemovida = liDupla.removerFim();
                        System.out.println("\nMúsica removida: " + nomeMusicaRemovida);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("\nDigite a posição: ");
                    pos = sc.nextInt();
                    try {
                        String nomeMusicaRemovida = liDupla.removerPorPosicao(pos);
                        System.out.println("\nMúsica removida: " + nomeMusicaRemovida);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    System.out.println("Digite a música");
                    nomeMusica = sc.next();
                    Boolean nomeMusicaRemovida = liDupla.removerMusicaPorNome(nomeMusica);
                    if (nomeMusicaRemovida) {
                        System.out.println("Música Removida com Sucesso");
                    } else {
                        System.out.println("Não foi posível remover essa musica");
                    }
                    break;

                case 8:
                    liDupla.mostrar();
                    break;

                case 9:
                    liDupla.mostrarInverso();

                    break;

                case 10:
                    System.out.println("Digite a música");
                    nomeMusica = sc.next();
                    liDupla.pesquisarMusica(nomeMusica);
                    break;

                case 11:
                    System.out.println("Digite a música");
                    nomeMusica = sc.next();

                    System.out.println("A Música anterior é " + liDupla.pesquisarAnterior(nomeMusica));
                    break;

                case 12:
                    System.out.println("Digite a música");
                    nomeMusica = sc.next();

                    System.out.println("A Música Posterior é " + liDupla.pesquisarPosterior(nomeMusica));
                    break;

            }

        } while (op != 13);

    }
}