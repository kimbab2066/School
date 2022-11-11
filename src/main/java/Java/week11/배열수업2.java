package Java.week11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열수업2 {
	public static void main(String[] args) {
//		lotto();
//		lotto2();
//		dictionary();
		System.out.println(sum(new int[] { 1, 2, 3, 4 }));
		if(args.length>0) {
			for(String str : args) {
				System.out.print(str + " ");
			}
			if(args[0].equals("-h")) System.out.println("HELP");
		}
	}// end of main

	static void lotto() {
		Random rnd = new Random();
		int[] lotto = new int[46];
		int[] result = new int[6];
		System.out.println("=====로또 복권번호 생성=====");
		for (int i = 0; i < 6; i++) {
			result[i] = rnd.nextInt(45) + 1;
			if (lotto[result[i]] == 1) i--;
			else lotto[result[i]] = 1;
		}
		int [] lottoCopy = Arrays.copyOf(result, result.length);
		for (int val : result) System.out.print(val + " ");
	}// end of lotto

	static void lotto2() {
		Random rnd = new Random();
		int[] lotto = new int[46];
		int[] result = new int[6];
		System.out.println("=====로또 복권번호 생성=====");
		for (int i = 0; i < 6; i++) {
			result[i] = rnd.nextInt(45) + 1;
			if (lotto[result[i]] == 0) lotto[result[i]] = 1;
			else i--;
			System.out.print(result[i] + " ");
		}
	}//end of lotto2

	static void dictionary() {
		String names[] = new String[10];
		String phones[] = new String[10];
		Scanner in = new Scanner(System.in);
		int menu, i, size = 0;
		while (true) {
			System.out.println("===== 간단 주소록 메뉴 =====");
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 출력");
			System.out.println("4. 종료");
			System.out.println("=======================");
			System.out.print("- 메뉴 선택 : ");
			menu = in.nextInt();
			if (1 <= menu && menu <= 4) {
				String name;
				switch (menu) {
				case 1:
					System.out.println("=====주소록 등록 =====");
					System.out.print("-등록할 이름:");
					names[size] = in.next();
					System.out.print("-등록할 전화번호:");
					phones[size] = in.next();
					size++;
					break;
				case 2:
					System.out.println("===== 주소록 검색 =====");
					System.out.print("-검색할 이름:");
					name = in.next();
					for (i = 0; i < size; i++) {
						if (name.equals(names[i])) {
							System.out.printf("-%s 전화번호:%s\n", names[i], phones[i]);
							break;
						}
					}
					if (i == size) {
						System.out.println("존재하지 않는 이름입니다.");
						break;
					}
					break;
				case 3:
					if (size > 0) {
						System.out.println("===== 주소록 출력 =====");
						for (i = 0; i < size; i++) {
							System.out.println(names[i] + " " + phones[i]);
						}
					} else {
						System.out.println("존재하지 않음.");
					}
					break;
				case 4:
					System.out.println("종료.");
					break;
				}// end of switch
				if (menu == 4)
					break;
			} else {
				System.out.println("없는 메뉴입니다.");
			}
		} // end of while
	}// end of dictionary

	static int sum(int[] numbers) {
		int total = 0;
		for (int i = 0; i < numbers.length; i++) total += numbers[i];
		return total;
	
	}// end of sum
	
	
	
}// end of class