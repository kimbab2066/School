package Java.week5;

import java.util.Arrays;
import java.util.Scanner;

//연습문제용
public class 과제 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		  //1번
//		  int x = 0, y = 0, cnt = 0, max = 0, min = 0;
//		  
//		  if (20 <= x && x <= 60) { cnt++; } if (x > y) { max = x; min = y; } else {
//		  max = y; min = x; } if (1 <= x && x <= 20) { y = x; } for (int i = 0;; i++) {
//		  
//		  } while (true) { }
		// 2번
//		int x = 3;
//		if (x >= 0)
//			if (x == 0)
//				System.out.println("첫 번째 문자열");
//			else
//				System.out.println("두 번째 문자열");
//		System.out.println("세 번째 문자열");

//		// 4
		// 4-1
//		int age = 22;
//
//		if (age > 20)
//			System.out.println("1번  그룹\n");
//		else
//			System.out.println("2번  그룹\n");
//		System.out.println("입니다.\n");
//		// 4-2
//		int age = 66;
//
//		if (age > 20)
//			if (age < 65)
//				System.out.println("1번  그룹");
//			else
//				System.out.println("2번  그룹");

		// 5번
//		int age = 25;
//		if (0 < age && age < 18) {
//			System.out.println("청소년");
//		}
//		int x = 5;
//		if (x == 0) {
//			System.out.println("x는 0이다");
//		}

		// 스위치는 정수형과 문자형만 가능
//		int grade = 0;
//		switch (grade) {
//		case 4:
//			System.out.println("만점");
//			break;
//		case 0:
//			System.out.println("영점");
//			break;
//		default:
//			System.out.println(grade + "점");
//		}

		// 6번
//		int i = 0;
//		while (i < 10) {
//			System.out.println("i=" + i);
//			i += 3;
//		}
		// 0 3 6 9 출력
//		int x, y;
//		for (x = 0; x < 3; x++) {
//			for (y = 2; y >= 0; y--) {
//				System.out.println("*");
//			}
//		}
		// *9개
//		int i = 0, sum = 0;
//		while (i < 10) {
//			sum += i++;
//			if (i % 3 == 0)
//				continue;
//			System.out.println("i=" + i);
//			if (sum > 10)
//				break;
//		}
		// 0 1 2 4 5 7 8

		// 7번
		// 7-1
//		int sum = 0;
//		for (int i = 1; i <= 30; i++) {
//			sum += i * i + 1;
//		}
//		System.out.println(sum);
//		// result = 9485
//		// 7-2
//		int sum = 0;
//		for (int i = 10; i <= 30; i++) {
//			for (int j = 0; j <= 5; j++) {
//				sum += i * j;
//			}
//		}
//		System.out.println(sum);// 6300

		// 8
		// 8-1,2,3 = second\nthir, x>=0인데 0이 아닐경우 second하고 무조건 나오는 third,OK
//		int x = 3;
//		if (x >= 0) {
//			if (x == 0) {
//				System.out.println("first");
//			} else {
//				System.out.println("second");
//			}
//		}
//		System.out.println("third");
		// 9
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (!(i % 3 == 0 || i % 4 == 0)) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);// 2499

		// 10
//		System.out.print("정수를 입력하세요:");
//		int num = in.nextInt();
//		switch (num) {
//		case 1:System.out.println("ONE");break;
//		case 2:System.out.println("TWO");break;
//		case 3:
//			System.out.println("THREE");break;
//		case 4:
//			System.out.println("FOUR");break;
//		case 5:
//			System.out.println("FIVE");break;
//		case 6:
//			System.out.println("SIX");break;
//		case 7:
//			System.out.println("SEVEN");break;
//		case 8:
//			System.out.println("EIGHT");break;
//		case 9:
//			System.out.println("NINE");break;
//		default:
//			System.out.println("OTHER");break;
//		}
		// 11
//		int total = 0, sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//			total += sum;
//		}
//		System.out.println(total);
		// 12
