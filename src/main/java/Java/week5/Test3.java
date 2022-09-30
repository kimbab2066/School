package Java.week5;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int menu;
		double mile, km;
		System.out.println("*** 변환할 메뉴 선택 ***");
		System.out.println("1. mile -> km\n2. km -> mile");
		Scanner in = new Scanner(System.in);
		System.out.print("메뉴 선택 : ");
		menu = in.nextInt();
		if (menu == 1) {
			System.out.print("변환할 mile : ");
			mile = in.nextDouble();
			System.out.printf("%.0f mile은 %.2f km 입니다", mile, (mile * 1.6));
		} else if (menu == 2) {
			System.out.print("변환할 km : ");
			km = in.nextDouble();
			System.out.printf("%.0f km는 %.2f mile 입니다", km, (km / 1.6));
		}
		in.close();
	}// end of main
} // end of class