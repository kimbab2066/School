package Java.week5;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int location = 0, x, y;
		System.out.println("*** 점의 좌표를 입력하세요 ***");
		Scanner in = new Scanner(System.in);
		System.out.print("X좌표:");
		x = in.nextInt();
		System.out.print("Y좌표:");
		y = in.nextInt();
		// logic
		if (x > 0) {
			if (y > 0) {
				location = 1;
			} else {
				location = 4;
			}
		} else {
			if (y > 0) {
				location = 2;
			} else {
				location = 3;
			}
		}
		if (x == 0 || y == 0) location = 0;

		// output
		if (location == 0) {
			System.out.printf("좌표[%d,%d]는 사분면이 아닙니다.", x, y);
			System.exit(0);
		} else {
			System.out.printf("좌표[%d,%d]는 %d사분면의 점입니다.", x, y, location);
			System.exit(0);
		}
	}// end of main
}// end of class