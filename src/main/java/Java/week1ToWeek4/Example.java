package Java.week1ToWeek4;

public class Example {
	public static void main(String[] args) {
		// 빛이 1년동안 가는 거리
		long lightspeed = 300_000;
		long d = lightspeed * 365 * 24 * 60 * 60;
		System.out.println("거리 : " + d + "km");
		// 원의 넓이 구하기
		double r, area;
		r = 5.0;
		area = 3.141592 * r * r;
		System.out.println("원의 면적 : " + area);
		// boolean test
		boolean b = true;
		System.out.println("b : " + b);
		b = 1 > 2;
		System.out.println("b : " + b);
		//

	}// end of main
}// end of class