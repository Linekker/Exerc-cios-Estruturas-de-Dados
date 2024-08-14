import java.util.*;

public class GerenciadorTempo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Lista lista1 = new Lista(5);
        int op = 0;
        int num;
        int pos;

        do {

            System.out.println("Menu:");
            System.out.println("1) Inserir um tempo no início da lista");
            System.out.println("2) Inserir um tempo no final da lista");
            System.out.println("3) Inserir um tempo numa posição específica da lista");
            System.out.println("4) Remover o primeiro tempo da lista (Imprimir o tempo removido)");
            System.out.println("5) Remover o último tempo da lista (Imprimir o tempo removido)");
            System.out.println("6) Remover um tempo de uma posição específica na lista (Imprimir o tempo removido)");
            System.out.println("7) Mostrar todos os tempos da lista");
            System.out.println("8) Encerrar o programa");
            System.out.print("Opção:");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o numero");
                    num = sc.nextInt();
                    lista1.inserirInicio(num);
                    break;

                case 2:
                    System.out.println("Digite o numero");
                    num = sc.nextInt();
                    lista1.inserirFim(num);
                    break;

                case 3:
                    System.out.println("Digite o numero");
                    num = sc.nextInt();
                    System.out.println("Digite a Posição");
                    pos = sc.nextInt();
                    lista1.inserir(num, pos);
                    break;

                case 4:
                    lista1.removerInicio();

                    break;

                case 5:
                    lista1.removerFim();
                    break;

                case 6:
                    System.out.println("Digite a poisção");
                    pos = sc.nextInt();
                    lista1.remover(pos);
                    break;

                case 7:
                    lista1.mostrar();
                    break;

                default:
                    System.out.println("opção Inválida");
                    break;
            }

        } while (op != 8);

    }
}
