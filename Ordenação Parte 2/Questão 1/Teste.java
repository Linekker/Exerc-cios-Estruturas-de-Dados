
import java.util.*;

public class Teste {

    public static void quicksort(int[] array, int esq, int dir) {

        int comp = 0, mov = 0;

        int i = esq, j = dir, pivo = array[(esq + dir) / 2];
        while (i <= j) {
            while (array[i] < pivo)
                i++;
            while (array[j] > pivo)
                j--;
            if (i <= j) {
                trocar(array, i, j);
                i++;
                j--;
            }
        }
        if (esq < j)
            quicksort(array, esq, j);
        if (i < dir)
            quicksort(array, i, dir);

        System.out.println("Comparações " + comp);
        System.out.println("Movimentações " + mov);
    }

    public static void trocar(int array[], int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int vet[];

        System.out.println("Digite o tamanho de Vetor");
        n = sc.nextInt();

        vet = new int[n];

        System.out.println("Preencha o Vetor");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }

        quicksort(vet, 0, n - 1);

        System.out.println("Vetor Ordenado");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" " + vet[i]);
        }

        sc.close();

    }
}