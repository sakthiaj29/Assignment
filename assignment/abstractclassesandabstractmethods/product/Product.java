package assignment.abstractclassesandabstractmethods.product;

abstract class Product {

	protected String name;
	protected String model;
	protected String brand;
	protected double price;
	
	Product(String name, String model, String brand, double price){
		this.name=name;
		this.model=model;
		this.brand=brand;
		this.price=price;
	}
	
	abstract double getPrice();
	
	abstract String getDescription();
	
}
