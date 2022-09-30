package Java.week5;

import java.util.Scanner;

//연습문제용
public class Test6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(conVo(str));
	}// end of main

	// 14번(수정해야됨 문자 1개의 모음 자음을 찾아라)
	static String conVo(String str) {
		int con = 0;
		int vo = 0;
		String conC = "", voC = "";
		for (int i = 0; i < str.length(); i++) {
			char alpha = str.charAt(i);
			switch (alpha) {
			case 'a':case 'A':case 'o':case 'O':
			case 'u':case 'U':case 'i':case 'I':
			case 'e':case 'E':
				vo += 1;
				voC += alpha;
				break;
			default:
				con += 1;
				conC += alpha;
				break;
			}
		}
		System.out.println("자음: " + conC + " 모음: " + voC);
		return "자음의 개수 : " + con + " 모음의 개수 : " + vo;
	}// end of conVo
}// end of class