package assignment.abstractclassesandabstractmethods.product;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

	 private List<Product> productList=new ArrayList<>();
	
	public void add() {
		Product electronicsProduct=new ElectronicsProduct("ASUS NoteBook", "X1100", "ASUS", 32000.0, "4.5 Star", 3.5);
		productList.add(electronicsProduct);
		
		Product clothingProduct=new ClothingProduct("CASUAL SHIRT", "SLIM FIT STRIPE", "OTTO", 30, 1200.0, "100% Cottan", "Sky Blue");
		productList.add(clothingProduct);
		
		Product bookProduct=new BookProduct("Spiral Binding Notebook", "Soft Cover 6 Subject note", "Classmate", 120.0, 350);
		productList.add(bookProduct);
		
		totalPrice();
		
		displayProduct();
	}
	
	public void displayProduct() {
		
		for(Product product:productList) {
			System.out.println("\n-----------------------------------------");
			System.out.println( product.getDescription() );
		}
		System.out.println("\n-----------------------------------------");
	}
	
	public void totalPrice() {
		
		double totalAmount=0.0;
		
		for(Product product:productList) {
			totalAmount+=product.getPrice();
		}
		
		System.out.println("Total Amount: "+totalAmount);
	}
	public static void main(String[] args) {

		ProductMain productMain =new ProductMain(); 
		productMain.add();
	}

}
