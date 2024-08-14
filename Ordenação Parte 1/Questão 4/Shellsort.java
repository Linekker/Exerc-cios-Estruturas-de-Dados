import java.util.*;

public class Shellsort {

    public static void shellsort(int[] array, int n) {
        int h = 1;
        do {
            h = (h * 3) + 1;
        } while (h < n);
        do {
            h /= 3;
            for (int cor = 0; cor < h; cor++) {
                insercaoCor(array, n, cor, h);
            }
        } while (h != 1);
    }

    public static void insercaoCor(int[] array, int n, int cor, int h) {
        for (int i = (h + cor); i < n; i += h) {
            int tmp = array[i];
            int j = i - h;
            while ((j >= 0) && (array[j] > tmp)) {
                array[j + h] = array[j];
                j -= h;
            }
            array[j + h] = tmp;
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

        shellsort(array, n);

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}