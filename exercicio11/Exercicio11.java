package exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] resultado = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Matriz 1 [" + i + "][" + j + "]");
                matriz1[i][j] = read.nextInt();
                System.out.println("Matriz 2 [" + i + "][" + j + "]");
                matriz2[i][j] = read.nextInt();
                if (matriz1[i][j] > matriz2[i][j]) {
                    resultado[i][j] = matriz1[i][j];
                } else {
                    resultado[i][j] = matriz2[i][j];
                }
            }
        }
        System.out.println("Matriz Resultante");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
