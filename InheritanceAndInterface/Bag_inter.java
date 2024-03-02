package InheritanceAndInterface;

public class Bag_inter {

	public static void main(String[] args) {
		//Bag interface and Bag obj
		System.out.println("Bag interface and Bag obj");
		System.out.println("--------------------------");
		
		BagInterface bag=new Bag();
		
		bag.close();
		bag.lock();
		
		//Box interface and Bag obj
		System.out.println("\nBox interface and Bag obj");
		System.out.println("--------------------------");
		
		BoxInterface box=new Bag();
		
		box.open();
		box.close();
		
		//Box interface2 and Bag obj
		System.out.println("\nBox interface2 and Bag obj");
		System.out.println("--------------------------");
		
		BoxInterface2 box2=new Bag();
		
		box2.color();
		box2.store();
		box2.write();
		
		//Pen interface and Bag obj
		System.out.println("\nPen interface and Bag obj");
		System.out.println("--------------------------");
		
		PenInterface pen=new Bag();
		
		pen.open();
		pen.write();
		
		//Pen interface2 and Bag obj
		System.out.println("\nPen interface2 and Bag obj");
		System.out.println("--------------------------");
		
		PenInterface2 pen2=new Bag();
		
		pen2.close();
		pen2.open();
		
	}

}
