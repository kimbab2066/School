package Java.week14;

public class Car {
	private String color;
	private int gear;
	private int speed;

	Car() {

	}

	Car(String c, int g, int s) {
		this.color = c;
		this.gear = g;
		this.speed = s;
	}

	void setColor(String c) {
		this.color = c;
	}

	void changeGear(int g) {
		this.gear = g;
	}

	void speedUp() {
		speed += 10;
	}

	void speedDown() {
		if (speed < 10)
			return;
		speed -= 10;
	}

	void print() {
		System.out.println(color + " " + gear + " " + speed);
	}

	@Override
	public String toString() {
		return color + " " + gear + " " + speed;
	}
}// class