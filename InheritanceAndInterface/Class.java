package InheritanceAndInterface;

class Pen implements PenInterface, PenInterface2{
	String color="Pen color Black";
	String inkColor="Pen ink color Blue";
	String length="Pen length 6cm";
	 
	public void open() {
		System.out.println("Pen-open");
	}
	public void close() {
		System.out.println("Pen-close");
	}
	public void write() {
		System.out.println("Pen-writing");
	}
	static void clean() {
		System.out.println("Pen-cleaning");
	}
}
class Box extends Pen implements PenInterface, PenInterface2, BoxInterface, BoxInterface2 {
	String color="Box color Red";
	String length="Box length 10cm";
	String height="Box height 5cm";
	public void open() {
		System.out.println("Box-open");
	}
	public void close() {
		System.out.println("Box-close");
	}
	public void store() {
		System.out.println("Box-storing");
	}
	public void color() {
		System.out.println("Box-coloring");
	}
	static void clean() {
		System.out.println("Box-cleaning");
	}
}

class Bag extends Box implements PenInterface, PenInterface2, BoxInterface, BoxInterface2, BagInterface{
	String color="Bag color Sky-blue";
	String capacity="Bag capacity large";
	int no_Zip=5;
	public void open() {
		System.out.println("Bag-open");
	}
	public void close() {
		System.out.println("Bag-close");
	}
	public void lock() {
		System.out.println("Bag-lock");
	}
	public void zip() {
		System.out.println("Bag-ziping");
	}
	static void clean() {
		System.out.println("Bag-cleaning");
	}
}
