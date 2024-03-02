package InheritanceAndInterface;

public class Box_inter {

	public static void main(String[] args) {
		//Box interface and Box obj
		System.out.println("Box interface and Box obj");
		System.out.println("--------------------------");
		
		BoxInterface box=new Box();
		
		box.open();
		box.close();
		
		//
		System.out.println("\nBox interface2 and Box obj");
		System.out.println("--------------------------");
		
		BoxInterface2 box2=new Box();
		
		box2.color();
		box2.store();
		
		//Pen interface and Box obj
		System.out.println("\nPen interface and Box obj");
		System.out.println("--------------------------");
		
		PenInterface pen=new Box();
		
		pen.open();
		pen.write();
		
		//Pen interface2 and Box obj
		System.out.println("\nPen interface2 and Box obj");
		System.out.println("--------------------------");
		
		PenInterface2 pen2=new Box();
		
		pen2.close();
		pen2.open();
	}

}
