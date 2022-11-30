package Java.과제5;

import java.util.Scanner;

class Test {
	int sum(int x, int y) {
		return x + y;
	}

	int sum(int x, int y, int z) {
		return x + y + z;
	}

	double sum(double x, double y) {
		return x + y;
	}
}

public class 과제5주차 {
	public static void main(String[] args) {
		test14();
	}// main

	static void test1() {
		NumberBox box = new NumberBox();
		box.value = 10;
		box.fvalue = 1.2345f;
		System.out.println("value : " + box.value + "\nfvalue : " + box.fvalue);
	}

	static void test2() {
		String verb = "현실이 된다";
		System.out.println("생각이" + verb);
		String s = "1234567";
		System.out.println("문자열의 길이는" + s.length());
		s = "ABCDEFG";
		s.toLowerCase();
		System.out.println(s);
		System.out.println("2 + 3 = " + (2 + 3));
		System.out.println("2 + 3 = " + 2 + 3);
	}

	static void test3() {
		Student std = new Student();
		std.setName("박박");
		std.setRollno(2201033);
		std.setAge(25);
		System.out.println("이름은:" + std.getName() + "\n학번은:" + std.getRollno() + "\n나이는:" + std.getAge());
	}

	static void test4() {
		Rectangle r = new Rectangle();
		r.w = 14;
		r.h = 20;
		System.out.println("넓이:" + r.area());
		System.out.println("둘레:" + r.perimeter());

	}

	static void test5() {
		float f1[], f2[];
		f1 = new float[10];
		f2 = f1;
		System.out.println("f2[0] = " + f2[0]);
	}

	static void test6() {
		String a = "javaprogramming";
		a = a.substring(5, 7);// ro
		char b = a.charAt(1);// o
		a = a + b;// roo
		System.out.println(a);
	}

	static void test7() {
		String x = "abc";
		x.toUpperCase();
		String y = x.replace('a', 'b');// bbc
		y = y + "xyz";// bbcxyz
		System.out.println(y);
	}

	static void test8() {
		Test t = new Test();
		int val1 = t.sum(1, 2);
		int val2 = t.sum(1, 2, 3);
		double val3 = t.sum(99.2, 52.30);
		System.out.println("val3:" + val3);
//		System.out.println("va1:" + val1 + "\nval2:" + val2);
	}

	static void test9() {
		Date d = new Date();
		d.day = 30;
		d.month = 5;
		d.year = 2022;
		d.print1();
		d.print2();
	}

	static void test10() {
		ComplexNumber c = new ComplexNumber(1, 2);
		ComplexNumber c2 = new ComplexNumber(2, 3);
		ComplexNumber c3 = new ComplexNumber(3, 4);
		ComplexNumber c4 = new ComplexNumber(4, 5);
		c = c.addComplex(c2);
		c2 = c2.subComplex(c3);
		c3 = c3.mulComplex(c4);
		c4 = c4.divComplex(c);
		System.out.println("더하기:" + c + "\n빼기:" + c2 + "\n곱하기:" + c3 + "\n나누기:" + c4);
	}

	static void test11() {
		Movie m = new Movie();
		m.title = "김밥33";
		m.grade = 3.4;
		m.director = "박박";
		m.year = 2021;
		m.print();
	}

	static void test12() {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	static void test13() {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int vowel = 0, consonant = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'i' || ch == 'e' || ch == 'u' || ch == 'a' || ch == 'o') {
				vowel++;
			} else {
				consonant++;
			}
		}
		System.out.println("자음:" + consonant + "\n모음:" + vowel);
	}

	static void test14() {
		String id = "kimbab";
		Scanner in = new Scanner(System.in);
		String str = in.next();
		if (id.equals(str)) {
			System.out.println("일치합니다.");
		} else {
			System.out.println("존재하지 않은 아이디입니다.");
		}
	}
}// class