//		int[] arr = new int[3];
//		for (int i = 0; i < 3; i++) {
//			System.out.print("정수를 입력하세요:");
//			arr[i] = in.nextInt();
//		}
//
//		for (int i = 0; i < 2; i++) {
//			for (int j = 1; j < 3; j++) {
//				if (arr[i] > arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for (int val : arr) {
//			System.out.print(val + " ");
//		}
		// 13
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6; j++) {
//				if (i + j == 6) {
//					System.out.println("(" + i + "," + j + ")");
//				}
//			}
//		}
		// 14
//		System.out.print("영문자를 입력해주세요 : ");
//		String alpha = in.next();
//		System.out.println(conVo(alpha));
		// 15
//		System.out.print("키와 몸무게를 입력해주세요:");
//		int height = in.nextInt();
//		int weight = in.nextInt();
//		double averageW = (height - 100) * 0.9;
//		if (weight > averageW) {
//			System.out.println("과체중");
//		} else if (weight == averageW) {
//			System.out.println("표준");
//		} else {
//			System.out.println("저체중");
//		}
		// 16
//		for (int x = 0; x <= 10; x++) {
//			for (int y = 0; y <= 10; y++) {
//				if (3 * x + 10 * y == 100) {
//					System.out.println("(" + x + "," + y + ")");
//				}
//			}
//		}
		// 17
//		for (int x = 0; x <= 10; x++) {
//			for (int y = 0; y <= 10; y++) {
//				for (int z = 0; z <= 10; z++) {
//					if (x + y + z == 10) {
//						System.out.printf("(%d,%d,%d)\n", x, y, z);
//					}
//				}
//			}
//		}
		// 18
//		int min = Integer.MAX_VALUE;
//		for (int i = 0; i < 3; i++) {
//			System.out.print("정수 입력:");
//			int val = in.nextInt();
//			if (min > val) {
//				min = val;
//			}
//		}
//		System.out.println(min);
		// 19
//		System.out.print("x값을 입력해주세요:");
//		int x = in.nextInt();
//		if (x >= 0) {
//			x = (x * x * x) - 9 * x + 2;
//			System.out.println(x);
//		} else {
//			System.out.println(7 * x + 2);
//		}
		// 20
//		boolean[] prime = new boolean[101];
//		StringBuilder sb = new StringBuilder();
//		for (int i = 2; i <= 100; i++) {
//			for (int j = i * i; j <= prime.length; j += i) {
//				prime[j] = true;
//			}
//			if (!prime[i]) {
//				sb.append(i + " ");
//			}
//		}
//		System.out.println(sb);
		// 21
//		int cnt = 0;
//		for (int a = 1; a <= 100; a++) {
//			for (int b = 1; b <= 100; b++) {
//				for (int c = 1; c <= 100; c++) {
//					if (a * a + b * b == c * c) {
//						cnt++;
//					}
//				}
//			}
//		}
//		System.out.println(cnt);
		// 22
//		for (int i = 1; i <= 10; i++) {
//			for (int j = 1; j <= 10; j++) {
//				System.out.printf("%-3d ", i * j);
//			}
//			System.out.println();
//		}
		// 23
//		System.out.print("문자 입력해주세요(+-*/):");
//		char oper = in.next().charAt(0);
//		System.out.print("숫자 입력:");
//		double a = in.nextInt();
//		System.out.print("숫자 입력:");
//		double b = in.nextInt();
//		if (a < b) {
//			double tmp = a;
//			a = b;
//			b = tmp;
//		}
//		if (oper == '+') {
//			a += b;
//		} else if (oper == '-') {
//			a -= b;
//		} else if (oper == '*') {
//			a *= b;
//		} else if (oper == '/') {
//			if (a != 0) {
//				a /= b;
//			}
//			System.out.printf("결과:%.1f", a);
//			System.exit(0);
//		}
//		System.out.printf("결과: %.0f", a);
		// 24
//		System.out.print("몇 번째 항까지만 출력하시겠습니까?:");
//		int stop = in.nextInt();
//		long a = 0, b = 1, c;
//		int i;
//		for (i = 2; i <= 10; i++) {
//			if (stop == i - 2) {
//				break;
//			}
//			c = a + b;
//			a = b;
//			b = c;
//			System.out.println(a);
//
//		}
		// 25
		System.out.print("n을 입력하세요:");
		int n = in.nextInt();
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += (1 / i);
		}
		System.out.println("수열의 합은 : " + sum);
	}// end of main

	static String conVo(String str) {
		String result = "";
		char c = str.charAt(0);
		switch (c) {
		case 'a':
		case 'A':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		case 'i':
		case 'I':
		case 'e':
		case 'E':
			result = "모음";
			break;
		default:
			result = "자음";
			break;
		}
		return str + "는 " + result + "입니다.";
	}// end of conVo
}// end of class