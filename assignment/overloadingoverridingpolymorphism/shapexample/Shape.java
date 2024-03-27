package assignment.overloadingoverridingpolymorphism.shapexample;

abstract class Shape {
	double base;
	double height;
	double area;
	double perimeter;

	public Shape(double height) {
		this.height = height;
	}

	public Shape(double base, double height) {
		this.base = base;
		this.height = height;

	}

	abstract public void area();

	abstract public void perimeter();

	public void show(String name) {
		System.out.println(name + " area is " + area + " & perimeter is " + perimeter);
	}

}