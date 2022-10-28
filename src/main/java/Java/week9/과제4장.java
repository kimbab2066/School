package Java.week9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 과제4장 {
	public static void main(String[] args) {
		test21();
	}// end of main

	static void test01() {
		int[] n1;
		char[] n2;
//		int [6] n3;
//		Dog myDogs[];
//		Dog myDogs[7];
		// 1,2번은 가능하고 4번은 Dog라는 객체를 만들 경우 가능하다
	}// end of test01

	static void test02() {
//		float[]f= new float(3);
//		float f2[] = new float[];
		float[] f1 = new float[3];
		float f3[] = new float[3];
		float f5[] = { 1.0f, 2.0f, 2.0f };
		// 1,2번이 잘못되었다. 1번은 소괄호를 바꿔줘야하고 2번은 배열의 초기 크기가 정해지지 않았다.
	}// end of test02

	static void test03() {
		int[] scores = { 1, 2, 3 };
		int[][] scores2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		String cats[] = { "abc", "def", "hij" };
		boolean results[] = new boolean[] { true, false, true };
		// 2번이 잘못되었다. 1차원 배열의 요소 형태가 아닌 {}로 전체를 한 번 더 감싸 2차원 배열로 만들어주어야 한다.
	}// end of test03

	static void test04() {
		int[] studentNumbers = new int[30];
		double[] values = new double[] { 1.2, 3.3, 6.7 };
	}// end of test04

	static void test05() {
		// 1번은 타입이 들어가야할 부분에 변수명이 들어갔다.
		// 2번은 []대괄호가 빠졌고 선언과 정의를 합쳐서 적었다.
		// 해결 결과
		int[] numbers = new int[100];
		double[] rainfalls = new double[100];
	}// end of test05

	static void test06() {
		// 1번 0~4까지, 이유 : 배열타입의 변수는 주소값을 가지는데 그 주소값이 시작되는 번호가 0번부터이다.
		// 2번 ArrayIndexOutOfBoundsException의 에러가 발생한다.
		int[] employees = new int[5];
		System.out.println(employees);
	}// end of test06

	static void test07() {
		float f[] = new float[2];
		System.out.println("f[0]= " + f[0]);
		// float의 초기 값인 0.0이 출력된다.
	}// end of test07

	static void test08() {
		double values[] = new double[5];
		for (int i = 0; i < values.length; i++) {
			values[i] = 0;
		}
		System.out.println(Arrays.toString(values));
	}// end of test08

	static void test09() {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[5];
		b = a;
		System.out.println(Arrays.toString(b));
		// 배열이 얕은 복사된다.
	}// end of test09

	static void test10() {
		String[] employees = new String[10];
		String name = "홍길동";
		employees[0] = name;
		name = null;
		for (int i = 0; i < employees.length; i++) {
			System.out.print(employees[i] + " ");
		}
		// String배열의 기본값은 null이기에 null이 아닌 참조는 1개 존재한다.
	}// end of test10

	static void test11() {
		int[] x;
//		System.out.println(x[0]);
		// 초기화 되지 않았다는 에러를 나타낸다.
	}// end of test11

	static void test12() {
		double[] arr = new double[] { 1.0, 2.0, 3.0, 4.0 };
		double sum = 0, max = 0;
		for (double val : arr) {
			sum += val;
			System.out.print(val + " ");
			if (max < val) {
				max = val;
			}
		}
		System.out.printf("\n합은 %.1f\n최대값은 %.1f", sum, max);
	}// end of test12

	static void test13() {
		double[] arr = new double[] { 1.0, 2.0, 3.0, 4.0 };
		for (double val : arr) {
			System.out.print(val + " ");
		}
	}// end of test13

	static void test14() {
		int[] arr = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Arrays.sort(arr);
		int result = Arrays.binarySearch(arr, 3);
		System.out.printf("%d의 위치 : %d", 3, result);
	}// end of test14

	static void test15() {
		String[] arr = new String[] { "Hello", "Java", "World" };
		for (String val : arr) {
			System.out.println(val);
		}
	}// end of test15

	static void test16() {
		int[] arr = new int[56];
		int[] arr2 = new int[5];
		boolean result = Arrays.equals(arr, arr2);
		System.out.println(result);
	}// end of test16

	static void test17() {
		double[][] vectors = new double[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				vectors[i][j] = Math.random();
			}
		}
		double result = vectors[0][0] * vectors[1][0] + vectors[0][1] * vectors[1][1] + vectors[0][2] * vectors[1][2];
		System.out.printf("벡터의 내적 : " + result);
	}// end of test17

	static void test18() {
		String[] cards = new String[] { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] numbers = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
				"Ace" };
		Random rnd = new Random();
		int card = rnd.nextInt(4);
		int number = rnd.nextInt(13);
		System.out.printf("%s의 %s", cards[card], numbers[number]);

	}// end of test18

	static void test19() {
		int[] arr = new int[101];
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;
			arr[num]++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d - %d:", 10 * i + 1, (i + 1) * 10);
			// 1-10까지의 *을 찍어줘야함
			for (int j = 10 * i + 1; j <= (i + 1) * 10; j++) {
				for (int k = 0; k < arr[j]; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}// end of test19

	static void test20() {
		Scanner in = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오:");
		final int STUDENT = in.nextInt();
		int[] arr = new int[STUDENT];

		for (int i = 0; i < STUDENT; i++) {
			System.out.printf("학생 %d의 성적을 입력하시오:", i + 1);
			int score = in.nextInt();
			while (0 < score && score > 100) {
				System.out.println("잘못된 성적입니다. 다시입력하시오.");
				System.out.printf("학생 %d의 성적을 입력하시오:", i + 1);
				score = in.nextInt();
			}
			arr[i] = score;
		}
		double sum = 0;
		for (int val : arr) {
			sum += val;
		}
		System.out.printf("성적 평균은 %.1f입니다.", sum / STUDENT);
	}// end of test20

	// 63 - 51 =12
	static void test21() {
		String[] hexa2bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		Scanner in = new Scanner(System.in);
		System.out.print("16진수 문자열을 입력하시오:");
		String str = in.next();
		System.out.printf("%s에 대한 이진수는 ", str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (97 <= ch && ch <= 102) {
				ch -= 87;
				System.out.print(hexa2bin[ch] + " ");
			} else if (65 <= ch && ch <= 70) {
				ch -= 55;
				System.out.print(hexa2bin[ch] + " ");
			} else {
				System.out.print(hexa2bin[ch - '0'] + " ");
			}
		}
		System.out.print("입니다.");
	}// end of test21
}// end of class