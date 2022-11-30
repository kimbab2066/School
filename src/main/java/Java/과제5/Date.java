package Java.과제5;

public class Date {
	int year;
	int month;
	int day;
	String[] mon = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	void setDay(int day) {
		this.day = day;
	}

	int getDay() {
		return this.day;
	}

	void print1() {
		System.out.println(year + "." + month + "." + day);
	}

	void print2() {
		System.out.println(mon[month - 1] + " " + day + ", " + year);
	}
}