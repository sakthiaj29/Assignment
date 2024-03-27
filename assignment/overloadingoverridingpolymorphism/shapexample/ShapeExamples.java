package assignment.overloadingoverridingpolymorphism.shapexample;

public class ShapeExamples {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(30, 40);
		rectangle.area();
		rectangle.perimeter();
		rectangle.show("\nRectangle");

		Shape square = new Square(10);
		square.area();
		square.perimeter();
		square.show("\nSquare");

		Shape triangle = new Triangle(10, 20);
		triangle.area();
		triangle.perimeter();
		triangle.show("\nTriangles");

		Shape circle = new Circle(10);
		circle.area();
		circle.perimeter();
		circle.show("\nCircle");

	}

}

