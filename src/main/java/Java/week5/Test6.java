package Java.week5;

import java.util.Scanner;

//연습문제용
public class Test6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*
		 * 1번
		 * 
		 * int x = 0, y = 0, cnt = 0, max = 0, min = 0;
		 * 
		 * if (20 <= x && x <= 60) { cnt++; } if (x > y) { max = x; min = y; } else {
		 * max = y; min = x; } if (1 <= x && x <= 20) { y = x; } for (int i = 0;; i++) {
		 * 
		 * } while (true) { }
		 * 
		 */
		/*
		 * 2번
		 * 
		 * int x = 3; if (x >= 0) if (x == 0) System.out.println("첫 번째 문자열"); else
		 * System.out.println("두 번째 문자열"); System.out.println("세 번째 문자열");
		 * 
		 */
		int age = 22;

		if (age > 20)
			System.out.println("1번  그룹\n");
		else
			System.out.println("2번  그룹\n");
		System.out.println("입니다.\n");
		/*
		 * 4-2
		 * 
		 * int age = 66;
		 * 
		 * if (age > 20) if (age < 65) System.out.println("1번  그룹"); else
		 * System.out.println("2번  그룹");
		 * 
		 */
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