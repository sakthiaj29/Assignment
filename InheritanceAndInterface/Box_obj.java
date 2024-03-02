package InheritanceAndInterface;

public class Box_obj {

	public static void main(String[] args) {
		//Box ref and Box obj
		System.out.println("Box ref and Box obj");
		System.out.println("--------------------");
		
		Box box1=new Box();
		
		System.out.println(box1.color);
		System.out.println(box1.height);
		System.out.println(box1.inkColor);
		box1.open();
		box1.close();
		box1.store();
		box1.write();
		
		//Pen ref and Box obj
		System.out.println("\nPen ref and Box obj");
		System.out.println("--------------------");
		
		Pen box2=new Box();
		
		System.out.println(box2.color);
		//System.out.println(box2.height);
		System.out.println(box2.inkColor);
		box2.open();
		box2.close();
		//box2.Store();
		box2.write();
		
	}

}
