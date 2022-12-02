package Java.week13;

public class Grade {
	private int math;
	private int science;
	private int english;

	Grade(int m, int s, int e) {
		this.math = m;
		this.science = s;
		this.english = e;
	}

	int average() {
		return (math + science + english) / 3;
	}
}// class