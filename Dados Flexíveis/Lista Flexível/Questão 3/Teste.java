import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        ListaFlexivel alunosMestrandos = new ListaFlexivel();
        ListaFlexivel alunosDoutorandos = new ListaFlexivel();

        do {

            System.out.println("Menu:");
            System.out.println("1) Inserir um aluno no final da lista de mestrandos");
            System.out.println("2) Inserir um aluno no final da lista de doutorandos");
            System.out.println("3) Remover um aluno específico da lista de mestrandos");
            System.out.println("4) Remover um aluno específico da lista de doutorandos");
            System.out.println("5) Listar os códigos dos alunos que estão na lista de mestrandos");
            System.out.println("6) Listar os códigos dos alunos que estão na lista de doutorandos");
            System.out.println("7) Pesquisar se um aluno específico está na lista de mestrandos");
            System.out.println("8) Pesquisar se um aluno específico está na lista de doutorandos");
            System.out.println("9) Encerrar o programa");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o código do aluno de mestrado: ");
                    int codigoMestrado = sc.nextInt();
                    alunosMestrandos.inserirFim(codigoMestrado);
                    System.out.println("Aluno adicionado na lista de mestrado.");
                    break;
                case 2:
                    System.out.println("Digite o código do aluno de doutorado: ");
                    int codigoDoutorado = sc.nextInt();
                    alunosDoutorandos.inserirFim(codigoDoutorado);
                    System.out.println("Aluno adicionado na lista de doutorado.");
                    break;

                case 3:
                    System.out.println("Digite o código do aluno de mestrado a ser removido: ");
                    int codigoMestradoRemover = sc.nextInt();
                    boolean mestradoRemovido = alunosMestrandos.removerPeloID(codigoMestradoRemover);
                    if (mestradoRemovido) {
                        System.out.println("Aluno removido da lista de mestrado.");
                    } else {
                        System.out.println("Aluno não encontrado na lista de mestrado.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o código do aluno de doutorado a ser removido: ");
                    int codigoDoutoradoRemover = sc.nextInt();
                    boolean doutoradoRemovido = alunosDoutorandos.removerPeloID(codigoDoutoradoRemover);
                    if (doutoradoRemovido) {
                        System.out.println("Aluno removido da lista de doutorado.");
                    } else {
                        System.out.println("Aluno não encontrado na lista de doutorado.");
                    }
                    break;

                case 5:
                    System.out.println("Lista de códigos dos alunos de mestrado:");
                    alunosMestrandos.mostrar();
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Lista de códigos dos alunos de doutorado:");
                    alunosDoutorandos.mostrar();
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Digite o código do aluno de mestrado a ser pesquisado: ");
                    int codigoMestradoPesquisar = sc.nextInt();
                    boolean mestradoEncontrado = alunosMestrandos.pesquisar(codigoMestradoPesquisar);
                    if (mestradoEncontrado) {
                        System.out.println("Aluno encontrado na lista de mestrado.");
                    } else {
                        System.out.println("Aluno não encontrado na lista de mestrado.");
                    }
                    break;

                case 8:
                    System.out.println("Digite o código do aluno de doutorado a ser pesquisado: ");
                    int codigoDoutoradoPesquisar = sc.nextInt();
                    boolean doutoradoEncontrado = alunosDoutorandos.pesquisar(codigoDoutoradoPesquisar);
                    if (doutoradoEncontrado) {
                        System.out.println("Aluno encontrado na lista de doutorado.");
                    } else {
                        System.out.println("Aluno não encontrado na lista de doutorado.");
                    }
                    break;

                default:
                    break;
            }

        } while (op != 9);

    }
}
