import java.util.*;

public class GerenciadorMusica {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int tam;

        System.out.println("Qual o tamanho da Lista?");
        tam = sc.nextInt();

        Lista lista1 = new Lista(tam);
        int op = 0;
        String musica;

        do {

            System.out.println("\nMenu:");

            System.out.println("1) Inserir uma música no final da lista");
            System.out.println("2) Remover a última música inserida");
            System.out.println("3) Listar todas as músicas da lista");
            System.out.println("4) Pesquisar uma música na lista");
            System.out.println("5) Encerrar o programa");

            System.out.print("Opção:");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Digite o nome da Música");
                    musica = sc.next();
                    lista1.inserirFim(musica);
                    break;

                case 2:
                    lista1.removerFim();

                    break;

                case 3:
                    lista1.mostrar();

                    break;

                case 4:
                    System.out.println("Qual o nome da musica?");
                    musica = sc.next();
                    lista1.pesquisar(musica);

                    if (lista1.pesquisar(musica) == true) {
                        System.out.println("\nMúsica está na Lista\n");
                    } else {
                        System.out.println("\nMúsica não disponível\n");
                    }

                    break;

            }

        } while (op != 5);

    }
}
