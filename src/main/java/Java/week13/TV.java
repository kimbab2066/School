package Java.week13;

public class TV {
	private String name;
	private int year;
	private int inch;

	TV(String name, int y, int inch) {
		this.name = name;
		this.year = y;
		this.inch = inch;
	}

	void show() {
		System.out.printf("%s에서 만든 %d형 %d인치 TV", name, year, inch);
	}
}// class