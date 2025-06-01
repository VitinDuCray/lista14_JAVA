package lista14_JAVA;

import java.util.Scanner;

public class E07_ParesMatriz4x4 {
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int pares = 0;

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println("Total de números pares: " + pares);
        sc.close();
    }
}
