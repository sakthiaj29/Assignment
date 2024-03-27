package assignment.overloadingoverridingpolymorphism.vehicleexample;

public class Vehicle {

	protected String model;
	protected double speed;
	protected int year;

	public Vehicle(String model, double speed, int year) {
		this.speed = speed;
		this.model = model;
		this.year = year;
	}
	
	public void start() {
		System.out.println("Vehicle is moving..");
	}
	
	public void stop() {
		System.out.println("Vehicle stoped!");
	}
	
	public void drive() {
		System.out.println("Driving vehicle..");
	}
	
	public String toString() {
		return "Model: " + model + ", Speed: " + speed + ", Year: " + year;
	}
}
