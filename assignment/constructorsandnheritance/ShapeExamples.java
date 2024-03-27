package assignment.constructorsandnheritance;

public class ShapeExamples {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(30, 40);
		rectangle.area();
		rectangle.show("Rectangle");

		Shape square = new Square(10);
		square.area();
		square.show("Square");

		Shape triangle = new Triangles(10, 20);
		triangle.area();
		triangle.show("Triangles");

		Shape circle = new Circle(10);
		circle.area();
		circle.show("Circle");

	}

}

abstract class Shape {
	double base;
	double height;
	double a;

	public Shape(double height) {
		this.height = height;
	}

	public Shape(double base, double height) {
		this.base = base;
		this.height = height;

	}

	abstract public void area();

	public void show(String name) {
		System.out.println(name + " area is " + a);
	}
}

class Circle extends Shape {

	public Circle(double height) {

		super(height);

	}

	public void area() {
		a = 3.1415 * height * height;
	}
}

class Rectangle extends Shape {

	public Rectangle(double base, double height) {

		super(base, height);

	}

	public void area() {
		a = base * height;
	}
}

class Square extends Shape {

	public Square(double height) {

		super(height);

	}

	public void area() {
		a = height * height;
	}
}

class Triangles extends Shape {

	public Triangles(double height, double base) {

		super(height, base);

	}

	public void area() {
		a = 0.5 * height * base;
	}
}
