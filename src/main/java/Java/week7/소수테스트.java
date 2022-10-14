package Java.week7;

import java.util.Scanner;

public class 소수테스트 {
	static boolean[] prime = new boolean[10001];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("소수 개수 입력: ");
		int n = in.nextInt();
		StringBuilder sb = new StringBuilder();
		makePrime();
		for (int i = 2; n > 0; i++) {
			if (!prime[i]) {
				sb.append(i + " ");
				n--;
			}
		}
		System.out.println(sb);
	}// end of main

	static void makePrime() {
		for (int i = 2; i <= 10000; i++) {
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}// end of makePrime
}// end of class
