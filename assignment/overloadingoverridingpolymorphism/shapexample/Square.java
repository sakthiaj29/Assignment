package assignment.overloadingoverridingpolymorphism.shapexample;

class Square extends Shape {

	public Square(double height) {

		super(height);

	}

	public void area() {
		area = height * height;
	}
	
	public void perimeter() {
		perimeter=4*height;
	}
	
}
