package Java.week15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeProblem {
	public static void main(String[] args) {
//		test1();
		test4();
	}// main

	static void test1() {
		Scanner in = new Scanner(System.in);
		System.out.print("세균마리수:");
		int number = in.nextInt();
		System.out.print("경과시간:");
		int time = in.nextInt();
		if (!(1 <= number && number <= 10)) {
			System.out.println("세균 마리수가 범위를 벗어났음.");
			return;
		} else if (!(1 <= time && time <= 15)) {
			System.out.println("시간이 범위를 벗어났음.");
			return;
		}
		while (time-- > 0) {
			number *= 2;
		}
		System.out.println(number);
	}// test1

	static void test2() {
		Scanner in = new Scanner(System.in);
		int rInt = rndInt();
		System.out.println(rInt);
		int hund = rInt / 100;
		int ten = rInt / 10 % 10;
		int one = rInt % 10;
		int strike = 0, ball = 0, cnt = 0;
		while (true) {
			System.out.print("숫자 3자리 입력:");
			int num = in.nextInt();
			// 조건만 체크하면 끝
			int c1 = num / 100;
			int c2 = num / 10 % 10;
			int c3 = num % 10;
			//
			if (c1 == hund)
				strike++;
			else if (c1 == ten || c1 == one)
				ball++;
			if (c2 == ten)
				strike++;
			else if (c2 == hund || c2 == one)
				ball++;
			if (c3 == one)
				strike++;
			else if (c3 == hund || c3 == ten)
				ball++;
			if (strike == 3) {
				System.out.printf("***축하합니다.%d번만에 성공!!***", cnt);
				return;
			}
			// print
			if (ball >= 1 && (num / 100 == num / 10 % 10 || num / 10 % 10 == num % 10))
				ball = 1;
			if (strike >= 1 && (num / 100 == num / 10 % 10 || num / 10 % 10 == num % 10))
				ball = 0;
			System.out.println(strike + " strike " + ball + " ball");
			// 자리수 비교해서 같은 숫자인 경우를 제외
			cnt++;
			// 초기화
			strike = ball = 0;
		} // while
	}// test2

	static int rndInt() {
		int cnt = 0;
		Random rnd = new Random();
		int result = 0;
		// 102~987
		while (cnt != 3) {
			int idx = rnd.nextInt(10);
			// 백의 자리
			if (cnt == 0 && idx != 0) {
				result += idx * 100;
				cnt++;
			}
			// 십의 자리
			if (cnt == 1 && result / 100 != idx) {
				result += idx * 10;
				cnt++;
			}
			// 일의 자리
			if (cnt == 2 && result / 100 != idx && result / 10 % 10 != idx) {
				result += idx;
				cnt++;
			}
		}
		return result;
	}// rndInt

	static void test3() {
		Scanner in = new Scanner(System.in);
		String str;
		char[] arr;
		while (true) {
			System.out.print("문자열 입력:");
			str = in.next();
			if (0 < str.length() && str.length() < 100) {
				str = str.toLowerCase();
				arr = new char[str.length()];
//				arr = str.toCharArray();
				for (int i = 0; i < str.length(); i++) {
					arr[i] = str.charAt(i);
				}
				break;
			}
		}
		Arrays.sort(arr);
		System.out.print("출력:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		char tmp;
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			if (i < j) {
				tmp = arr[j];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		// 출력하면 끝
	}// test3

	static void test4() {
		Scanner in = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String str = in.next();
		System.out.print("자를 문자개수:");
		int n = in.nextInt();
		int len = str.length() / n;
		if (str.length() % n != 0) len++;
		String[] arr = new String[len];
		for (int i = 0; i < arr.length; i++) {
			if (str.length() < n) {
				arr[i] = str.substring(0);
				break;
			}
			// 0~7까지
			arr[i] = str.substring(0, n);
			str = str.substring(n);
		}
		//ceilDiv
		System.out.print("분리된 문자열:");
		System.out.println(Arrays.toString(arr));
//		System.out.print("분리된 문자열:[");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.printf("\"%s\"", arr[i]);
//			if (i < arr.length - 1) System.out.print(", ");
//		}
//		System.out.print("]");
	}// test4
}// class
