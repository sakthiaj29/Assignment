package assignment.overloadingoverridingpolymorphism.vehicleexample;


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

	public void start() {
		System.out.println("Car is moving..");
	}
	
	public void stop() {
		System.out.println("Car stoped!");
	}
	
	public void drive() {
		System.out.println("Drving car..");
	}

	public String toString() {
		return super.toString() + ", Seats: " + numberOfSeats;
	}
}