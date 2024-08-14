import java.util.*;

public class Teste {

    public static void selecao(int[] array, int n) {
        for (int i = 0; i < (n - 1); i++) {
            int menor = i;
            for (int j = (i + 1); j < n; j++) {
                if (array[menor] > array[j]) {
                    menor = j;
                }
            }
            int temp = array[menor];
            array[menor] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Informe os números para preencher o vetor:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        selecao(array, n);

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}