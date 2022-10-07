
package Java.week6;

import java.util.Scanner;

public class whileTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.print("숫자 입력 : ");
		// int i = in.nextInt();
		// welcome(i);
		// i = 0;
		// zeroToNine(i);

//		System.out.print("개수 입력 : ");
//		hundredToEven(in.nextInt());
//		System.out.print("출력할 단 입력 : ");
//		int dan = in.nextInt();
//		multiplicationTable(dan);

//		multipTable();
		multipTable2();
		// 1~10까지 합계
//		System.out.println(sumOneToTen());
//		System.out.print("숫자 입력:");
//		sumOneToTen2(in.nextInt());
		// do-while
//		int mon;
//		do {
//			System.out.print("올바른 월을 입력하시오[1-12]:");
//			mon = in.nextInt();
//		} while (mon < 1 || mon > 12);
//		System.out.println("사용자가 입력한 월은 " + mon);
		// 최대 공약수 찾기
//		System.out.print("두 개의 정수를 입력하시오. : ");
//		int a = in.nextInt();
//		int b = in.nextInt();
//		int result = gcd(a, b);
//		System.out.println("최대 공약수는 " + result);
	}// end of main

	static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	static int gcd2(int a, int b) {
		if (b == 0)
			return a;
		return gcd2(b, a % b);
	}

	static void welcome(int i) {
		while (i > 0) {
			System.out.println("환영.");
			i--;
		}
		System.out.println("종료.");
	}// end of welcome

	static void zeroToNine(int i) {
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}
	}// end of oneToNine

	// 100이상 짝수 20개 출력
	static void hundredToEven(int number) {
		int hundred = 100;
		while (number > 0) {
			System.out.print(hundred + " ");
			hundred += 2;
			number--;
		}
	}// end of hundredToEven

	static void multiplicationTable(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}// end of 구구단

	// 2~9단까지 한 화면에 출력
	static void multipTable() {
		int i = 1;
		while (i < 10) {
			int j = 2;
			while (j < 10) {
				System.out.printf("%d * %d = %2d ", j, i, (j * i));
				j++;
			}
			System.out.println();
			i++;
		} // end of while
	}// end of multiTable

	static void multipTable2() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d * %d = %2d ", j, i, j * i);
			}
			System.out.println();
		}
	}// end of multiTable2

	static int sumOneToTen() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}// end of sumOneToTen

	static void sumOneToTen2(int n) {
		int sum = 0, i = 1;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	static void correctInput(int num) {

	}
}// end of class