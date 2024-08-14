import java.util.*;

public class Bolha {
    public static void bolha(int[] array, int n) {

        int temp;
        // i marca até onde já está ordenado
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
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

        bolha(vet, tam);

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}