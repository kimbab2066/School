package Java.week10;

import java.util.Random;
import java.util.Scanner;

public class 배열수업 {
	public static void main(String[] args) {
		// 0~100까지의 난수를 20개를 집어 넣어서 최대값과 최소값이 찍히도록
//		randomMinMax();
//		searchName();
		movieReserve();
//		lotto();
//		dictionary();
	}// end of main

	static void randomMinMax() {
		int[] arr = new int[21];
		Random rnd = new Random();
		int max = -1, min = 101;
		for (int i = 1; i <= 20; i++) {
			arr[i] = rnd.nextInt(101);
			System.out.printf("%3d ", arr[i]);
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
			if (i % 5 == 0)
				System.out.println();
		}
		System.out.printf("최소값 : %d 최대값 : %d", min, max);
	}// end of randomMinMax

	static void searchName() {
		String[] name = new String[] { "홍길동", "김밥", "이이", "수수", "박박" };
		Scanner in = new Scanner(System.in);
		System.out.print("찾을 사람의 이름:");
		String search = in.next();
		for (int i = 0; i < name.length; i++) {
			// 문자열은 주소값을 비교하기에 equals 메서드를 사용해서 비교해야 함
			if (search.equals(name[i])) {
				System.out.println((i + 1) + "번째 입니다.");
				break;
			}
			if (i == name.length - 1)
				System.out.printf("%s는 없는 사람.", search);
		}
	}// end of searchName

	static void movieReserve() {
		int num = -100;
		Scanner in = new Scanner(System.in);
		int[] cnt = new int[11];
		while (true) {
			System.out.println("----------------------------------------");
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%3d ", i);
			}
			System.out.println("\n----------------------------------------");
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%3d ", cnt[i]);
			}
			System.out.print("\n원하시는 좌석번호를 입력하세요(종료는 -1):");
			num = in.nextInt();
			if (num == -1) {
				System.out.println("종료.");
				break;
			}
			if (1 <= num && num <= 10) {
				if (cnt[num] != 0) {
					System.out.println("이미 예약된 자리입니다.");
				} else {
					System.out.println("예약되었습니다.");
					cnt[num]++;
				}
			} else {
				System.out.println("잘못 입력한 번호입니다.");
			}
		}
	}// end of movieReserve

	static void lotto() {
		Random rnd = new Random();
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			int num = rnd.nextInt(45) + 1;
			lotto[i] = num;
			for (int j = 0; j < 6; j++) {
				if (i != j && lotto[i] == lotto[j]) {
					lotto[j] = rnd.nextInt(45) + 1;
					break;
				}
			}
		}
		System.out.println("===== 로또 복권번호 생성 =====");
		for (int val : lotto) {
			System.out.print(val + " ");
		}
	}// end of lotto

	static void dictionary() {
		while (true) {
			System.out.println("===== 간단 주소록 메뉴 =====");
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 출력");
			System.out.println("4. 종료");
			System.out.println("=======================");
			Scanner in = new Scanner(System.in);
			System.out.print("-메뉴 선택:");
			int menu = in.nextInt();
			switch (menu) {
			case 1:

			case 2:

			case 3:

			case 4:
				System.out.println("종료.");
				break;
			}// end of switch
		}
	}
}// end of class