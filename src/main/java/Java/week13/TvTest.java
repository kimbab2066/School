package Java.week13;

import java.util.Scanner;

public class TvTest {
	public static void main(String[] args) {
		test2();
	}// main

	static void test1() {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

	static void test2() {
		Scanner in = new Scanner(System.in);
		System.out.print("수학 과학 영어 순으로 3개 입력:");
		int math = in.nextInt();
		int science = in.nextInt();
		int english = in.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.printf("평균은 %d", me.average());
		in.close();
	}
}// class