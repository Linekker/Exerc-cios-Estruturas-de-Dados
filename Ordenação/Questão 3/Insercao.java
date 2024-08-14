import java.util.*;

public class Insercao {
    public static void insercao(int[] array, int n) {

        for (int i = 1; i < n; i++) {
            int tmp = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > tmp)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int tam = sc.nextInt();

        int[] vet = new int[tam];

        System.out.println("Preencha o Vetor");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }

        insercao(vet, tam);

        System.out.println("Vetor Ordenado:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        sc.close();
    }
}