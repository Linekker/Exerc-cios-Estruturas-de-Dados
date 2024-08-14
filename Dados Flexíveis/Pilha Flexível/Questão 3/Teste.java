import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma sequência de parênteses e colchetes: ");
        String sequencia = sc.nextLine();

        PilhaFlexivel pilha = new PilhaFlexivel();

        for (int i = 0; i < sequencia.length(); i++) {
            char caractere = sequencia.charAt(i);

            if (caractere == '(' || caractere == '[') {
                pilha.inserir(caractere);
            }

            else if (caractere == ')' || caractere == ']') {

                char topo = pilha.remover();
                if ((caractere == ')' && topo == '(') || (caractere == ']' && topo == '[')) {
                    continue;
                } else {
                    System.out.println("Sequência malformada!");
                    return;

                }

            }
        }

        if (pilha.vazia()) {
            System.out.println("Sequência bem-formada!");
        } else {
            System.out.println("Sequência malformada!");
        }
    }
}