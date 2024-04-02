package assignment.abstractclassesandabstractmethods.product;

public class ElectronicsProduct extends Product {

	private  String starRating;
	private double inputVoltage;
	
	ElectronicsProduct(String name, String model, String brand, double price, String starRating, double inputVoltage){
		super(name, model, brand, price);
		this.starRating=starRating;
		this.inputVoltage=inputVoltage;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return " Name: "+name+"\n Model: "+model+"\n Price: "+price+"\n Star Rating: "+starRating+"\n Input Voltage: "+inputVoltage;
	}
	
}
