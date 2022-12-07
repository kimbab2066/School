package Java.week15;

import java.util.Random;
import java.util.Scanner;

public class 야구게임 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int com, c1, c2, c3;
		int user, u1, u2, u3;
		// 변수
		int strike = 0, ball = 0, cnt = 0;
		while(true) {
			com = rnd.nextInt(886) + 102;
			c3 = com % 10;
			c2 = com / 10 % 10;
			c1 = com / 100 % 10;
			if (c1 == c2 || c2 == c3 || c1 == c3) continue;
			else break;
		}
		do {
			while(true) {
				System.out.print("숫자 3자리 입력:");
				user = in.nextInt();
				u3 = user % 10;
				u2 = user / 10 % 10;
				u1 = user / 100;
				if (u1 == u2 || u2 == u3 || u1 == u3) continue;
				else break;
			}
			strike = ball = 0;
			if (u1 == c1) strike++;
			else if (u1 == c2 || u1 == c3) ball++;
			if (u2 == c2) strike++;
			else if (u2 == c1 || u2 == c3) ball++;
			if (u3 == c3) strike++;
			else if (u3 == c1 || u3 == c2) ball++;
			System.out.println(strike + " strike " + ball + " ball");
			cnt++;
		} while (strike < 3);
		System.out.printf("***축하합니다.%d번만에 맞추셨습니다!!***", cnt);
	}// main
}// class