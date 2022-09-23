package Java.week1ToWeek4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 성적에 따라 출력하기
//		System.out.print("성적을 입력하세요: ");
//		int score = in.nextInt();
//		if (score < 0 && score > 100) {
//			System.out.println("잘못입력했음.");
//		} else if (score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 70) {
//			System.out.println("C");
//		} else if (score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		// 인사말 출력하기
		Date date = new Date();
		System.out.println("현재시간 " + date);
		int currentHour = date.getHours();

		if (currentHour < 11) {
			System.out.println("Good morning!");
		} else if (currentHour < 15) {
			System.out.println("Good afternoon");
		} else if (currentHour < 20) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}
	}// end of main
}// end of class