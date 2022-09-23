package Java.week1ToWeek4;

import java.util.*;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 연습문제1
//      System.out.print("첫번째 정수 입력 : ");
//      int a = in.nextInt();
//      System.out.print("두번째 정수 입력 : ");
//      int b = in.nextInt();
//      System.out.println(a + " + " + b + " = " + sum(a, b));
//      // 연습문제2
//      System.out.print("정수 입력 : ");
//      int num = in.nextInt();
//      System.out.println("1의 자리 숫자는 " + onesPlace(num) + "입니다.");
		// 연습문제3
//      System.out.print("실수 입력 : ");
//      float f = in.nextFloat();
//      int d = (int) (f / 0.1);
//      System.out.printf("소수 첫째 자리 숫자는 %d 입니다.", d % 10);
		// 3장
//      System.out.print("정수를 입력하시오 : ");
//      int num = in.nextInt();
//      if (num % 2 == 0) {
//         System.out.println("짝수임");
//      } else {
//         System.out.println("홀수임");
//      }
//      System.out.println("프로그램 종료");
		// 3개의 정수를 입력받아 큰 숫자 출력.
		int num1, num2, num3, max, min;
		System.out.print("첫번째 정수 :");
		num1 = in.nextInt();
		System.out.print("두번째 정수 :");
		num2 = in.nextInt();
		System.out.print("세번째 정수 :");
		num3 = in.nextInt();
		max = num1;
		min = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		if (min > num2) {
			min = num2;
		}
		if (min > num3) {
			min = num3;
		}
		System.out.println("최대값:" + max + " 최소값: " + min);
	}// end of main

	static int sum(int a, int b) {
		return a + b;
	}

	static int onesPlace(int num) {
		return num % 10;
	}
}// end of class