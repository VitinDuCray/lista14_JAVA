package lista14_JAVA;

public class E02_Matriz4x4Auto {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = 1;
			}
		}

		System.out.println("Matriz 4x4 preenchida com 1:");
		for (int[] linha : matriz) {
			for (int valor : linha) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}
}
