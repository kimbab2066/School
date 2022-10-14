package Java.week7;

import java.util.Random;
import java.util.Scanner;

public class 난수 {
	static Random rnd = new Random();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int num;
//		for (int i = 0; i < 10; i++) {
//			num = rnd.nextInt(50) * 2 + 1;// 0~100까지의 홀수
//
//			System.out.print(num + " ");
//		}
		// 1~45까지의 수 중 6개 뽑기
//		makeLotto();
		// 연습문제1번
//		test1();
		// 연습문제2번+3번 시험
//		test2();
		// 연습문제4번
//		test4();
		// 연습문제5번

		int user, com;
		int cnt = 0, win = 0;
		while (true) {
			System.out.print("사용자 입력(1:가위,2:바위,3:보):");
			user = in.nextInt();
			com = rnd.nextInt(3) + 1;

			System.out.printf("컴퓨터(%s):사용자(%s)\n", rps(com), rps(user));
			String result = rpsResult(user, com);
			System.out.println(result + "\n********************\n");
			if (result.equals("이겼습니다")) {
				win++;
			}
			cnt++;

			if (cnt == 5) {
				break;
			}
		}
		System.out.printf("총 결과: %d/%d", win, cnt);
	}// end of main

	static String rpsResult(int user, int com) {
		if (user == 1) {
			if (com == 1) {
				return "비겼습니다";
			} else if (com == 2) {
				return "졌습니다";
			} else {
				return "이겼습니다";
			}
		} else if (user == 2) {
			if (com == 1) {
				return "이겼습니다";
			} else if (com == 2) {
				return "비겼습니다";
			} else {
				return "졌습니다";
			}
		} else if (user == 3) {
			if (com == 1) {
				return "졌습니다";
			} else if (com == 2) {
				return "이겼습니다";
			} else {
				return "비겼습니다";
			}
		} else {
			return "다시 입력";
		}
	}// end of rpsResult

	static String rps(int com) {
		if (com == 1) {
			return "가위";
		} else if (com == 2) {
			return "바위";
		} else if (com == 3) {
			return "보";
		} else {
			return "다시 입력";
		}
	}// end of rps

	static void test4() {
		int num;
		for (int i = 0; i < 5; i++) {
			num = rnd.nextInt(20) + 1;
			System.out.printf("%-2d:", num);
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end of test4

	static void test2() {
		int sum = 0, num;
		for (int i = 1; i <= 25; i++) {

			num = rnd.nextInt(41) + 60;
			System.out.printf("%3d ", num);
			sum += num;
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.printf("합계: %d 평균: %.2f", sum, (float) sum / 25.0);
	}// end of test2

	static void test1() {
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(101);
			System.out.print(num + " ");
		}
	}// end of test1

	static void makeLotto() {
		int lotto;
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto = rnd.nextInt(45) + 1;
			System.out.print(lotto + " ");
			arr[i] = lotto;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = rnd.nextInt(45) + 1;
				}
			}
		}
		System.out.println();
//		System.out.println(Arrays.toString(arr));
	}// end of makeLotto
}// end of class
// Scailing & Shifting