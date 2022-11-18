package Java.week12;

import java.util.Random;

public class 빙고플레이 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int[] freq = new int[26];
		Random rnd = new Random();
		int i = 0;
		// makeNumber
		while (i < 25) {
			int val = rnd.nextInt(25) + 1;
			if (freq[val] == 0) {
				freq[val] = 1;
				arr[i / 5][i % 5] = val;
				i++;
			}
		}
		// show array
		for (i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

		System.out.print("선택된 수:");
		// 2번 - 가로(5가지), 세로(5가지), 대각선(2가지)를 따지면 된다
		int count = 0;// 3이 되면 그만
		while (true) {
			int val = rnd.nextInt(25) + 1;
			if (freq[val] == 1) {
				freq[val] = 0;
				System.out.print(val + " ");
			}
			// 1. 가로
			for (i = 0; i < 5; i++) {
				if (arr[i][0] == 0 && arr[i][1] == 0 && arr[i][2] == 0 && arr[i][3] == 0 && arr[i][4] == 0) {
					count++;
					break;
				}
			}
			// 2. 세로
			for (int j = 0; j < 5; j++) {
				if (arr[0][j] == 0 && arr[1][j] == 0 && arr[2][j] == 0 && arr[3][j] == 0 && arr[4][j] == 0) {
					count++;
					break;
				}
			}
			// 3. 대각선
			int dia = 0, dia2 = 0;
			for (i = 0; i < 5; i++) {
				if (arr[i][i] == 0) dia++;
				if (arr[i][4 - i] == 0)  dia2++;
			}
			if (dia == 5 || dia2 == 5) count++;
			if (count == 3) break;
		} // end of while
	}// end of main
}// end of class