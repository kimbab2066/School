package Java.week5;

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
//		  int x = 3; if (x >= 0) if (x == 0) System.out.println("첫 번째 문자열"); else
//		  System.out.println("두 번째 문자열"); System.out.println("세 번째 문자열");
//		 
//		// 3번
//		int age = 22;
//
//		if (age > 20)
//			System.out.println("1번  그룹\n");
//		else
//			System.out.println("2번  그룹\n");
//		System.out.println("입니다.\n");
//		// 4-2
//		  int age = 66;
//		  
//		  if (age > 20) if (age < 65) System.out.println("1번  그룹"); else
//		  System.out.println("2번  그룹");
//		 
		// 5번
//		int age = 18;
//		if (0 < age && age < 18) {
//			System.out.println("청소년");
//		}
//		int x = 0;
//		if (x == 0) {
//			System.out.println("x는 0이다");
//		}

		// 스위치는 정수형과 문자형만 가능
		int grade = 3;
		switch (grade) {
		case 4:
			System.out.println("만점");
			break;
		case 0:
			System.out.println("영점");
			break;
		}

		// 6번
//		int i = 0;
//		while (i < 10) {
//			System.out.println("i=" + i);
//			i += 3;
//		}
		// 0 3 6 9 출력
		int x, y;
		for (x = 0; x < 3; x++) {
			for (y = 2; y >= 0; y--) {
				System.out.println("*");
			}
		}
		// 3row 2column *
		int i = 0, sum = 0;
		while (i < 10) {
			sum += i++;
			if (i % 3 == 0)
				continue;
			System.out.println("i=" + i);
			if (sum > 10)
				break;
		}
		// 0 1 2 4 5 7 8

		// 7번

		/*
		 * 14번
		 * 
		 * System.out.print("영문자를 입력해주세요 : "); String alpha = in.next();
		 * System.out.println(conVo(alpha));
		 */
	}// end of main

	// 14번(수정해야됨 문자 1개의 모음 자음을 찾아라)
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