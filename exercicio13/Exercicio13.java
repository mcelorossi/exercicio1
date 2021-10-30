package exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("A [" + i + "][" + j + "]");
                A[i][j] = read.nextInt();
                System.out.println("B [" + i + "][" + j + "]");
                B[i][j] = read.nextInt();
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                C[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");  //printing matrix element
            }
            System.out.println();
        }
    }
}
