package Java.week9;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	static int userCnt, comCnt;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 1. 사용자 선택 1가위 2바위 3보를 선택하여 컴퓨터와 승리를 가린다.
		// 2. 5판을 반복하여 스코어를 나타내고 승리자를 출력해준다
		while (userCnt < 3 && comCnt < 3) {
			System.out.print("사용자 선택[1:가위,2:바위,3:보]:");
			int user = in.nextInt();
			rps(user);
		}
		String result = userCnt > comCnt ? "사용자" : "컴퓨터";
		System.out.printf("***%s의 승리로 게임이 종료되었습니다.***", result);
	}// end of main

	static void rps(int user) {
		Random rnd = new Random();
		int com = rnd.nextInt(3) + 1;
		System.out.printf("-컴:%d\n-사용자:%d\n", com, user);
		// com % 3 == (user+1)%3
		// 가위 = 1, 바위 = 2, 보 = 3
		// com == 1 ? user = 2+1 %3 == 0 이러면 사용자 승리
		// com == 1 ? user = 1+1 %3 == 2 이러면 컴퓨터 승리
		// com == 2 ? user == 2 이러면 비겼음.
		if (com % 3 == (user + 1) % 3) {
			System.out.println("컴퓨터 승리!");
			comCnt++;
		} else if (com == user) {
			System.out.println("비겼습니다.");
		} else {
			System.out.println("사용자 승리!");
			userCnt++;
		}
		System.out.printf("스코어:[컴]%d:%d[사용자]\n", comCnt, userCnt);
	}// end of rps
}// end of class