package exercicio10;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = read.nextInt();
            ordenar(vetor, i);
            mostraVetor(vetor, i);
        }


    }

    private static void mostraVetor(int[] vetor, int k) {
        for (int i = 0; i < k + 1; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }

    static void ordenar(int[] arr, int max) {
        int n = max + 1;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
}
