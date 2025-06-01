package lista14_JAVA;

import java.util.Scanner;

public class E09_SwitchMatriz3x3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		for (int j = 0; j < 3; j++) {
			int temp = matriz[0][j];
			matriz[0][j] = matriz[2][j];
			matriz[2][j] = temp;
		}

		System.out.println("Matriz após troca da 1ª com a 3ª linha:");
		for (int[] linha : matriz) {
			for (int valor : linha) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

		sc.close();
	}
}
