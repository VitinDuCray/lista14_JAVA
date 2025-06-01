package lista14_JAVA;

import java.util.Scanner;

public class E10_SimetriaMatriz3x3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		boolean simetrica = true;

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3 && simetrica; i++) {
			for (int j = 0; j < 3; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					simetrica = false;
					break;
				}
			}
		}

		System.out.println("A matriz " + (simetrica ? "é" : "não é") + " simétrica.");
		sc.close();
	}
}
