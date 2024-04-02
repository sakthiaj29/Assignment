package assignment.abstractclassesandabstractmethods.document;

public class TextDocument extends Document{

	void open() {
		System.out.println("\nTextDocument opened");
	}

	void close() {
		System.out.println("\nTextDocument closed!");
	}
	
	void read() {
		System.out.println("\nReading TextDocument..");
	}
}
