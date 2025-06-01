package lista14_JAVA;

import java.util.Scanner;

public class E04_DiagonalMatrix3x3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal principal:");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		sc.close();
	}
}
