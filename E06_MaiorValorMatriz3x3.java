package lista14_JAVA;

import java.util.Scanner;

public class E06_MaiorValorMatriz3x3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int maior = Integer.MIN_VALUE;

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
		}

		System.out.println("Maior valor da matriz: " + maior);
		sc.close();
	}
}
