package Java.week1ToWeek4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 과제1 {
	public static void main(String[] args) throws IOException {
		String subject[] = { "국어", "영어", "수학" };
		// 점수 3개 입력받고 총점 평균 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double sum = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(subject[i] + ": ");
			sum += Integer.valueOf(br.readLine());
		}
		sum /= 3;
		System.out.printf("3과목의 평균 : %.2f", sum);
	}// end of main
}// end of class