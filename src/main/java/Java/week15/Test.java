package Java.week15;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		test2();
	}// main

	static void test1() {

		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.print("문자열 입력:");
		s1 = in.next();
		s2 = in.next();
		int sum = Integer.valueOf(s1) + Integer.valueOf(s2);
		System.out.println(s1 + " + " + s2 + " = " + sum);
		System.out.println("이진수: " + Integer.toBinaryString(sum));
	}// test1

	static void test2() {
		String str;
		Scanner in = new Scanner(System.in);
		while (true) {
			// input
			System.out.print("문자열 입력:");
			str = in.next();
			// 종료 조건
			if (str.equals("quit")) break;
			// compare and output
			if (str.matches("^www\\.(.+)")) System.out.println(str + "은 www로 시작함.");
			else System.out.println(str + "은 www로 시작 안함.");
			
			// test
//			if(str.matches("[1-2][0-9][0-9][0-9][0-9][0-9][0-9]")) System.out.println(str+"은 학번임.");
//			else System.out.println(str + "은 학번이 아님.");
		}
	}// test2
}// class