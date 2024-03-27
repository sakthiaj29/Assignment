package assignment.overloadingoverridingpolymorphism.vehicleexample;

public class VehicleExamples {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle("ABC",10.4, 2002);
		vehicle.drive();
		System.out.println(vehicle);
		
		Vehicle car=new Car("Thar LX 3",70.0,2022,4);
		car.drive();
		System.out.println(car);
		
		Vehicle truck=new Truck("Tata Signa",75.0,2014,20500.0);
		truck.drive();
		System.out.println(truck);
	}

}