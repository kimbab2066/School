package Java.week1ToWeek4;

import java.util.Scanner;

public class 과제2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("달러 환율 입력 : ");
		float dollar = in.nextInt();
		System.out.print("환전할 금액(원) : ");
		int won = in.nextInt();

		System.out.printf(won + "원은 %.2f달러 입니다.", won / dollar);

	}// end of main
}// end of class