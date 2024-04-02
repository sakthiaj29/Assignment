package assignment.abstractclassesandabstractmethods.document;

public class ImageDocument extends Document{

	void open() {
		System.out.println("\nImageDocument opened");
	}

	void close() {
		System.out.println("\nImageDocument closed!");
	}

	void view() {
		System.out.println("\nViewing ImageDocument..");
	}
}
