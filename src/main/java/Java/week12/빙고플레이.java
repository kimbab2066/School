package Java.week12;

import java.util.Random;

public class 빙고플레이 {
	public static void main(String[] args) throws InterruptedException {
		int[][] arr = new int[5][5];
		int[] freq = new int[26];
		String[][] result = new String[5][5];
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
		// 선택해서 *로 변경할 배열
		for (i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result[i][j] = String.valueOf(arr[i][j]);
			}
		}
		// show array
//		for (i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("%3d", arr[i][j]);
//			}
//			System.out.println();
//		}
		
		// 가로(5가지), 세로(5가지), 대각선(2가지)의 경우의 수
		int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;// 합이 3이상이 되면 그만
		// 빙고 카운트
		int cnt = 0;
		String str = "";
		while (true) {			
			// 종료 조건
			if (cnt1 >= 1 && cnt2 >= 1 && (cnt3 >= 1 || cnt4 >= 1)) {
				// *출력
				for(i = 0; i<5;i++) {
					for(int j = 0; j<5;j++) {
						System.out.printf("%3s",result[i][j]);
					}
					System.out.println();
				}
				System.out.printf("선택된 수:%s(%d번째 빙고!)", str,cnt);
				break;
			}
			int val = rnd.nextInt(25) + 1;
			// 값이 없으면 다시
			if(freq[val] == 0) continue;
			// 1초
			Thread.sleep(1000);
			// *출력
			for(i = 0; i<5;i++) {
				for(int j = 0; j<5;j++) {
					System.out.printf("%3s",result[i][j]);
				}
				System.out.println();
			}
			
			// 선택 된 수 출력하는데 중복값이 왜 들어가지?
			str += val+ " ";
			Loop1 :
			for (i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (arr[i][j] == val) {
						arr[i][j] = 0;
						freq[val] = 0;
						result[i][j] = "*";
						System.out.println("선택된 수:" + str );
						cnt++;
						break Loop1;
					}
				}
			}
			System.out.println();
			// 1. 가로
			for (i = 0; i < 5; i++) {
				if (arr[i][0] == 0 && arr[i][1] == 0 && arr[i][2] == 0 
					&& arr[i][3] == 0 && arr[i][4] == 0) {
					cnt1++;
					break;
				}
			}
			// 2. 세로
			for (int j = 0; j < 5; j++) {
				if (arr[0][j] == 0 && arr[1][j] == 0 && arr[2][j] == 0 
					&& arr[3][j] == 0 && arr[4][j] == 0) {
					cnt2++;
					break;
				}
			}
			// 3. 대각선
			int dia = 0, dia2 = 0;
			for (i = 0; i < 5; i++) {
				if (arr[i][i] == 0)
					dia++;
				if (arr[i][4 - i] == 0)
					dia2++;
				if (dia == 5) {
					cnt3++;
					break;
				}
				if (dia2 == 5) {
					cnt4++;
					break;
				}
			}
		} // end of while
	}// end of main
}// end of class