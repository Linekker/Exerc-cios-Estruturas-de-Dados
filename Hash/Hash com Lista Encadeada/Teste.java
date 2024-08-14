package src;

import java.util.*;

public class Teste {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int op = 0, tabela = 13, numero;

        Hash hash = new Hash(tabela);

        do {

            System.out.println("----- Menu de Opções -----");
            System.out.println("1- Inserir um número na tabela hash");
            System.out.println("2- Remover um número na tabela hash");
            System.out.println("3- Pesquisar um número na tabela hash");
            System.out.println("4- Sair");
            System.out.print("Digite a opção desejada: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o número a ser inserido: ");
                    numero = sc.nextInt();
                       hash.inserir(numero);
                    break;
                case 2:
                    System.out.print("Digite o número a ser removido: ");
                    numero = sc.nextInt();
                    hash.remover(numero);
                    break;
                case 3:
                    System.out.print("Digite o número a ser pesquisado: ");
                    numero = sc.nextInt();
                    boolean encontrar = hash.pesquisar(numero);
                    if (encontrar) {
                        System.out.println("\n O número está na tabela hash.\n");
                    } else {
                        System.out.println("\n O número não está na tabela hash.\n");
                    }
                    break;

                case 4:
                    System.out.print("Fim!");

                    break;
                default:
                    System.out.println("\n Erro! Selecione a opção Certa! \n");
                    break;
            }

        } while (op != 4);

        sc.close();

    }
}
