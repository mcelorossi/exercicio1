package exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];

        for (int i = 0; i < 10; i++) {
            vetor1[i] = read.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetor2[i] = read.nextInt();
        }
        int aux1 = 0;
        int aux2 = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                vetor3[i] = vetor1[aux1];
                aux1++;
            } else {
                vetor3[i] = vetor2[aux2];
                aux2++;
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(vetor3[i]);
        }


    }
}
