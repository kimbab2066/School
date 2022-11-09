package Java.week10;

import java.util.Random;

public class 연습문제 {
	public static void main(String[] args) {
//		test1();
		test2();
//		test3();
	}// end of main

	static void test1() {
		Random rnd = new Random();
		int[] arr = new int[100];
		System.out.println("####주사위 100번 던진 결과 ####");
		for (int i = 0; i < 100; i++) {
			arr[i] = rnd.nextInt(6) + 1;
			System.out.print(arr[i] + " ");
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
	}

	static void test2() {
		Random rnd = new Random();
		int[] arr = new int[7];
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(6) + 1;
			arr[num]++;
		}
		System.out.println("####주사위 100번 던진 결과 ####");
		for (int i = 1; i <= 6; i++) {
			System.out.printf("%d:%d개 : ", i, arr[i]);
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 내림차순의 별모양으로 출력해보기
	static void test3() {
		Random rnd = new Random();
		int[] arr = new int[7];
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(6) + 1;
			arr[num]++;
		}
		// 빈도 수 내림차순
		System.out.println("####주사위 100번 던진 결과 ####");
		int[] freq = arr;
		// 가장 큰 값을 찾는다
		// loop를 돈다
		// 값을 0으로 바꿔준다
		int idx = -1, cnt = 0;
		while (cnt != 6) {
			for (int i = 2; i <= 6; i++) {
				int val = 0;
				val = Math.max(arr[1], arr[i]);
				for (int k = 1; k <= 6; k++) {
					if (val == arr[k]) {
						idx = k;
					}
				}
			}
			for (int i = 0; i < arr[idx]; i++) {
				System.out.print("*");
			}
			System.out.println();
			arr[idx] = 0;
			cnt++;
		} // end of while
	}// end of test3
}// end of class