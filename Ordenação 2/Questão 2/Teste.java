package src;

import java.util.*;

public class Teste {

    public static void mergesort(int[] array, int esq, int dir) {
        if (esq < dir) {
            int meio = (esq + dir) / 2;
            mergesort(array, esq, meio);
            mergesort(array, meio + 1, dir);
            intercalar(array, esq, meio, dir);
        }
    }

    public static void intercalar(int[] array, int esq, int meio, int dir) {
        // Definir tamanho dos dois subarrays
        int nEsq = meio - esq + 1;
        int nDir = dir - meio;
        int[] arrayEsq = new int[nEsq + 1];
        int[] arrayDir = new int[nDir + 1];
        // Sentinela no final dos dois arrays
        arrayEsq[nEsq] = Integer.MAX_VALUE;
        arrayDir[nDir] = Integer.MAX_VALUE;

        int iEsq, iDir, i;
        // Inicializar primeiro subarray

        for (iEsq = 0; iEsq < nEsq; iEsq++) {
            arrayEsq[iEsq] = array[esq + iEsq];
        }
        // Inicializar segundo subarray
        for (iDir = 0; iDir < nDir; iDir++) {
            arrayDir[iDir] = array[(meio + 1) + iDir];
        }
        // Intercalacao propriamente dita
        for (iEsq = 0, iDir = 0, i = esq; i <= dir; i++) {
            array[i] = (arrayEsq[iEsq] <= arrayDir[iDir]) ? arrayEsq[iEsq++] : arrayDir[iDir++];
        }
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

        mergesort(vet, 0, n - 1);

        System.out.println("Vetor Ordenado");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" " + vet[i]);
        }

        sc.close();

    }
}