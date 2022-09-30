package Java.week5;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int location = 0, x, y;
		System.out.println("*** 점의 좌표를 입력하세요 ***");
		Scanner in = new Scanner(System.in);
		System.out.print("X좌표:");
		x = in.nextInt();
		System.out.print("Y좌표:");
		y = in.nextInt();

		System.out.printf("좌표[%d,%d]는 ", x, y);
		if (x == 0 || y == 0) {
			System.out.println("사분면이 아닙니다.");
			System.exit(0);
		}
		if (x > 0) {
			if (y > 0) {
				System.out.print("1사분면의 점입니다.");
				System.exit(0);
			} else {
				System.out.println("4사분면의 점입니다.");
				System.exit(0);
			}
		} else {
			if (y > 0) {
				System.out.print("2사분면의 점입니다.");
				System.exit(0);
			} else {
				System.out.println("3사분면의 점입니다.");
				System.exit(0);
			}
		}
	}// end of main
}// end of class