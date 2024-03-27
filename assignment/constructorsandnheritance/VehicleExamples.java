package assignment.constructorsandnheritance;

public class VehicleExamples {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle("ZZZ",20.0, 2000);
		vehicle.drive();
		System.out.println(vehicle);
		
		Vehicle car=new Car("Thar LX 4",80.0,2024,4);
		car.drive();
		System.out.println(car);
		
		Vehicle truck=new Truck("Tata Signa",70.0,2012,18500.0);
		truck.drive();
		System.out.println(truck);
	}

}

class Vehicle {

	protected String model;
	protected double speed;
	protected int year;

	public Vehicle(String model, double speed, int year) {
		this.speed = speed;
		this.model = model;
		this.year = year;
	}

	public void drive() {
		System.out.println("Vehicle is moving.");
	}

	public String toString() {
		return "Model: " + model + ", Speed: " + speed + ", Year: " + year;
	}

}

class Car extends Vehicle {
	private int numberOfSeats;

	public Car(String model, double speed, int year, int numberOfSeats) {
		super(model, speed, year);
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public void drive() {
		System.out.println("Car is moving.");
	}

	public String toString() {
		return super.toString() + ", Seats: " + numberOfSeats;
	}
}

class Truck extends Vehicle {
 private double loadCapacity;

 public Truck(String model,double speed, int year, double loadCapacity) {
     super(model, speed, year);
     this.loadCapacity = loadCapacity;
 }

 public double getLoadCapacity() {
     return loadCapacity;
 }

 public void setLoadCapacity(double loadCapacity) {
     this.loadCapacity = loadCapacity;
 }

 public void drive() {
     System.out.println("Truck is moving.");
 }

 public String toString() {
     return super.toString() + ", Load Capacity: " + loadCapacity + " kg";
 }
}
