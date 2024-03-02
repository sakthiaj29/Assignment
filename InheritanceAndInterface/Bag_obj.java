package InheritanceAndInterface;

public class Bag_obj {

	public static void main(String[] args) {
		//Bag ref and Bag obj
		System.out.println("Bag ref and Bag obj");
		System.out.println("--------------------");
		
		Bag bag1=new Bag();
		
		System.out.println(bag1.color);
		System.out.println(bag1.height);
		System.out.println(bag1.inkColor);
		bag1.open();
		bag1.close();
		bag1.store();
		bag1.write();
		bag1.clean();
		
		//Box ref and Bag obj
		System.out.println("\nBox ref and Bag obj");
		System.out.println("--------------------");
		
		Box bag2=new Bag();
		
		System.out.println(bag2.color);
		System.out.println(bag2.height);
		System.out.println(bag2.inkColor);
		bag2.open();
		bag2.close();
		bag2.store();
		bag2.write();
		bag2.clean();
		
		//Pen ref and Bag obj
		System.out.println("\nPen ref and Bag obj");
		System.out.println("--------------------");
		
		Pen bag3=new Bag();
		
		System.out.println(bag3.color);
		System.out.println(bag3.inkColor);
		bag3.open();
		bag3.close();
		bag3.write();
		bag3.clean();
	}

}
