package assignment.overloadingoverridingpolymorphism.shapexample;

class Triangle extends Shape {

	public Triangle(double height, double base) {

		super(height, base);

	}

	public void area() {
		area = 0.5 * height * base;
	}
	
	public void perimeter() {
		perimeter=3*base;
	}
	
}