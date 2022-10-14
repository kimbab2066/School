package Java.week7;

import java.util.Scanner;

public class 별찍기v2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 입력:");
		int n = in.nextInt();
		// 1번
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// 2번
//		for (int i = n; i > 0; i--) {
//			for (int j = i; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// 3번
//		for (int i = 1; i <= n; i++) {
//			for (int k = i; k < n; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// 4번
//		for (int i = n; i > 0; i--) {
//			for (int k = n; k > i; k--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// 5번
//		for (int i = 1; i <= n; i++) {
//			for (int k = n - i; k > 0; k--) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i * 2 - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// 6번
//		for (int i = n; i > 0; i--) {
//			for (int k = 0; k < n - i; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i * 2 - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}// end of main
}// end of class