package Java.week6;

import java.util.Scanner;

public class forTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		zeroToFour();
//		System.out.println(intSum());
//		evenNumber();
		System.out.print("정수 입력: ");
		int n = in.nextInt();
		System.out.println(n + "! = " + factorial(n));
		// 약수 계산하기
//		System.out.print("양의 정수를 입력하시오: ");
//		divisor(in.nextInt());

	}// end of main

	// 0부터 4까지 출력하기
	static void zeroToFour() {
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// 1~10정수의 합 계산하기
	static int intSum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	// 1~100까지 짝수만 출력
	static void evenNumber() {
		int sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println("\n합계:" + sum);
	}

	// 팩토리얼 계산하기
	static long factorial(int n) {
		//실수인 경우 Ek와 같이 10의 k제곱으로 나옴
		long fact = 1;
//		for (int i = num; i > 0; i--) {
//			n *= i;
//		}
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	// 약수 계산하기
	static void divisor(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	// 난수의 합 계산하기
	static void randomNumber(int n) {
		for (int i = 0; i < 2; i++) {
			int rand = (int) (Math.random() * 100) + 1;
			System.out.println(rand);
		}
	}
}// end of class