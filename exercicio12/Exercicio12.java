package exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int somaAcimaDiagonal = 0;
        int somaDiagonal = 0;
        int somaAbaixoDiagonal = 0;
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Matriz  [" + i + "][" + j + "] = ");
                matriz[i][j] = read.nextInt();
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
                if (i < j) {
                    somaAcimaDiagonal += matriz[i][j];
                } else {
                    somaAbaixoDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("Soma superior da diagional principal = " + somaAcimaDiagonal);
        System.out.println("Soma da diagional principal = " + somaDiagonal);
        System.out.println("Soma inferior da diagional principal = " + somaAbaixoDiagonal);
    }
}
