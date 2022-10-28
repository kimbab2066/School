package Java.week9;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	static int userCnt, comCnt;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 1. 사용자 선택 1가위 2바위 3보를 선택하여 컴퓨터와 승리를 가린다.
		// 2. 5판을 반복하여 스코어를 나타내고 승리자를 출력해준다
		while (userCnt + comCnt != 5) {
			System.out.print("사용자 선택[1:가위,2:바위,3:보]:");
			int user = in.nextInt();
			rps(user);
		}
		System.out.printf("스코어:[컴]%d:%d[사용자]\n", comCnt, userCnt);
		String result = userCnt > comCnt ? "사용자" : "컴퓨터";
		System.out.printf("***%s의 승리로 게임이 종료되었습니다.***", result);
	}// end of main

	static void rps(int user) {
		Random rnd = new Random();
		int com = rnd.nextInt(3) + 1;
		System.out.printf("-컴:%d\n-사용자:%d\n", com, user);
		if (user == 1) {
			if (com == 1) {
				System.out.println("비겼습니다.");
			} else if (com == 2) {
				System.out.println("컴퓨터 승리!");
				comCnt++;
			} else if (com == 3) {
				System.out.println("사용자 승리!");
				userCnt++;
			}
		} else if (user == 2) {
			if (com == 1) {
				System.out.println("사용자 승리!");
				userCnt++;
			} else if (com == 2) {
				System.out.println("비겼습니다.");
			} else if (com == 3) {
				System.out.println("컴퓨터 승리!");
				comCnt++;
			}
		} else if (user == 3) {
			if (com == 1) {
				System.out.println("컴퓨터 승리!");
				comCnt++;
			} else if (com == 2) {
				System.out.println("사용자 승리!");
				userCnt++;
			} else if (com == 3) {
				System.out.println("비겼습니다.");
			}
		} else {
			System.out.println("잘못 입력하였음.");
		}
	}// end of rps
}// end of class