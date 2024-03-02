package InheritanceAndInterface;

public class Pen_obj {

	public static void main(String[] args) {
		//Pen ref and Pen obj
		System.out.println("Pen ref and Pen obj");
		System.out.println("--------------------");
		
		Pen pen=new Pen();
		
		System.out.println(pen.color);
		//System.out.println(pen.height);
		System.out.println(pen.inkColor);
		pen.open();
		pen.close();
		//pen.Store();
		pen.write();
	}

}
