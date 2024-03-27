package assignment.overloadingoverridingpolymorphism.shapexample;

class Rectangle extends Shape {

	public Rectangle(double base, double height) {

		super(base, height);

	}

	public void area() {
		area = base * height;
	}
	
	public void perimeter() {
		perimeter=2*(height+base);
	}
}