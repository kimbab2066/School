package Java.week9;

import java.util.Scanner;

public class 수업1 {
	public static void main(String[] args) {
//		test1();
//		test2();
		test3();
//		test4();
//		test5();
//		test6();
//		test7();
	}// end of main

	static void test1() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}// end of test1

	static void test2() {
		Scanner in = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오:");
		final int STUDENT = in.nextInt();
		int[] arr = new int[STUDENT];
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번의 성적을 입력하시오:", i + 1);
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		System.out.printf("평균 성적은 %.2f입니다.", sum / STUDENT);
	}// end of test2

	static void test3() {
		Scanner in = new Scanner(System.in);
//		System.out.print("문자열 입력:");
//		String[] arr = in.nextLine().split(" ");
//		for (String val : arr) {
//			System.out.print(val + " ");
//		}
//		String[] menu = new String[5];
//		for (int i = 0; i < 5; i++) {
//			System.out.printf("%d번 메뉴:", i + 1);
//			menu[i] = in.nextLine();
//		}
//		for (String val : menu) {
//			System.out.print(val + " ");
//		}
		// 실수 5개 입력받아서 출력
		final int SIZE = 5;
		double[] fArr = new double[SIZE];
		for (int i = 0; i < SIZE; i++) {
			System.out.printf("%d번째 실수 입력: ", i + 1);
			double num = in.nextDouble();
			fArr[i] = num;
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.print(fArr[i] + " ");
		}
	}// end of test3

	static void test4() {
		int[] arr = { 1234, 124, 2315, 46346, 324 };
		int min = 99999, max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.printf("최대값 : %d\n최소값 : %d", max, min);
	}// end of test4

	static void test5() {
		int[] arr;
		arr = new int[] { 10, 20, 30, 40, 50 };
		Scanner in = new Scanner(System.in);
		System.out.print("탐색할 값을 입력하시오:");
		int value = in.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.printf("%d는 %d위치에 있습니다.", value, i);
				return;
			}
		}
		System.out.println("값이 없습니다.");
	}// end of test5

	static void test6() {
		final int SIZE = 6;
		System.out.println("==========");
		System.out.println("면  빈도");
		System.out.println("==========");
		int[] arr = new int[SIZE];
		for (int i = 0; i < 10000; i++) {
			arr[(int) (Math.random() * SIZE)]++;
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d  %d\n", i + 1, arr[i]);
		}

	}// end of test6

	static void test7() {
		final int SIZE = 6;
		System.out.println("=====주사위 빈도 별그래프=====");
		int[] arr = new int[SIZE];
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 6);
			arr[num]++;
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.printf("%d : ", i + 1);
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end of test7
}// end of class