package InheritanceAndInterface;

public class Pen_inter {

	public static void main(String[] args) {
		//Pen interface and Pen obj
		System.out.println("Pen interface and Pen obj");
		System.out.println("--------------------------");
		
		PenInterface pen=new Pen();
		
		pen.open();
		pen.write();
		
		//Pen interface2 and Pen obj
		System.out.println("\nPen interface2 and Pen obj");
		System.out.println("--------------------------");
		
		PenInterface2 pen2=new Pen();
		
		pen2.open();
		pen2.close();
	}

}
