package assignment.abstractclassesandabstractmethods.document;

public class PDFDocument extends Document{

	
	void open() {
		System.out.println("\nPDFDocument opened");
	}

	void close() {
		System.out.println("\nPDFDocument closed!");
	}

	void read() {
		System.out.println("\nReading PDFDocument..");
	}
}
