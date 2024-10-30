package variousClass.annonymousClass.practice01;

abstract class Shape {

	public abstract double getArea();

	public abstract double getPerimeter();

}

public class Main {

	public static void main(String[] args) {

		Shape shape = new Shape() {

			double radious = 5.0;

			@Override
			public double getArea() {

				return radious * radious * Math.PI;
			}

			@Override
			public double getPerimeter() {
				return radious * 2 * Math.PI;
			}

		};

		System.out.println("Circle Area : " + shape.getArea());
		System.out.println("Circle Perimeter : " + shape.getPerimeter());

	}

}
