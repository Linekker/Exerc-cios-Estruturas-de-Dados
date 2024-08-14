import java.util.Scanner;

public class Teste{

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ListaFlexivel lista = new ListaFlexivel();

        int opcao = 0;

        do {
            System.out.println("----- Menu de Opções -----");
            System.out.println("1 - Inserir temperatura no início");
            System.out.println("2 - Inserir temperatura no final");
            System.out.println("3 - Inserir temperatura numa posição específica");
            System.out.println("4 - Remover a primeira temperatura");
            System.out.println("5 - Remover a última temperatura");
            System.out.println("6 - Remover de uma posição específica");
            System.out.println("7 - Mostrar todas temperaturas");
            System.out.println("8 - Mostrar o número de dias que uma temperatura específica foi registrada");
            System.out.println("9 - Verificar se a lista está vazia");
            System.out.println("10 - Encerrar o programa");

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura: ");
                    double tempInicio = sc.nextDouble();
                    lista.inserirInicio(tempInicio);
                    break;

                case 2:
                    System.out.print("Digite a temperatura: ");
                    double tempFim = sc.nextDouble();
                    lista.inserirFim(tempFim);
                    break;

                case 3:
                    System.out.print("Digite a temperatura: ");
                    double tempPos = sc.nextDouble();
                    System.out.print("Digite a posição: ");
                    int pos = sc.nextInt();
                    lista.inserir(tempPos, pos);
                    break;

                case 4:
                    double tempRemovidoInicio = lista.removerInicio();
                    System.out.println("Temperatura removida: " + tempRemovidoInicio);
                    break;

                case 5:
                    double tempRemovidoFim = lista.removerFim();
                    System.out.println("Temperatura removida: " + tempRemovidoFim);
                    break;

                case 6:
                    System.out.print("Digite a posição: ");
                    int posRemover = sc.nextInt();
                    double tempRemovido = lista.remover(posRemover);
                    System.out.println("Temperatura removida: " + tempRemovido);
                    break;

                case 7:
                    System.out.print("Temperaturas registradas: ");
                    lista.mostrar();
                    System.out.println();
                    break;

                case 8:
                    System.out.print("Digite a temperatura: ");
                    double tempPesquisar = sc.nextDouble();
                    int dias = lista.pesquisar(tempPesquisar);
                    System.out.println("A temperatura " + tempPesquisar + " foi registrada " + dias + " dias.");
                    break;

                case 9:
                    if (lista.isVazia()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("A lista não está vazia.");
                    }
                    break;

                case 10:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 10);

        sc.close();

    }
}