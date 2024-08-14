import java.util.*;

public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int op;
        String nome, endereco, cpf, telefone;

        FilaFlexivel fi = new FilaFlexivel();
        
        do {
            System.out.println("\n Menu");
            System.out.println("1- Para pesquisar se existe o nome");
            System.out.println("2- Mostrar Filas de Objetos");
            System.out.println("3- Para Inserir Objeto");
            System.out.println("4- Para remover Objeto");
            System.out.println("5- Encerrar o programa");
            System.out.print("Opção:");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n Digite o nome");
                    nome = sc.next();

                    if (fi.pesquisar(nome)) {
                        System.out.println("\n Objeto com nome " + nome + " encontrado!");
                    } else {
                        System.out.println("Esse Objeto não Existe!");
                    }
                    break;

                case 2:
                    fi.mostrarFila();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Nome:");
                    nome = sc.nextLine();

                    System.out.print("CPF:");
                    cpf = sc.nextLine();

                    System.out.print("Endereço:");
                    endereco = sc.nextLine();

                    System.out.print("Telefone:");
                    telefone = sc.nextLine();

                    Cliente clienteNovo = new Cliente(nome, cpf, endereco, telefone);

                    fi.inserir(clienteNovo);
                    break;

                case 4:
                    fi.remover();
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while (op != 5);

        System.out.println("Fim");

        sc.close();
    }
}
