package assignment.overloadingoverridingpolymorphism.vehicleexample;

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

	 public void start() {
			System.out.println("Truck is moving..");
		}
		
		public void stop() {
			System.out.println("Truck stoped!");
		}
		
	 public void drive() {
	     System.out.println("Driving truck..");
	 }

	 public String toString() {
	     return super.toString() + ", Load Capacity: " + loadCapacity + " kg";
	 }
	 
	}
