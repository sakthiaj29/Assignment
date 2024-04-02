package assignment.abstractclassesandabstractmethods.product;

public class ClothingProduct extends Product{

	private String type;
	private int size;
	private String color;
	
	ClothingProduct(String name, String model, String brand, int size, double price, String type, String color){
		super(name, model, brand, price);
		this.type=type;
		this.color=color;
		this.size=size;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return " Name: "+name+"\n Model: "+model+"\n Size: "+size+"\n Price: "+price+"\n Metrial Type: "+type+"\n Color: "+color;
	}
}
