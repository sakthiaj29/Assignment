package assignment.abstractclassesandabstractmethods.document;

public class DocumentMain {

	public static void main(String[] args) {
		
		Document textDocument=new TextDocument();
		textDocument.open();
		textDocument.read();
		textDocument.close();
	
		Document pdfDocument=new PDFDocument();
		pdfDocument.open();
		pdfDocument.read();
		pdfDocument.close();
		
		Document imageDocument=new ImageDocument();
		imageDocument.open();
		imageDocument.close();
		imageDocument.read();
	}

}
