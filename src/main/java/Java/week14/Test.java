package Java.week14;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		test4();
	}// main

	static void test1() {
		ArrayList<Car> list = new ArrayList<>();
		Car c = new Car();
		list.add(c);
		System.out.print("print1:");
		c.print();
		//
		c.changeGear(1);
		c.speedUp();
		c.setColor("Gray");
		System.out.print("print2:");
		c.print();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		System.out.println(c);
		System.out.println("여기");
//		for (Car c1 : list) System.out.println(c1);
	}// test1

	static void test2() {
		MyMath math = new MyMath();
		System.out.println(math.square(10));
		System.out.println(math.square(3.14));
		// Anonymous Object
		System.out.println(new MyMath().square(20));
		System.out.println(new MyMath().square(30.4));
	}// test2

	static void test3() {
		Car c = new Car("Red", 3, 100);
		c.print();
	}// test3

	static void test4() {
		String str = new String("Hello World!");
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(str.length() - 1));

		System.out.println(str.concat("Fello World!"));
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.equalsIgnoreCase("hello world!"));

		System.out.println(str.toUpperCase());
		
		
	}// test4
}// class