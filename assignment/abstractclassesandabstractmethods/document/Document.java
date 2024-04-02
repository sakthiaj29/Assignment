package assignment.abstractclassesandabstractmethods.document;

abstract class Document {

	abstract void open();
	
	abstract void close();

	 void read() {
		System.out.println("\nReading a Document.."); 
	 }
	
}
