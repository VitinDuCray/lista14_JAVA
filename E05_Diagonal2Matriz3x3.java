package lista14_JAVA;

import java.util.Scanner;

public class E05_Diagonal2Matriz3x3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal secundária:");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
		}

		sc.close();
	}
}
