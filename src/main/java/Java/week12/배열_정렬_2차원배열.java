package Java.week12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열_정렬_2차원배열 {
	public static void main(String[] args) {
//		test1();
//		test2();
//		test2_2();
		test3();
//		divisor();
//		primeNumber();
//		sortTest();
//		array2d();
	}// end of main

	static void array2d() {
		// array.length = row.length
		// array[r].length = column.length
		int[][] arr = new int[3][5];
		int[] row = new int[3];
		int[] col = new int[5];
		int[] sort = new int[3 * 5];
		Random rnd = new Random();
		// input
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = rnd.nextInt(101);
				sort[i * 5 + j] = arr[i][j];
			}
		}
		// output
		Arrays.sort(sort);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sort[i * 5 + j];
			}
		}
		// old
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%5d", arr[i][j]);
				row[i] += arr[i][j];
				col[j] += arr[i][j];
			}
			System.out.println(" (" + row[i] + ")");
		}
		for (int val : col) System.out.print(" (" + val + ")");
	}// end of array2d

	static void sortTest() {
		Random rnd = new Random();
		int[] arr = new int[10];
		int[] dec = new int[10];
		int i, j, min, tmp;
		for (i = 0; i < 10; i++) arr[i] = rnd.nextInt(101);
//		for (i = 0; i < 10; i++)
//			System.out.print(arr[i] + " ");

//		for (i = 0; i < 10; i++) {
//			min = i;
//			for (j = i + 1; j < 10; j++) {
//				if (arr[min] > arr[j]) {
//					min = j;
//				}
//			}
//			tmp = arr[min];
//			arr[min] = arr[i];
//			arr[i] = tmp;
//		}
//		Arrays.sort(arr);
		// 오름차순
		int[] anc = Arrays.copyOf(arr, arr.length);
		Arrays.sort(anc);
		// 내림차순
		for (i = 0; i < 10; i++) dec[9 - i] = anc[i];

		for (int val : arr) System.out.print(val + " ");
		System.out.println();
		// 오름차순
		for (int val : anc) System.out.print(val + " ");
		System.out.println();
		// 내림차순
		for (int val : dec) System.out.print(val + " ");

	}// end of sortTest

	static void primeNumber() {
		// 1000이하의 완전수를 출력하라
		int[] prime = new int[100];
		int num, i, cnt = 0;
		System.out.println("소수 출력");
		for (num = 2; num <= 100; num++) {
			for (i = 2; i < num; i++) {
				if (num % i == 0) break;
			}
			if (i == num) prime[cnt++] = num;
		}
		for (int j = 0; j < cnt; j++) {
			System.out.printf("%5d", prime[j]);
			if ((j + 1) % 5 == 0) System.out.println();
		}
	}// end of primeNumber

	static void divisor() {
		Scanner in = new Scanner(System.in);
		int num, sum = 0;
		System.out.print("정수 입력:");
		num = in.nextInt();
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("\n약수의 합 : " + sum);
	}// end of t1

	static void test1() {
		// 1000이하의 완전수를 출력하라
		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) sum += j;
			}
			if (sum == i) System.out.print(i + " ");
		}
	}// end of test1

	static void test2() {
		int[][] arr = new int[3][9];
		// 2,3,4단의 결과를 저장해서 출력해라
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = (i + 2) * (j + 1);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}// end of test2

	static void test2_2() {
		int[][] arr = new int[9][3];
		// 2,3,4단의 결과를 저장해서 출력해라
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 3; i++) {
				arr[j][i] = (i + 2) * (j + 1);
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}// end of test2_2

	static void test3() {
		Scanner in = new Scanner(System.in);
		System.out.print("원하는 숫자 개수 입력:");
		int num = in.nextInt();
		Random rnd = new Random();
		int[] arr = new int[num];
		int odd = 0, even = 0;
		for (int i = 0; i < num; i++) {
			arr[i] = rnd.nextInt(101);
			if (arr[i] % 2 == 0) even += arr[i];
			else odd += arr[i];
		}
		Arrays.sort(arr);
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}

		System.out.print("배열 내용:");
		for (int val : arr) System.out.print(val + " ");
		System.out.println("\n홀수의 합:" + odd);
		System.out.println("짝수의 합:" + even);
		double avg = (double) (odd + even) / num;
		System.out.printf("평균:%.2f", avg);
	}// end of test3
}// end of class