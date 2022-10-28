package Java.week9;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
	static int userCnt, comCnt;
	static Random rnd = new Random();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("[1:가위,2:바위,3:보]사용자 입력:");
			int user = in.nextInt();
			rps(user);
		} while (userCnt < 3 && comCnt < 3);

		System.out.printf("스코어:컴[%d]:사용자[%d]", comCnt, userCnt);
	}// end of main

	static void rps(int user) {
		int com = rnd.nextInt(3) + 1;
		System.out.printf("현황:컴(%d):사용자(%d)", comCnt, userCnt);
		if (com == user) {
			System.out.println("비겼음.");
		} else if (com % 3 == (user + 1) % 3) {
			System.out.println("컴퓨터 승리!");
			comCnt++;
		} else {
			System.out.println("사용자 승리!");
			userCnt++;
		}

	}// end of rps
}// end of class