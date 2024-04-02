package assignment.abstractclassesandabstractmethods.product;

public class BookProduct extends Product{

	private int noPages;
	
	BookProduct(String name, String model, String brand, double price, int noPages){
		super(name, model, brand, price);
		this.noPages=noPages;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return " Name: "+name+"\n Model: "+model+"\n Price: "+price+"\n Total number of Pages: "+noPages;
	}
}
