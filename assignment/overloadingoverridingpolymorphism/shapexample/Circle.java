package assignment.overloadingoverridingpolymorphism.shapexample;

class Circle extends Shape {

	public Circle(double height) {

		super(height);

	}

	public void area() {
		area = 3.1415 * height * height;
	}
	
	public void perimeter() {
		perimeter=2*(3.1415)*height;
	}
}
