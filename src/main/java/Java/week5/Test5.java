package Java.week5;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// LAB : 월의 이름을 월로 반환
//		System.out.print("월의 이름을 입력하시오 : ");
//		String month = in.nextLine();
//		System.out.println(month(month));
		// LAB : 월의 일수 출력하기
		System.out.print("일수를 알고 싶은 월을 입력하시오 : ");
		int month = in.nextInt();
		System.out.println(month + "월의 날수는 " + day(month));
		
		
	}// end of main

	static int day(int month) {
		int result = 0;
		switch (month) {
		default:
			result = 31;
			break;
		case 2:
			result = 28;
		case 4:case 6:case 9:case 11:
			result = 30;
		}
		return result;
	}

	static int month(String str) {
		int result = 0;
		switch (str) {
		case "january":
			result = 1;
			break;
		case "febuary":
			result = 2;
			break;
		case "march":
			result = 3;
			break;
		default:
			result = 0;
			break;
		}
		return result;
	}// end of month
}// end of class