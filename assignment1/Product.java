package assignment1;

public class Product {
	
	String productName;
	byte productCart;
	short productCount;
	int productId;
	long productEmisNumber;
	float productOfferPrice;
	double productPrice;
	
	public static void main(String[] args) {
		
		Product product = new Product();
		System.out.println(product.productName);
		System.out.println(product.productCart);
		System.out.println(product.productCount);
		System.out.println(product.productId);
		System.out.println(product.productEmisNumber);
		System.out.println(product.productOfferPrice);
		System.out.println(product.productPrice);
	}

}
